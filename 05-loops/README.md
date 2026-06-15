# 🔄 Modul 05: Loops
Menjalankan blok kode secara berulang-ulang menggunakan perulangan.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep dasar perulangan dalam pemrograman.
- Menggunakan `for` loop untuk iterasi dengan jumlah pasti.
- Menggunakan `while` dan `do-while` loop untuk kondisi yang dinamis.
- Mengimplementasikan nested loop (perulangan bersarang).
- Memahami penggunaan control statement `break` dan `continue`.

## Teori / Penjelasan

**Apa itu Perulangan?**
Perulangan (looping) adalah aktivitas mengeksekusi sekumpulan instruksi berkali-kali secara otomatis selama suatu kondisi terpenuhi (bernilai `true`).

**1. `for` Loop**
Digunakan ketika kita sudah mengetahui jumlah iterasinya dengan pasti.
```java
for (inisialisasi; kondisi; update) {
    // kode yang diulang
}
```
*Enhanced for-each loop:* Digunakan khusus untuk menelusuri elemen array atau koleksi.
```java
for (tipeData variabel : array) { ... }
```

**2. `while` Loop**
Digunakan ketika jumlah iterasinya belum diketahui, program akan terus berulang selama kondisinya `true`.
*Awas:* Jika kondisi tidak pernah `false`, akan terjadi *infinite loop* (perulangan tak terhingga).

**3. `do-while` Loop**
Mirip dengan `while` loop, namun perbedaannya adalah kondisi dicek di akhir. Artinya, blok kode di dalam `do` dijamin akan dieksekusi **minimal satu kali** meskipun kondisinya awalnya `false`. Digunakan biasanya untuk menu program.

**4. Nested Loop**
Perulangan di dalam perulangan. Sering digunakan untuk mengolah data dua dimensi (seperti tabel atau matriks) dan membuat pola (seperti segitiga bintang).

**5. Control Statement (`break` & `continue`)**
- `break`: Langsung menghentikan keseluruhan loop dan keluar dari blok perulangan.
- `continue`: Menghentikan iterasi yang sedang berjalan saat ini dan langsung melompat ke iterasi berikutnya.

## Contoh Program
- `ForLoop.java`: Demonstrasi dasar `for` loop, countdown, nested loop, serta penggunaan `break` dan `continue`.
- `WhileLoop.java`: Demonstrasi `while` loop dan simulasi validasi input.
- `DoWhile.java`: Demonstrasi `do-while` dan simulasi menu aplikasi.

## Latihan
1. Buat program yang mencetak pola segitiga siku-siku menggunakan karakter bintang (`*`) dengan nested loop.
2. Buat program untuk menghitung nilai faktorial dari sebuah bilangan menggunakan perulangan.

## Referensi
- [Java While Loop - W3Schools](https://www.w3schools.com/java/java_while_loop.asp)
- [Java For Loop - W3Schools](https://www.w3schools.com/java/java_for_loop.asp)
