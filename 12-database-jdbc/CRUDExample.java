import java.sql.*;

/*
 Asumsi Tabel 'mahasiswa' sudah dibuat di database 'belajar_java':
 CREATE TABLE mahasiswa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nim VARCHAR(20) NOT NULL,
    nama VARCHAR(100) NOT NULL,
    jurusan VARCHAR(50)
 );
*/

public class CRUDExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/belajar_java";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        // Panggil method CRUD sesuai kebutuhan
        // createData("12345", "Budi Santoso", "Teknik Informatika");
        readData();
        // updateData(1, "Budi Santoso", "Sistem Informasi"); // Ganti ID sesuai data
        // deleteData(1); // Ganti ID sesuai data
    }

    // 1. CREATE (INSERT)
    public static void createData(String nim, String nama, String jurusan) {
        String sql = "INSERT INTO mahasiswa (nim, nama, jurusan) VALUES (?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, nim);
            pstmt.setString(2, nama);
            pstmt.setString(3, jurusan);
            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data mahasiswa berhasil ditambahkan!");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. READ (SELECT)
    public static void readData() {
        String sql = "SELECT * FROM mahasiswa";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
             
            System.out.println("\n--- Data Mahasiswa ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String jurusan = rs.getString("jurusan");
                
                System.out.println("ID: " + id + ", NIM: " + nim + ", Nama: " + nama + ", Jurusan: " + jurusan);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. UPDATE
    public static void updateData(int id, String namaBaru, String jurusanBaru) {
        String sql = "UPDATE mahasiswa SET nama = ?, jurusan = ? WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setString(1, namaBaru);
            pstmt.setString(2, jurusanBaru);
            pstmt.setInt(3, id);
            
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data mahasiswa berhasil diupdate!");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. DELETE
    public static void deleteData(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
            pstmt.setInt(1, id);
            
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data mahasiswa berhasil dihapus!");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
