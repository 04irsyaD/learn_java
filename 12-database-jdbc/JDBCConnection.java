import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    
    // Konfigurasi Database / Database Configuration
    // Sesuaikan dengan setting di komputer Anda
    static final String DB_URL = "jdbc:mysql://localhost:3306/belajar_java"; // Ganti belajar_java dengan nama database
    static final String USER = "root";
    static final String PASS = ""; // Ganti jika ada password

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Membuka koneksi / Open connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Koneksi ke database berhasil!");
            
        } catch (SQLException e) {
            System.out.println("Gagal koneksi ke database!");
            e.printStackTrace();
        } finally {
            // Selalu tutup koneksi di blok finally
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Koneksi ditutup.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
