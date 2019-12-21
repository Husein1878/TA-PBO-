package gui;

public class proses extends atribut implements Bilangan{

    @Override
    public String Desimal() {
        if (getBilangan_ke() == "Hexadesimal"){
            setHasil(Integer.parseInt(getData()));
            setData(Integer.toHexString(getHasil()));
        }
        else if (getBilangan_ke()== "Biner"){
            setHasil(Integer.parseInt(getData()));
            setData(Integer.toBinaryString(getHasil()));
        }
        else if (getBilangan_ke()== "Oktal"){
            setHasil(Integer.parseInt(getData()));
            setData(Integer.toOctalString(getHasil()));
        }
        return getData();
    }

    @Override
    public String Biner() {
        if (getBilangan_ke() == "Hexadesimal"){
            setHasil(Integer.parseInt(getData(),2));
            setData(Integer.toHexString(getHasil()));
        }
        else if (getBilangan_ke()== "Decimal"){
            setHasil(Integer.parseInt(getData(),2));
            setData(Integer.toString(getHasil()));
        }
        else if (getBilangan_ke()== "Oktal"){
            setHasil(Integer.parseInt(getData(),2));
            setData(Integer.toOctalString(getHasil()));
        }
        return getData();
    }

    @Override
    public String Oktal() {
        if (getBilangan_ke() == "Hexadesimal"){
            setHasil(Integer.parseInt(getData(),8));
            String hasil = Integer.toString(getHasil());
            setHasil(Integer.parseInt(hasil));
            setData(Integer.toHexString(getHasil()));
        }
        else if (getBilangan_ke()== "Biner"){
            setHasil(Integer.parseInt(getData(),8));
            String hasil = Integer.toString(getHasil());
            setHasil(Integer.parseInt(hasil));
            setData(Integer.toBinaryString(getHasil()));
        }
        else if (getBilangan_ke()== "Decimal"){
            setHasil(Integer.parseInt(getData(),8));
            setData(Integer.toString(getHasil()));
        }
        return getData();
    }

    @Override
    public String Hexadesimal() {
        if (getBilangan_ke() == "Decimal"){
            setHasil(Integer.parseInt(getData(),16));
            setData(Integer.toString(getHasil()));
        }
        else if (getBilangan_ke()== "Biner"){
            setHasil(Integer.parseInt(getData(),16));
            String hasil = Integer.toString(getHasil());
            setHasil(Integer.parseInt(hasil));
            setData(Integer.toBinaryString(getHasil()));
        }
        else if (getBilangan_ke()== "Oktal"){
            setHasil(Integer.parseInt(getData(),16));
            String hasil = Integer.toString(getHasil());
            setHasil(Integer.parseInt(hasil));
            setData(Integer.toOctalString(getHasil()));
        }
        return getData();
    }
    
}
