# 🚀 Modul 01: Hello World
Pengenalan bahasa pemrograman Java dan cara menulis program pertama Anda.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami apa itu Java dan sejarah singkatnya
- Mengenal alasan mengapa Java sangat populer
- Memahami struktur dasar program Java
- Mengetahui perbedaan `System.out.println()` dan `System.out.print()`
- Mampu melakukan kompilasi dan menjalankan program Java dari terminal

## Teori / Penjelasan
Java adalah bahasa pemrograman tingkat tinggi yang berorientasi objek dan dirancang untuk memiliki ketergantungan implementasi sesedikit mungkin. Slogan Java adalah "Write Once, Run Anywhere" (WORA), yang berarti kode Java yang sudah dikompilasi (bytecode) dapat berjalan di semua platform yang mendukung Java tanpa perlu kompilasi ulang, berkat adanya JVM (Java Virtual Machine).

**Mengapa Java Populer?**
- **Platform Independent:** Dapat berjalan di Windows, Mac, Linux.
- **Object-Oriented (OOP):** Mengorganisir program ke dalam objek-objek.
- **Enterprise Ready:** Sangat stabil dan banyak digunakan di industri besar.

**Struktur Dasar Program Java:**
Setiap program Java harus memiliki setidaknya satu `class`, dan eksekusi program dimulai dari method `main`.

```java
public class NamaClass {
    public static void main(String[] args) {
        // Kode dieksekusi di sini
    }
}
```

- `public class NamaClass`: Mendefinisikan kelas. Nama kelas harus sama dengan nama file.
- `public static void main(String[] args)`: Ini adalah *entry point* (titik awal) eksekusi program.
- `System.out.println()`: Mencetak teks ke layar dan pindah ke baris baru.
- `System.out.print()`: Mencetak teks ke layar tanpa pindah ke baris baru.

**Cara Kompilasi dan Menjalankan:**
1. Buka terminal.
2. Compile file `.java` menjadi `.class` (bytecode):
   ```bash
   javac HelloWorld.java
   ```
3. Jalankan file `.class` dengan JVM:
   ```bash
   java HelloWorld
   ```

## Contoh Program
Di dalam folder ini terdapat file `HelloWorld.java`. Program ini mendemonstrasikan cara mencetak teks ke layar menggunakan `println` dan `print`.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Latihan
1. Buat program untuk mencetak nama lengkap dan NIM Anda ke layar.
2. Cetak pola bintang sederhana (misalnya segitiga atau kotak) menggunakan `println`.

## Referensi
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Tutorials - W3Schools](https://www.w3schools.com/java/)
