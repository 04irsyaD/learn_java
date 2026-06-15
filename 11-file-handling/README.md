# 📁 Modul 11: File Handling
File Handling memungkinkan aplikasi Java untuk membaca dari dan menulis ke file di sistem operasi. Hal ini sangat penting untuk menyimpan data secara permanen (persisten) di luar memori (RAM).

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep dasar File I/O di Java
- Mampu membuat, membaca, menulis, dan menghapus file text
- Memahami penggunaan `FileReader`, `BufferedReader`, `FileWriter`, dan `BufferedWriter`
- Mengerti penggunaan block `try-with-resources`

## Teori / Penjelasan
- **Menulis File (Writing)**: Digunakan untuk menyimpan output program ke dalam file (misal `output.txt`). Class yang sering digunakan: `FileWriter` dan `BufferedWriter`.
- **Membaca File (Reading)**: Digunakan untuk mengambil input dari file. Class yang sering digunakan: `FileReader`, `BufferedReader`, dan `Scanner`.
- **Mode Append vs Overwrite**: Secara default, `FileWriter` akan menimpa file (overwrite). Untuk menambahkan di baris bawah (append), berikan nilai `true` sebagai parameter kedua di constructor `FileWriter`.
- **try-with-resources**: Sintaks try-catch khusus di mana Java akan otomatis menutup file (atau resource lain) setelah selesai digunakan, tanpa perlu menaruhnya di blok `finally`.

## Contoh Program
- `WriteFile.java`: Menulis teks ke file dengan `BufferedWriter` dan contoh mode append/overwrite menggunakan `try-with-resources`.
- `ReadFile.java`: Membaca teks dari file baris demi baris menggunakan `BufferedReader`.

## Latihan
1. Buat program yang meminta user menginputkan biodata (nama, umur, alamat), lalu menyimpan hasilnya ke file `biodata.txt`.
2. Buat program yang membaca isi file `biodata.txt` tersebut dan menampilkannya kembali ke layar.

## Referensi
- [Oracle Java Docs - Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/index.html)
