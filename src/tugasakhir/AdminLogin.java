/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import javax.swing.JOptionPane;

/**
 *
 * @author Hyung
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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
        admusr = new javax.swing.JTextField();
        admpw = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admlog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);
        jPanel1.add(admusr);
        admusr.setBounds(0, 20, 200, 30);
        jPanel1.add(admpw);
        admpw.setBounds(0, 70, 200, 30);

        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 60, 20);

        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 60, 20);

        admlog.setBackground(new java.awt.Color(51, 255, 51));
        admlog.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        admlog.setForeground(new java.awt.Color(255, 255, 255));
        admlog.setText("LOGIN");
        admlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admlogActionPerformed(evt);
            }
        });
        jPanel1.add(admlog);
        admlog.setBounds(10, 110, 69, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 200, 160);

        setSize(new java.awt.Dimension(216, 199));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admlogActionPerformed
        if("admin".equals(admusr.getText()) && "761834925".equals(admpw.getText())) {
            new ManageAccount().show();
                    this.dispose();
        } else {
                JOptionPane.showMessageDialog(this,"Restricted"+"\n"+"You are not an Adminstrator","WARNING", JOptionPane.WARNING_MESSAGE);
                admusr.setText("");
                admpw.requestFocus();
        }
    }//GEN-LAST:event_admlogActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admlog;
    private javax.swing.JPasswordField admpw;
    private javax.swing.JTextField admusr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
