/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hyung
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nik = new javax.swing.JTextField();
        jk = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        rtrw = new javax.swing.JTextField();
        keldesa = new javax.swing.JTextField();
        kecamatan = new javax.swing.JTextField();
        agama = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        pekerjaan = new javax.swing.JTextField();
        kewarganegaraan = new javax.swing.JTextField();
        keluar = new javax.swing.JButton();
        ttl = new javax.swing.JTextField();
        Kirim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 204));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel10.setText("NIK");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(120, 20, 40, 20);

        jLabel1.setText("Nama");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 60, 40, 20);

        jLabel7.setText("TTL");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 100, 40, 20);

        jLabel2.setText("Jenis Kelamin");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 140, 80, 20);

        jLabel9.setText("Alamat");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 180, 50, 20);

        jLabel5.setText("RT/RW");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 220, 50, 20);

        jLabel12.setText("Kel/Desa");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(120, 260, 60, 20);

        jLabel8.setText("Kecamatan");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 300, 70, 20);

        jLabel6.setText("Agama");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 340, 60, 20);

        jLabel3.setText("Status");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 380, 60, 20);

        jLabel4.setText("Pekerjaan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 420, 60, 20);

        jLabel11.setText("Kewarganegaraan");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 460, 110, 20);
        jPanel1.add(nama);
        nama.setBounds(230, 50, 400, 30);
        jPanel1.add(nik);
        nik.setBounds(230, 10, 400, 30);
        jPanel1.add(jk);
        jk.setBounds(230, 130, 210, 30);
        jPanel1.add(alamat);
        alamat.setBounds(230, 170, 400, 30);
        jPanel1.add(rtrw);
        rtrw.setBounds(230, 210, 210, 30);
        jPanel1.add(keldesa);
        keldesa.setBounds(230, 250, 210, 30);
        jPanel1.add(kecamatan);
        kecamatan.setBounds(230, 290, 400, 30);
        jPanel1.add(agama);
        agama.setBounds(230, 330, 210, 30);
        jPanel1.add(status);
        status.setBounds(230, 370, 210, 30);
        jPanel1.add(pekerjaan);
        pekerjaan.setBounds(230, 410, 400, 30);
        jPanel1.add(kewarganegaraan);
        kewarganegaraan.setBounds(230, 450, 400, 30);

        keluar.setText("keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar);
        keluar.setBounds(470, 500, 110, 23);
        jPanel1.add(ttl);
        ttl.setBounds(230, 90, 400, 30);

        Kirim.setText("Kirim");
        Kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KirimActionPerformed(evt);
            }
        });
        jPanel1.add(Kirim);
        Kirim.setBounds(593, 500, 110, 23);

        jTabbedPane2.addTab("Insert Data", jPanel1);

        tab.setBackground(new java.awt.Color(255, 255, 153));
        tab.setFont(new java.awt.Font("Aller", 1, 11)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "Nama", "TTL", "Jenis Kelamin", "Alamat", "RT/RW", "Kel/Desa", "Kecamatan", "Agama", "Status", "Pekerjaan", "Kewarganegaraan"
            }
        ));
        jScrollPane1.setViewportView(tab);

        jTabbedPane2.addTab("Viewing", jScrollPane1);

        getContentPane().add(jTabbedPane2, "card3");

        setSize(new java.awt.Dimension(881, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
               dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void KirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KirimActionPerformed
        // TODO add your handling code here:
         if ("".equals(nik.getText()) || "".equals(nama.getText()) || 
                "".equals(ttl.getText()) ||"".equals(jk.getText()) || "".equals(alamat.getText()) || "".equals(rtrw.getText())
                         || "".equals(keldesa.getText()) || "".equals(kecamatan.getText()) || "".equals(agama.getText())
                         || "".equals(status.getText()) || "".equals(pekerjaan.getText()) || "".equals(kewarganegaraan.getText())) {
            JOptionPane.showMessageDialog(this, " Harap melengkapi data", "Error 0xC01", JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL = "INSERT INTO `tb_data`(`NIK`, `Nama`, `TTL`, `Jenis Kelamin`, `Alamat`, `RT/RW`, `Kel/Desa`, `Kecamatan`, `Agama`, `Status`, `Pekerjaan`, `Kewarganegaraan`)"
            + "VALUES('"+nik.getText()+"','"+nama.getText()+"','"+ttl.getText()+"','"+jk.getText()+"','"+alamat.getText()+"','"+rtrw.getText()+"','"+keldesa.getText()+"','"+kecamatan.getText()+"','"+agama.getText()+"','"+status.getText()+"','"+pekerjaan.getText()+"','"+kewarganegaraan.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!", "Success", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan!", "Error 0xC02", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_KirimActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_formWindowOpened
public void selectData() {
    String kolom[] = {"NIK","Nama","TTL","Jenis Kelamin","Alamat","RT/RW","Kel/Desa","Kecamatan","Agama","Status","Pekerjaan","Kewarganegaraan"};
            DefaultTableModel dtm = new DefaultTableModel(null, kolom);
            String SQL = "SELECT * FROM tb_data";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try {
                while (rs.next()) {
                    String NIK = rs.getString(1);
                    String Nama = rs.getString(2);
                    String TTL = rs.getString(3);
                    String JenisKelamin = rs.getString(4);
                    String Alamat = rs.getString(5);
                    String RTRW = rs.getString(6);
                    String KelDesa = rs.getString(7);
                    String Kecamatan = rs.getString(8);
                    String Agama = rs.getString(9);
                    String Status = rs.getString(10);
                    String Pekerjaan = rs.getString(11);
                    String Kewarganegaraan = rs.getString(12);
                    
                    String data[] = {NIK,Nama,TTL,JenisKelamin,Alamat,RTRW,KelDesa,Kecamatan,Agama,Status,Pekerjaan,Kewarganegaraan};
                    dtm.addRow(data);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
            tab.setModel(dtm);
}
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Kirim;
    private javax.swing.JTextField agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jk;
    private javax.swing.JTextField kecamatan;
    private javax.swing.JTextField keldesa;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kewarganegaraan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField pekerjaan;
    private javax.swing.JTextField rtrw;
    private javax.swing.JTextField status;
    private javax.swing.JTable tab;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}