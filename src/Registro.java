
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
public class Registro extends javax.swing.JFrame {
int contador;
public ArrayList cuentas=new ArrayList();
    /**
     * Creates new form 
     */
    public Registro() {
        initComponents();
        scaleImage1();
    contador=0;
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

        btgTipoCuenta = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        pnlCabecera = new javax.swing.JPanel();
        lblTexto1 = new javax.swing.JLabel();
        pnlBack = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        lblTexto6 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        lblTexto3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTexto4 = new javax.swing.JLabel();
        lblTexto5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblTexto10 = new javax.swing.JLabel();
        lblTexto11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTexto9 = new javax.swing.JLabel();
        lblTexto15 = new javax.swing.JLabel();
        rbtEmpresarial = new javax.swing.JRadioButton();
        rbtPrivada = new javax.swing.JRadioButton();
        rbtColectiva = new javax.swing.JRadioButton();
        lblTexto12 = new javax.swing.JLabel();
        txtTarjeta = new javax.swing.JTextField();
        lblTexto13 = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        pnl = new javax.swing.JPanel();
        lblTexto14 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        lblTexto16 = new javax.swing.JLabel();
        lblTexto17 = new javax.swing.JLabel();
        lblTexto18 = new javax.swing.JLabel();
        lblTexto19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCabecera.setBackground(new java.awt.Color(153, 153, 255));

        lblTexto1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setText("REGISTRO");

        pnlBack.setBackground(new java.awt.Color(153, 153, 255));
        pnlBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBackMouseClicked(evt);
            }
        });

        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_26px.png"))); // NOI18N

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCabeceraLayout = new javax.swing.GroupLayout(pnlCabecera);
        pnlCabecera.setLayout(pnlCabeceraLayout);
        pnlCabeceraLayout.setHorizontalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lblTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pnlCabeceraLayout.setVerticalGroup(
            pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCabeceraLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCabeceraLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTexto1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(pnlCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        lblTexto2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        lblTexto2.setText("BIENVENIDO");
        jPanel3.add(lblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblTexto6.setText("Fecha de nacimiento");
        jPanel3.add(lblTexto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtContrasenia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 180, 20));

        lblTexto3.setText("Nombre");
        jPanel3.add(lblTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, 20));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 20));

        lblTexto4.setText("Apellido");
        jPanel3.add(lblTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblTexto5.setText("Número de cédula");
        jPanel3.add(lblTexto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 20));

        lblTexto10.setText("Teléfono celular");
        jPanel3.add(lblTexto10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        lblTexto11.setText("Contraseña de cuenta");
        jPanel3.add(lblTexto11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, 20));

        lblTexto9.setText("/");
        jPanel3.add(lblTexto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 20, 20));

        lblTexto15.setText("Número de targeta");
        jPanel3.add(lblTexto15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        rbtEmpresarial.setBackground(new java.awt.Color(255, 255, 255));
        btgTipoCuenta.add(rbtEmpresarial);
        rbtEmpresarial.setText("Empresarial");
        jPanel3.add(rbtEmpresarial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        rbtPrivada.setBackground(new java.awt.Color(255, 255, 255));
        btgTipoCuenta.add(rbtPrivada);
        rbtPrivada.setText("Privada");
        jPanel3.add(rbtPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        rbtColectiva.setBackground(new java.awt.Color(255, 255, 255));
        btgTipoCuenta.add(rbtColectiva);
        rbtColectiva.setText("Colectiva");
        jPanel3.add(rbtColectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        lblTexto12.setText("Tipo de cuenta");
        jPanel3.add(lblTexto12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtTarjeta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtTarjeta.setEnabled(false);
        jPanel3.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 180, -1));

        lblTexto13.setText("Capital inicial");
        jPanel3.add(lblTexto13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        txtCapital.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel3.add(txtCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 180, -1));

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        pnl.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel3.add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 390, 50));

        lblTexto14.setText("Número de cuenta");
        jPanel3.add(lblTexto14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        txtCuenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCuenta.setEnabled(false);
        jPanel3.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 180, -1));
        jPanel3.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 60, 60));
        jPanel3.add(txtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 40, -1));
        jPanel3.add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 40, -1));
        jPanel3.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 40, -1));

        lblTexto16.setText("Año");
        jPanel3.add(lblTexto16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        lblTexto17.setText("Mes");
        jPanel3.add(lblTexto17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        lblTexto18.setText("Día");
        jPanel3.add(lblTexto18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        lblTexto19.setText("/");
        jPanel3.add(lblTexto19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 10, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBackMouseClicked
        // TODO add your handling code here:
        if(contador==0){
            new BancaVirtual().show();
        }else{
        new BancaVirtual(cuentas).show();
        }
        
    }//GEN-LAST:event_pnlBackMouseClicked

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
         String nombre;
     String apellido;
     int cedula=0;
     String tipoCuenta="0";
     String telefono;
     String contrasenia;
     double capital;
     float numeroTarjeta;
     String fechaNacimiento="0";
     int numeroDeCuenta;
     String prueba;
     int prueba1;
   //  try{
         nombre=txtNombre.getText();
         apellido=txtApellido.getText();      
         if(rbtPrivada.isSelected()){
             tipoCuenta="Privada";
         }
         if(rbtColectiva.isSelected()){
             tipoCuenta="Colectiva";
         }
         if(rbtEmpresarial.isSelected()){
             tipoCuenta="Empresarial";
         }
         telefono=txtTelefono.getText();
         contrasenia=txtContrasenia.getText();
         capital=Double.parseDouble(txtCapital.getText());
         Cuenta cuentaNueva=new Cuenta( nombre, apellido, tipoCuenta, telefono,  contrasenia, capital);
         
         prueba1=Integer.parseInt(txtCedula.getText());
         if(cuentaNueva.verificarCedula(prueba1)==true){
             cedula=prueba1;
         }
         prueba=txtDia.getText()+"/"+txtMes.getText()+"/"+txtAnio.getText();
         if(cuentaNueva.validarFecha(prueba)){
             fechaNacimiento=prueba;
         }
         
         cuentaNueva.setCedula(cedula);
         cuentaNueva.setFechaNacimiento(fechaNacimiento);
         
         /*método para generar un numero de tarjeta
         metodo para generar un numero de cuenta
         
*/       cuentaNueva.setNumeroDeCuenta(123);
         
         cuentas.add(cuentaNueva);
    // }
        contador++;
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTipoCuenta;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto10;
    private javax.swing.JLabel lblTexto11;
    private javax.swing.JLabel lblTexto12;
    private javax.swing.JLabel lblTexto13;
    private javax.swing.JLabel lblTexto14;
    private javax.swing.JLabel lblTexto15;
    private javax.swing.JLabel lblTexto16;
    private javax.swing.JLabel lblTexto17;
    private javax.swing.JLabel lblTexto18;
    private javax.swing.JLabel lblTexto19;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTexto4;
    private javax.swing.JLabel lblTexto5;
    private javax.swing.JLabel lblTexto6;
    private javax.swing.JLabel lblTexto9;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JRadioButton rbtColectiva;
    private javax.swing.JRadioButton rbtEmpresarial;
    private javax.swing.JRadioButton rbtPrivada;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarjeta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
