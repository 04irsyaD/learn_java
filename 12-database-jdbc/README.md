# 🗄️ Modul 12: Database JDBC
JDBC (Java Database Connectivity) adalah API Java yang memungkinkan aplikasi Java terhubung dengan database relational (seperti MySQL, PostgreSQL, Oracle).

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami arsitektur JDBC (Connection, Statement, ResultSet)
- Mampu menghubungkan program Java dengan database MySQL
- Memahami konsep CRUD (Create, Read, Update, Delete)
- Menggunakan `PreparedStatement` untuk keamanan dari SQL Injection

## Teori / Penjelasan
- **Langkah-langkah koneksi JDBC**:
  1. Pastikan Anda memiliki driver JDBC (misalnya `mysql-connector-j.jar`) dan terpasang di classpath project.
  2. Load Driver (opsional di versi Java baru).
  3. Buat Koneksi dengan `DriverManager.getConnection()`.
  4. Eksekusi query dengan `Statement` atau `PreparedStatement`.
  5. Proses hasil eksekusi (jika `SELECT`, gunakan `ResultSet`).
  6. Tutup koneksi.
- **PreparedStatement**: Lebih aman dan lebih cepat dibanding `Statement` biasa karena mencegah serangan *SQL Injection*.
- **CRUD Operations**:
  - **Create**: `INSERT INTO table_name (column1) VALUES (value1)`
  - **Read**: `SELECT * FROM table_name`
  - **Update**: `UPDATE table_name SET column1 = value1 WHERE condition`
  - **Delete**: `DELETE FROM table_name WHERE condition`

## Contoh Program
> **Catatan**: Untuk menjalankan kode di modul ini, Anda harus menginstall MySQL Server dan menambahkan MySQL Connector/J `.jar` ke classpath IDE Anda.
- `JDBCConnection.java`: Cara membuat koneksi ke database MySQL.
- `CRUDExample.java`: Contoh lengkap implementasi Create, Read, Update, dan Delete ke dalam database menggunakan `PreparedStatement`.

## Latihan
1. Buat tabel `mahasiswa` di database dengan kolom `id`, `nim`, `nama`, dan `jurusan`.
2. Buat program CRUD sederhana untuk tabel `mahasiswa` tersebut dengan menu interaktif di console.

## Referensi
- [MySQL Connector/J Download](https://dev.mysql.com/downloads/connector/j/)
- [Oracle JDBC Basics](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)
