/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package talleresjavaant2670142;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author grani
 */
public class frmE14 extends javax.swing.JFrame {

    /**
     * Creates new form frmE14
     */
    public frmE14() {
        initComponents();
    }

    /* Ejercicio 14
        Desarrollar un algoritmo que determine si una cadena de caracteres 
        es palíndroma. Una cadena se dice palíndromo si al 
        invertirla es igual a ella misma.
    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnFrmE01 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        Cadena = new javax.swing.JLabel();
        txtCadena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnFrmE01.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html><center>Ejercicio 14</center>");
        jpnFrmE01.add(jLabel2);
        jLabel2.setBounds(50, 20, 160, 60);

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cadena Palindroma");
        jpnFrmE01.add(jLabel3);
        jLabel3.setBounds(40, 80, 170, 17);

        jLabel6.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Resultado:");
        jpnFrmE01.add(jLabel6);
        jLabel6.setBounds(40, 180, 120, 15);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jpnFrmE01.add(btnCalcular);
        btnCalcular.setBounds(80, 300, 75, 23);

        lblResultado.setBackground(new java.awt.Color(0, 0, 0));
        lblResultado.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 0, 0));
        jpnFrmE01.add(lblResultado);
        lblResultado.setBounds(40, 210, 160, 70);

        Cadena.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        Cadena.setForeground(new java.awt.Color(0, 0, 0));
        Cadena.setText("Numero");
        jpnFrmE01.add(Cadena);
        Cadena.setBounds(40, 110, 130, 20);

        txtCadena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCadenaKeyPressed(evt);
            }
        });
        jpnFrmE01.add(txtCadena);
        txtCadena.setBounds(40, 140, 160, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/talleresjavaant2670142/images/link_small.jpg"))); // NOI18N
        jpnFrmE01.add(jLabel1);
        jLabel1.setBounds(0, 0, 240, 330);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnFrmE01, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnFrmE01, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    public void showError(String mensaje, String titulo){
        JOptionPane.showMessageDialog(this,mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public void showInfo(String mensaje, String titulo){
        JOptionPane.showMessageDialog(this,mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean numeroCapicua(){
        String cadena = txtCadena.getText();

        StringBuilder reversed = new StringBuilder(cadena).reverse();
        if(cadena.equalsIgnoreCase(reversed.toString())){
            lblResultado.setText("<html><center>La cadena SI es un palindromo</center>");
            return true;
        }else{
            lblResultado.setText("<html><center>La cadena NO es un palindromo</center>");
            return true;
        }
    }
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        numeroCapicua();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtCadenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadenaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            numeroCapicua();
        }
    }//GEN-LAST:event_txtCadenaKeyPressed

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
            java.util.logging.Logger.getLogger(frmE14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmE14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmE14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmE14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmE14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cadena;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpnFrmE01;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField txtCadena;
    // End of variables declaration//GEN-END:variables

}
