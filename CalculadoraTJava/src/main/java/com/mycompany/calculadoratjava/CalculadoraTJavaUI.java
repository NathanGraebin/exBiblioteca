/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadoratjava;

/**
 *
 * @author User
 */
public class CalculadoraTJavaUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraTJavaUI
     */
    public CalculadoraTJavaUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritaNumero1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumero1 = new javax.swing.JTextArea();
        escritaNumero2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNumero2 = new javax.swing.JTextArea();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritaNumero1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        escritaNumero1.setText("Numero1");

        txtNumero1.setColumns(1);
        txtNumero1.setRows(1);
        txtNumero1.setTabSize(1);
        jScrollPane1.setViewportView(txtNumero1);

        escritaNumero2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        escritaNumero2.setText("Numero2");

        txtNumero2.setColumns(1);
        txtNumero2.setRows(1);
        txtNumero2.setTabSize(1);
        jScrollPane2.setViewportView(txtNumero2);

        btnSomar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSomar.setText("+");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(1);
        txtResultado.setTabSize(1);
        jScrollPane3.setViewportView(txtResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnSomar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSubtrair)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMultiplicar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDividir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(escritaNumero2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(escritaNumero1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritaNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(escritaNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDividir)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnSubtrair)
                    .addComponent(btnSomar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
         //captura as informações digitadas nas caixas 
       String strNumero1 = txtNumero1.getText();
       String strNumero2 = txtNumero2.getText();
       
       //Converte String para INT
       int n1 = Integer.parseInt(strNumero1);
       int n2= Integer.parseInt(strNumero2);
       
       
       //Com o numero convertido, faz a equação
       int resultado = n1 * n2;
       
       //Apos finalizara a equação
       //converte de INT para String
       String strResultado = String.valueOf(resultado);
       
       //Apresenta o resultado na caixa
       txtResultado.setText(strResultado);
        
                
        
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
       
       //captura as informações digitadas nas caixas 
       String strNumero1 = txtNumero1.getText();
       String strNumero2 = txtNumero2.getText();
       
       //Converte String para INT
       int n1 = Integer.parseInt(strNumero1);
       int n2= Integer.parseInt(strNumero2);
       
       
       //Com o numero convertido, faz a equação
       int resultado = n1 / n2;
       
       //Apos finalizara a equação
       //converte de INT para String
       String strResultado = String.valueOf(resultado);
       
       //Apresenta o resultado na caixa
       txtResultado.setText(strResultado);
        
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
       
        //captura as informações digitadas nas caixas 
       String strNumero1 = txtNumero1.getText();
       String strNumero2 = txtNumero2.getText();
       
       //Converte String para INT
       int n1 = Integer.parseInt(strNumero1);
       int n2= Integer.parseInt(strNumero2);
       
       
       //Com o numero convertido, faz a equação
       int resultado = n1 + n2;
       
       //Apos finalizara a equação
       //converte de INT para String
       String strResultado = String.valueOf(resultado);
       
       //Apresenta o resultado na caixa
       txtResultado.setText(strResultado);
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
       
//captura as informações digitadas nas caixas 
       String strNumero1 = txtNumero1.getText();
       String strNumero2 = txtNumero2.getText();
       
       //Converte String para INT
       int n1 = Integer.parseInt(strNumero1);
       int n2= Integer.parseInt(strNumero2);
       
       
       //Com o numero convertido, faz a equação
       int resultado = n1 - n2;
       
       //Apos finalizara a equação
       //converte de INT para String
       String strResultado = String.valueOf(resultado);
       
       //Apresenta o resultado na caixa
       txtResultado.setText(strResultado);
       
       txtNumero1.setText("");
       txtNumero2.setText("");
    }//GEN-LAST:event_btnSubtrairActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraTJavaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTJavaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTJavaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTJavaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTJavaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel escritaNumero1;
    private javax.swing.JLabel escritaNumero2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtNumero1;
    private javax.swing.JTextArea txtNumero2;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
