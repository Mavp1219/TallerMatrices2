/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumerofilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumerocolumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumerodeFilas1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumerodeColumnas1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNumerodeFilas3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumerodeColumnas3 = new javax.swing.JTextField();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmboperaciones = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FORMAS MATRICES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 32, 270, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Num. de filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 90, 20));
        jPanel2.add(txtNumerofilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 30, -1));

        jLabel3.setText("Num. de Columnas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 120, 20));
        jPanel2.add(txtNumerocolumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No. de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel3.add(txtNumerodeFilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel5.setText("No. de Columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel3.add(txtNumerodeColumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 60));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("No. de Filas:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel5.add(txtNumerodeFilas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel9.setText("No. de Columnas: ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel5.add(txtNumerodeColumnas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 430, 60));

        cmboperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Letra B", "Letra K", "Letra W", "Letra M", "Letra Q", "Letra J", "Letra G", "Letra R" }));
        cmboperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboperacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cmboperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 210, 30));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaInicial.setEnabled(false);
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 380, 220));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("=");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 307, 30, 20));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTablaResultado.setEnabled(false);
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 380, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 860, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        try {
            if (txtNumerofilas.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Elementos de la fila Vacios");
                txtNumerofilas.selectAll();
                txtNumerofilas.requestFocusInWindow();
            }
            if (txtNumerocolumnas.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Elementos de la columna Vacios");
                txtNumerocolumnas.selectAll();
                txtNumerocolumnas.requestFocusInWindow();
            } else {
                int nf, nc;
                DefaultTableModel tm, tm2;
                nf = Integer.parseInt(txtNumerofilas.getText());
                nc = Integer.parseInt(txtNumerocolumnas.getText());
                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm2 = (DefaultTableModel) tblTablaResultado.getModel();
                if (nf >= 13 && nc >= 13) {
                   Helper.mensaje(this, "La matriz se pasa de lo establecido", "Error", 2);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtNumerofilas.setText("");
                    txtNumerocolumnas.setText("");
                    txtNumerofilas.requestFocusInWindow();
                } if (nf <= 3 && nc <= 3) {
                    Helper.mensaje(this, "La matriz es demasiado pequeña", "Error", 2);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtNumerofilas.setText("");
                    txtNumerocolumnas.setText("");
                    txtNumerofilas.requestFocusInWindow();
                }
                else {
                    tm.setRowCount(nf);
                    tm.setColumnCount(nc);
                    tm2.setRowCount(nf);
                    tm2.setColumnCount(nc);
                    txtNumerocolumnas.setEditable(false);
                    txtNumerofilas.setEditable(false);
                    JButton botonesH[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdLimpiar};
                    JButton botonesD[] = {cmdCrear, cmdOperacion};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
            }
        } catch (NumberFormatException e) {
            Helper.mensaje(this, "Ingrese bien los datos", "Error", 2);
            txtNumerofilas.setText("");
            txtNumerocolumnas.setText("");
            txtNumerofilas.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc, res, aux;
        double n;
        boolean sw = true;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.recibirDatos(this, "Digite el valor en la posición: [" + i + "][" + j + "]"));
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir del llenado manual?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nc;
                            i = nf;
                            sw = false;
                            Helper.tablaPorDefecto(tblTablaInicial);
                            Helper.tablaPorDefecto(tblTablaResultado);
                            txtNumerocolumnas.setText("");
                            txtNumerofilas.setText("");
                            txtNumerofilas.requestFocusInWindow();
                            JButton botonesD[] = {cmdOperacion};
                            Helper.deshabilitarBotones(botonesD);
                        } else {
                            aux = 0;
                        }
                    }
                } while (aux == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;
        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, nf, nc, aux;
        op = cmboperaciones.getSelectedIndex();
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        Helper.limpiarTabla(tblTablaResultado);
        switch (op) {
            case 0:
            Helper.LetraB(tblTablaInicial, tblTablaResultado);
            break;
            case 1:
            Helper.LetraK(tblTablaInicial, tblTablaResultado);
            break;
            case 2:
            Helper.LetraM(tblTablaInicial, tblTablaResultado);
            break;
            case 3: 
            Helper.LetraW(tblTablaInicial, tblTablaResultado);
            break;
            case 4: 
            Helper.LetraQ(tblTablaInicial, tblTablaResultado);
            break;
        }                        
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        Helper.tablaPorDefecto(tblTablaInicial);
        Helper.tablaPorDefecto(tblTablaResultado);
        txtNumerofilas.setText("");
        txtNumerocolumnas.setText("");
        txtNumerofilas.requestFocusInWindow();
        cmboperaciones.setSelectedIndex(0);
        txtNumerocolumnas.setEditable(true);
        txtNumerofilas.setEditable(true);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoAutomatico, cmdLlenadoManual, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmboperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboperacionesActionPerformed

    }//GEN-LAST:event_cmboperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmboperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumerocolumnas;
    private javax.swing.JTextField txtNumerodeColumnas1;
    private javax.swing.JTextField txtNumerodeColumnas3;
    private javax.swing.JTextField txtNumerodeFilas1;
    private javax.swing.JTextField txtNumerodeFilas3;
    private javax.swing.JTextField txtNumerofilas;
    // End of variables declaration//GEN-END:variables
}
