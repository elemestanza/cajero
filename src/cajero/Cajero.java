/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.awt.Font;
import java.util.Scanner;

/**
 *
 * @author d.mestanza.2017
 */
public class Cajero extends javax.swing.JFrame {

    /**
     * Creates new form asdñlfkj
     */
    public Cajero() {
        initComponents();
        this.setSize(1000, 600);
        
        Font Consolas = new java.awt.Font("Consolas", 0, 24);
        
        //PIN
        jLabel1.setFont(Consolas);
        jLabel1.setText("ESCRIBA SU PIN:");
        
        jPasswordField1.setFont(Consolas);
        jPasswordField1.setLocation(500, 300);
        jPasswordField1.setSize(200, 40);
        jPasswordField1.setEchoChar('*');
        
        Scanner sc = new Scanner(System.in);
        
        char[] pin = new char[4];
        boolean isCorrect = true;
        
        do{
            jPasswordField1.setText("");
            for (int i = 0; i < 4; i++) pin[i] = sc.next().toCharArray()[0];
            
            if (pin[0] != '6') isCorrect = false;
            if (pin[1] != '5') isCorrect = false;
            if (pin[2] != '4') isCorrect = false;
            if (pin[3] != '2') isCorrect = false;
            
        }while (isCorrect);
        
        
        //Mostrar menú principal
        /*MenuPrincipal mp = new MenuPrincipal();
        this.add(mp);*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
