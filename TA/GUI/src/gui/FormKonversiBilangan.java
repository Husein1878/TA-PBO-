package gui;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

/**
 *
 * @author muhammad
 */
public class FormKonversiBilangan extends javax.swing.JFrame {

    proses pro = new proses();
        
    public FormKonversiBilangan() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_data = new javax.swing.JLabel();
        output_data = new javax.swing.JLabel();
        bilangan_dari = new javax.swing.JComboBox();
        bilangan_ke = new javax.swing.JComboBox();
        input_bilangan = new javax.swing.JTextField();
        output_bilangan = new javax.swing.JTextField();
        konversi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("KONVERSI BILANGAN");

        jLabel2.setText("Dari : ");

        jLabel3.setText("Ke :");

        input_data.setText("INPUT       :");

        output_data.setText("OUTPUT    :");

        bilangan_dari.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hexadesimal", "Decimal", "Biner", "Oktal" }));
        bilangan_dari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilangan_dariActionPerformed(evt);
            }
        });

        bilangan_ke.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hexadesimal", "Decimal", "Biner", "Oktal" }));
        bilangan_ke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilangan_keActionPerformed(evt);
            }
        });

        output_bilangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output_bilanganActionPerformed(evt);
            }
        });

        konversi.setText("KONVERSI");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bilangan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(bilangan_ke, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_data)
                            .addComponent(output_data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(output_bilangan, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(konversi))
                            .addComponent(input_bilangan, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(bilangan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilangan_ke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_data)
                    .addComponent(input_bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(konversi)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output_bilangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output_data))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bilangan_dariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilangan_dariActionPerformed
        if (bilangan_dari.getSelectedItem() == "Decimal"){
            input_data.setText(" Input Decimal     : ");
        }
        if (bilangan_dari.getSelectedItem() == "Biner"){
            input_data.setText(" Input Biner       : ");
        }
        if (bilangan_dari.getSelectedItem() == "Hexadecimal"){
            input_data.setText(" Input Hexadecimal : ");
        }
        if (bilangan_dari.getSelectedItem() == "Oktal"){
            input_data.setText(" Input Oktal       : ");
        }
    }//GEN-LAST:event_bilangan_dariActionPerformed

    private void bilangan_keActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilangan_keActionPerformed
        
        if (bilangan_ke.getSelectedItem() == "Decimal"){
            output_data.setText(" Output Decimal : ");
        }
        if (bilangan_ke.getSelectedItem() == "Biner"){
            output_data.setText(" Output Biner : ");
        }
        if (bilangan_ke.getSelectedItem() == "Hexadecimal"){
            output_data.setText(" Output Hexadecimal : ");
        }
        if (bilangan_ke.getSelectedItem() == "Oktal"){
            output_data.setText(" Output Oktal : ");
        }
    }//GEN-LAST:event_bilangan_keActionPerformed

    private void output_bilanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output_bilanganActionPerformed
        
    }//GEN-LAST:event_output_bilanganActionPerformed

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        try{
            
            pro.setBilangan_ke((String)bilangan_ke.getSelectedItem());
            pro.setData((String)input_bilangan.getText());
            
            if(bilangan_dari.getSelectedItem() == "Hexadesimal"){
                output_bilangan.setText(pro.Hexadesimal());
               
            }
            
            //konversi oktal
            else if (bilangan_dari.getSelectedItem() == "Oktal"){
                output_bilangan.setText(pro.Oktal());
            }
            
            // konversi biner
            else if (bilangan_dari.getSelectedItem() == "Biner" ){
                output_bilangan.setText(pro.Biner());
            }
            
            //konversi desimal
            else if (bilangan_dari.getSelectedItem() == "Decimal"){
                output_bilangan.setText(pro.Desimal());
            }
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Input Tidak Benar");
            NullPointerException();
        }
           
    }//GEN-LAST:event_konversiActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormKonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKonversiBilangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKonversiBilangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bilangan_dari;
    private javax.swing.JComboBox bilangan_ke;
    private javax.swing.JTextField input_bilangan;
    private javax.swing.JLabel input_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton konversi;
    private javax.swing.JTextField output_bilangan;
    private javax.swing.JLabel output_data;
    // End of variables declaration//GEN-END:variables

    private void NullPointerException() {
        System.out.println("error: " + getWarningString());
    }
}
