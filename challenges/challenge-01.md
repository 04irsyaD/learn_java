# 🏆 Challenge 01: Kalkulator Sederhana

**Deskripsi:**
Buat sebuah program kalkulator sederhana berbasis terminal yang memungkinkan user untuk memasukkan dua buah angka dan memilih operasi matematika yang ingin dilakukan.

## Requirements:
1. Program meminta input berupa angka pertama, operasi matematika (`+`, `-`, `*`, `/`, `%`), dan angka kedua.
2. Program menampilkan hasil operasi dengan tepat.
3. Gunakan `Scanner` untuk mengambil input dari user.

## Fitur Bonus:
1. **Handling Pembagian Nol:** Jika user memilih `/` atau `%` dan angka kedua adalah 0, tampilkan pesan error khusus ("Tidak dapat membagi dengan nol").
2. **Operasi Berulang:** Setelah menampilkan hasil, tanya user apakah ingin melakukan perhitungan lagi (Y/N).

## Hint / Panduan Langkah:
1. Import `java.util.Scanner`.
2. Gunakan `switch-case` untuk memproses operator matematika yang dipilih.
3. Gunakan loop seperti `do-while` untuk fitur bonus (operasi berulang).
4. Gunakan `if-else` untuk mengecek jika pembagi bernilai nol.
