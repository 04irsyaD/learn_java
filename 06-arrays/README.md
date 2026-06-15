# 📚 Modul 06: Arrays
Menyimpan banyak nilai dalam satu variabel menggunakan Array.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep array sebagai penyimpan data bertipe homogen (sama).
- Mampu mendeklarasikan, menginisialisasi, dan mengakses elemen di dalam array.
- Memahami konsep indeks pada array.
- Menangani `ArrayIndexOutOfBoundsException`.
- Mampu menggunakan Array multi dimensi (2D).
- Mengetahui kelebihan serta keterbatasan Array.

## Teori / Penjelasan

**Apa itu Array?**
Array dapat dianalogikan sebagai rak buku atau loker. Daripada mendeklarasikan 10 variabel terpisah untuk 10 data yang sama (misal `nilai1`, `nilai2`, ..., `nilai10`), Anda bisa menyimpan kesepuluh nilai tersebut dalam satu variabel array berkapasitas 10.

**Deklarasi & Inisialisasi:**
```java
// Mendeklarasikan array berkapasitas 5
int[] angka = new int[5];

// Menginisialisasi langsung nilainya
String[] nama = {"Budi", "Siti", "Andi"};
```

**Mengakses Elemen Array:**
- Array menggunakan sistem indeks **Zero-based**, yang artinya indeks pertama adalah `0`.
- Jika panjang array adalah 5, maka indeks validnya adalah `0` sampai `4`.
- Property `.length` digunakan untuk mendapatkan ukuran/kapasitas array.

**ArrayIndexOutOfBoundsException:**
Error ini terjadi ketika Anda mencoba mengakses indeks yang tidak valid, misalnya elemen ke-10 dari array berkapasitas 5, atau indeks negatif.

**Iterasi Array:**
Menggunakan `for` biasa dengan `.length` atau dengan *enhanced for-each loop*.

**Array Multi Dimensi (2D):**
Array di dalam array. Sering disebut sebagai matriks (baris x kolom).
```java
int[][] matriks = {
    {1, 2, 3},
    {4, 5, 6}
};
```
Mengakses elemen menggunakan 2 indeks: `matriks[baris][kolom]`.

**Keterbatasan Array:**
Ukuran array bersifat statis atau tetap. Sekali array dibuat dengan ukuran tertentu, ukurannya tidak bisa diperbesar atau diperkecil. (Untuk ukuran dinamis, kita menggunakan `ArrayList` yang akan dipelajari nanti).

## Contoh Program
- `OneDimensionalArray.java`: Demonstrasi deklarasi, akses, iterasi, method bawaan `Arrays`, serta mencari nilai max/min.
- `MultiDimensionalArray.java`: Demonstrasi deklarasi matriks 2D, iterasi menggunakan nested loop, dan penjumlahan 2 matriks.

## Latihan
1. Buat program yang mencari dan menampilkan nilai terbesar dan terkecil dari sekumpulan array of integer acak.
2. Buat program untuk menjumlahkan dua buah matriks berukuran 2x2.

## Referensi
- [Java Arrays - W3Schools](https://www.w3schools.com/java/java_arrays.asp)
