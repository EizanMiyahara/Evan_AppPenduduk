/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hyung
 */
public class file_koneksi {
    private static Connection koneksi;
    public static Connection GetConnection() throws SQLException
    {
        if (koneksi == null) {
            Driver driver = new Driver();
            koneksi = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/db_penduduk?zeroDateTimeBehavior=convertToNull", "root", "");
        }
        return koneksi;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
