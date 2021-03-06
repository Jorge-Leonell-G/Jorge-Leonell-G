/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;

/**
 *
 * @author leone
 */
public class VentanaCifrado extends javax.swing.JFrame {

    /*
     * Creates new form VentanaCifrado
     */
    public VentanaCifrado() {
        //con este codigo cambiamos el icono por defecto de nuestra ventana de arranque
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/cifrado-icon.png")));
        //redimension de imagenes en jLabel
        //ya no se hizo la redimension de la imagen del gato :C
        /*
        ImageIcon gato = new ImageIcon(getClass().getResource("src/images/funny-cat.png"));
        ImageIcon pato = new ImageIcon(getClass().getResource("src/images/funny-cat.png"));
        Icon fg = new ImageIcon(gato.getImage().getScaledInstance(lcat.getWidth(), lcat.getHeight(), Image.SCALE_DEFAULT));
        Icon fp = new ImageIcon(pato.getImage().getScaledInstance(lduck.getWidth(), lduck.getHeight(), Image.SCALE_DEFAULT));
        lcat.setIcon(fg);
        lduck.setIcon(fp);
        this.repaint();
        */
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
        jLabel2 = new javax.swing.JLabel();
        txtkey = new javax.swing.JTextField();
        jEncode = new javax.swing.JButton();
        jDecode = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ingrese su clave de s??lo 8 caracteres =>");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtkey.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtkey.setBorder(null);
        txtkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkeyActionPerformed(evt);
            }
        });
        jPanel1.add(txtkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, 20));

        jEncode.setBackground(new java.awt.Color(0, 204, 153));
        jEncode.setText("Cifrar");
        jEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEncodeActionPerformed(evt);
            }
        });
        jPanel1.add(jEncode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 69, 38));

        jDecode.setBackground(new java.awt.Color(0, 204, 153));
        jDecode.setText("Descifrar");
        jDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDecodeActionPerformed(evt);
            }
        });
        jPanel1.add(jDecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, 36));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 118));

        jLabel3.setText("Programa realizado por: Grimaldo Guadarrama Jorge Leonell");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 16)); // NOI18N
        jLabel1.setText("Cifrado y descifrado DES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 60));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 50, 20));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\leone\\OneDrive\\Documentos\\NetBeansProjects\\DES_GGJL\\src\\images\\key-cipher.jfif")); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Seguridad Web y Aplicaciones 5IV8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 240, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEncodeActionPerformed
        // Inicio del c??digo para el Cifrado DES
        
        //creamos una variable que reciba la clave generada por el usuario, y la evaluamos para que solo tenga 8 caracteres
        String clave = txtkey.getText();
        String textoT = "";
        
        if(clave.length() != 8){
            JOptionPane.showMessageDialog(rootPane, "La clave debe de ser de 8 caracteres (64 bits)");
        }else{
            //La clase 'JFileChooser' nos permite generar una instancia gr??fica para la selecci??n de nuestros archivos 
            //de forma local
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            
            File archivo = chooser.getSelectedFile();
            
                try{
                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                    DESKeySpec kspec = new DESKeySpec(clave.getBytes());
                    
                    SecretKey subclave = skf.generateSecret(kspec);
                    textoT = textoT + "1.- Su clave modificada: " + subclave.getEncoded() + "\n";
                    
                    //objeto de clase Cipher con las especificaciones referentes al modo de cifrado
                    //ALGORITMO: DES
                    //MODO: ECB (ELECTRONIC CODE BOOK)
                    //PADDING: PKCS5
                    Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");
                    String newArchivo = "";
                    
                    for(int i = 0; i < archivo.getAbsolutePath().length() - 4; i++){
                        newArchivo = newArchivo + archivo.getAbsolutePath().charAt(i);
                    }
                    textoT = textoT + "2.- El archivo cifrado lo puede encontrar en: " + newArchivo + "cifradodes.txt"+"\n";
                    cifrado.init(Cipher.ENCRYPT_MODE, subclave);
                    
                    //arreglos tipo byte para el buffering
                    byte [] buffer = new byte[1000];
                    byte [] bufferCifrado;
                    
                    FileInputStream in = new FileInputStream(archivo);
                    FileOutputStream out = new FileOutputStream(newArchivo + "cifradodes.txt");
                    
                    int bytesLeidos = in.read(buffer, 0, 1000);
                    while(bytesLeidos != -1){
                        bufferCifrado = cifrado.update(buffer, 0, 1000);
                        out.write(bufferCifrado);
                        bytesLeidos = in.read(buffer, 0, 1000);
                    }
                    
                    bufferCifrado = cifrado.doFinal();
                    out.write(bufferCifrado);
                    
                    in.close();
                    out.close();
                    
                    jTextArea1.setText(textoT);
                    
                }catch(IOException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e){
                    System.out.println("Error durante el proceso de cifrado DES\n" + e.getMessage());
                    JOptionPane.showMessageDialog(rootPane, "ERROR: Por favor, int??ntelo de nuevo, recuerde que s??lo se leen archivos con formato .txt");
                }
          }
    }//GEN-LAST:event_jEncodeActionPerformed

    private void jDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDecodeActionPerformed
 
        // Inicio del c??digo para el Descifrado DES
        
        //creamos una variable que reciba la clave generada por el usuario, y la evaluamos para que solo tenga 8 caracteres
        String clave = txtkey.getText();
        String textoT = "";
        
        if(clave.length() != 8){
            JOptionPane.showMessageDialog(rootPane, "La clave debe de ser de 8 caracteres (64 bits)");
        }else{
            //La clase 'JFileChooser' nos permite generar una instancia gr??fica para la selecci??n de nuestros archivos 
            //de forma local
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            
            File archivo = chooser.getSelectedFile();
            
                try{
                    SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
                    DESKeySpec kspec = new DESKeySpec(clave.getBytes());
                    
                    SecretKey subclave = skf.generateSecret(kspec);
                    textoT = textoT + "1.- Su clave modificada: " + subclave.getEncoded() + "\n";
                    
                    //objeto de clase Cipher con las especificaciones referentes al modo de cifrado
                    //ALGORITMO: DES
                    //MODO: ECB (ELECTRONIC CODE BOOK)
                    //PADDING: PKCS5
                    Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");
                    String newArchivo = "";
                    
                    for(int i = 0; i < archivo.getAbsolutePath().length() - 4; i++){
                        newArchivo = newArchivo + archivo.getAbsolutePath().charAt(i);
                    }
                    textoT = textoT + "El archivo cifrado lo puede encontrar en: " + newArchivo + "descifradodes.txt"+"\n";
                    cifrado.init(Cipher.DECRYPT_MODE, subclave);
                    
                    //arreglos tipo byte para el buffering
                    byte [] buffer = new byte[1000];
                    byte [] bufferPlano;
                    
                    FileInputStream in = new FileInputStream(archivo);
                    FileOutputStream out = new FileOutputStream(newArchivo + "descifradodes.txt");
                    
                    int bytesLeidos = in.read(buffer, 0, 1000);
                    while(bytesLeidos != -1){
                        bufferPlano = cifrado.update(buffer, 0, 1000);
                        out.write(bufferPlano);
                        bytesLeidos = in.read(buffer, 0, 1000);
                    }
                    
                    bufferPlano = cifrado.doFinal();
                    out.write(bufferPlano);
                    
                    in.close();
                    out.close();
                    
                    jTextArea1.setText(textoT);
                    
                }catch(IOException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e){
                    System.out.println("Error durante el proceso de descifrado DES\n" + e.getMessage());
                    JOptionPane.showMessageDialog(rootPane, "ERROR: Por favor, int??ntelo de nuevo, recuerde que s??lo se leen archivos con formato .txt");
                }
        }
    }//GEN-LAST:event_jDecodeActionPerformed

    private void txtkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkeyActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCifrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDecode;
    private javax.swing.JButton jEncode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtkey;
    // End of variables declaration//GEN-END:variables
}
