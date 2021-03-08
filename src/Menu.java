
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class Menu extends javax.swing.JFrame {
Cuenta cuentas;
    /**
     * Creates new form Menu
     * @param cuentas
     */
    public Menu(Cuenta cuentas){
        this.cuentas=cuentas;
        initComponents();
        scaleImage1();
        txtNombre.setText(cuentas.getNombre()+" "+cuentas.getApellido());
        txtCuenta.setText(cuentas.getNumeroDeCuenta()+" ");
        txtTipo.setText(cuentas.getTipoCuenta());
        txtSaldo.setText(cuentas.getCapital()+"");
        
    }
    
    public Menu() {
        initComponents();
        scaleImage1();
    }
 public void scaleImage1(){
        ImageIcon icon=new ImageIcon("C:\\kharol\\poli\\Segundo semestre\\programacion\\Proyecto\\1614646367528.png");
        Image img=icon.getImage();
        Image imgScale=img.getScaledInstance(lblLogo.getWidth(),lblLogo.getHeight() ,Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        lblLogo.setIcon(scaledIcon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlBorde2 = new javax.swing.JPanel();
        lblIcono6 = new javax.swing.JLabel();
        lblIcono7 = new javax.swing.JLabel();
        lblIcono8 = new javax.swing.JLabel();
        pnlPagos = new javax.swing.JPanel();
        lblIcono2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnlPrestamos = new javax.swing.JPanel();
        lblIcono3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblIcono1 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        lblSaldo1 = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JTextField();
        pnlRetiro = new javax.swing.JPanel();
        lblIcono4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlRecargas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblIcono5 = new javax.swing.JLabel();
        pnlBorde1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlDepositos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlRecargas1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblIcono9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlBorde2.setBackground(new java.awt.Color(69, 159, 156));

        lblIcono6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_facebook_24px.png"))); // NOI18N

        lblIcono7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_instagram_24px_1.png"))); // NOI18N

        lblIcono8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_twitter_24px.png"))); // NOI18N

        javax.swing.GroupLayout pnlBorde2Layout = new javax.swing.GroupLayout(pnlBorde2);
        pnlBorde2.setLayout(pnlBorde2Layout);
        pnlBorde2Layout.setHorizontalGroup(
            pnlBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorde2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblIcono6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcono7)
                .addGap(108, 108, 108)
                .addComponent(lblIcono8)
                .addGap(54, 54, 54))
        );
        pnlBorde2Layout.setVerticalGroup(
            pnlBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorde2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBorde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBorde2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIcono6))
                    .addComponent(lblIcono7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBorde2Layout.createSequentialGroup()
                        .addComponent(lblIcono8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPagosMouseClicked(evt);
            }
        });

        lblIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_house_with_a_garden_30px.png"))); // NOI18N

        jLabel7.setText("Pagos");

        javax.swing.GroupLayout pnlPagosLayout = new javax.swing.GroupLayout(pnlPagos);
        pnlPagos.setLayout(pnlPagosLayout);
        pnlPagosLayout.setHorizontalGroup(
            pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPagosLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblIcono2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        pnlPagosLayout.setVerticalGroup(
            pnlPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcono2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPrestamosMouseClicked(evt);
            }
        });

        lblIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cash_in_hand_32px.png"))); // NOI18N
        lblIcono3.setText("jLabel3");

        jLabel8.setText("Préstamos");

        javax.swing.GroupLayout pnlPrestamosLayout = new javax.swing.GroupLayout(pnlPrestamos);
        pnlPrestamos.setLayout(pnlPrestamosLayout);
        pnlPrestamosLayout.setHorizontalGroup(
            pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIcono3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlPrestamosLayout.setVerticalGroup(
            pnlPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcono3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_customer_32px.png"))); // NOI18N
        jPanel6.add(lblIcono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 19, 34, -1));

        lblSaldo.setText("Saldo disponible");
        jPanel6.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lblNumero.setText("Tipo de cuenta");
        jPanel6.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNombre.setBackground(new java.awt.Color(240, 240, 240));
        txtNombre.setText("NOmbre");
        txtNombre.setBorder(null);
        jPanel6.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 160, 20));

        jLabel1.setText("Nombre");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 47, -1));

        lblNumero1.setText("Número de cuenta");
        jPanel6.add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtSaldo.setBackground(new java.awt.Color(240, 240, 240));
        txtSaldo.setText("saldo");
        txtSaldo.setBorder(null);
        jPanel6.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, 20));

        txtTipo.setBackground(new java.awt.Color(240, 240, 240));
        txtTipo.setText("numero de cuenta");
        txtTipo.setBorder(null);
        jPanel6.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, 20));

        txtCuenta.setBackground(new java.awt.Color(240, 240, 240));
        txtCuenta.setText("numero de cuenta");
        txtCuenta.setBorder(null);
        jPanel6.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, 20));

        lblSaldo1.setText("Número de tarjeta");
        jPanel6.add(lblSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtTarjeta.setBackground(new java.awt.Color(240, 240, 240));
        txtTarjeta.setText("saldo");
        txtTarjeta.setBorder(null);
        jPanel6.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, 20));

        pnlRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRetiroMouseClicked(evt);
            }
        });
        pnlRetiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_pos_terminal_26px.png"))); // NOI18N
        pnlRetiro.add(lblIcono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 34, -1));

        jLabel9.setText("Retiros");
        pnlRetiro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 48, 40, -1));

        pnlRecargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRecargasMouseClicked(evt);
            }
        });
        pnlRecargas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Recargas");
        pnlRecargas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblIcono5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_phone_26px_1.png"))); // NOI18N
        pnlRecargas.add(lblIcono5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlBorde1.setBackground(new java.awt.Color(69, 159, 156));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENÚ PRINCIPAL");

        javax.swing.GroupLayout pnlBorde1Layout = new javax.swing.GroupLayout(pnlBorde1);
        pnlBorde1.setLayout(pnlBorde1Layout);
        pnlBorde1Layout.setHorizontalGroup(
            pnlBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorde1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlBorde1Layout.setVerticalGroup(
            pnlBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorde1Layout.createSequentialGroup()
                .addGroup(pnlBorde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBorde1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBorde1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlDepositos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDepositosMouseClicked(evt);
            }
        });
        pnlDepositos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_wallet_32px.png"))); // NOI18N
        pnlDepositos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 37, -1));

        jLabel4.setText("Depósitos");
        pnlDepositos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, -1, -1));

        pnlRecargas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRecargas1MouseClicked(evt);
            }
        });
        pnlRecargas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Consultas");
        pnlRecargas1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lblIcono9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_printer_maintenance_32px.png"))); // NOI18N
        pnlRecargas1.add(lblIcono9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBorde2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBorde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlRecargas, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(pnlDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlRetiro, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(pnlRecargas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlBorde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlRecargas1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(pnlBorde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPagosMouseClicked
        // TODO add your handling code here:
        new Pagos(cuentas).show();
        this.hide();
    }//GEN-LAST:event_pnlPagosMouseClicked

    private void pnlDepositosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDepositosMouseClicked
        // TODO add your handling code here:
        new GUIDéposito(cuentas).show();
        this.hide();
    }//GEN-LAST:event_pnlDepositosMouseClicked

    private void pnlRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRetiroMouseClicked
        // TODO add your handling code here:
        new GUIRetiro(cuentas).show();
        this.hide();
    }//GEN-LAST:event_pnlRetiroMouseClicked

    private void pnlPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrestamosMouseClicked
        // TODO add your handling code here:
        new Prestamos().show();
        this.hide();
    }//GEN-LAST:event_pnlPrestamosMouseClicked

    private void pnlRecargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRecargasMouseClicked
        // TODO add your handling code here:
        new Recargas().show();
        this.hide();
    }//GEN-LAST:event_pnlRecargasMouseClicked

    private void pnlRecargas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRecargas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlRecargas1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblIcono1;
    private javax.swing.JLabel lblIcono2;
    private javax.swing.JLabel lblIcono3;
    private javax.swing.JLabel lblIcono4;
    private javax.swing.JLabel lblIcono5;
    private javax.swing.JLabel lblIcono6;
    private javax.swing.JLabel lblIcono7;
    private javax.swing.JLabel lblIcono8;
    private javax.swing.JLabel lblIcono9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JPanel pnlBorde1;
    private javax.swing.JPanel pnlBorde2;
    private javax.swing.JPanel pnlDepositos;
    private javax.swing.JPanel pnlPagos;
    private javax.swing.JPanel pnlPrestamos;
    private javax.swing.JPanel pnlRecargas;
    private javax.swing.JPanel pnlRecargas1;
    private javax.swing.JPanel pnlRetiro;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
