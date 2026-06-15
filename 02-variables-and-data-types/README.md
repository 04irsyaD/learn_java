# 📦 Modul 02: Variables & Data Types
Memahami cara menyimpan data dalam memori menggunakan variabel dan berbagai tipe data di Java.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep variabel sebagai tempat penyimpanan data
- Mengetahui cara mendeklarasikan dan menginisialisasi variabel
- Memahami aturan penamaan variabel yang baik dan benar
- Mengenal tipe data primitif dan referensi di Java
- Memahami *type casting* dan penggunaan konstanta

## Teori / Penjelasan
**Apa itu Variabel?**
Variabel dapat dianalogikan sebagai sebuah kotak penyimpanan di dalam memori komputer yang memiliki nama dan dapat menyimpan nilai tertentu (data).

**Deklarasi Variabel:**
Sintaks dasar: `tipeData namaVariabel = nilai;`

**Aturan Penamaan Variabel:**
- Menggunakan format *camelCase* (contoh: `studentName`).
- Tidak boleh diawali dengan angka.
- Tidak boleh menggunakan *reserved words* (kata kunci bawaan Java, seperti `class`, `public`, `int`).
- Harus mendeskripsikan isi dari variabel tersebut.

**Tipe Data Primitif:**
Java memiliki 8 tipe data primitif:
1. `byte` (8-bit): -128 hingga 127
2. `short` (16-bit): -32,768 hingga 32,767
3. `int` (32-bit): -2^31 hingga 2^31-1 (Paling sering digunakan untuk bilangan bulat)
4. `long` (64-bit): Gunakan suffix `L` (contoh: `10000000000L`)
5. `float` (32-bit decimal): Gunakan suffix `f` (contoh: `3.14f`)
6. `double` (64-bit decimal): Presisi ganda (Paling sering digunakan untuk bilangan desimal)
7. `char` (16-bit Unicode): Menyimpan satu karakter (contoh: `'A'`)
8. `boolean` (1-bit): Menyimpan `true` atau `false`

**Tipe Data Referensi:**
Berbeda dengan tipe primitif, tipe referensi merujuk pada sebuah objek. Contoh paling umum adalah `String` (teks) dan Array.

**Type Casting:**
Mengonversi satu tipe data ke tipe data lain.
- *Implicit (Widening):* Mengonversi tipe data yang lebih kecil ke yang lebih besar (otomatis). Contoh: `int` ke `double`.
- *Explicit (Narrowing):* Mengonversi tipe data yang lebih besar ke yang lebih kecil (manual). Contoh: `double` ke `int`.

**Konstanta:**
Variabel yang nilainya tidak bisa diubah setelah diinisialisasi. Menggunakan keyword `final`.

## Contoh Program
- `Variables.java`: Demonstrasi deklarasi variabel, reassignment, dan konstanta.
- `DataTypes.java`: Demonstrasi berbagai tipe data primitif, String, type casting, dan *overflow*.

## Latihan
1. Buat program biodata mahasiswa yang menyimpan dan menampilkan: nama, umur, NIM, IPK, dan status aktif.
2. Buat program yang mengonversi suhu dari Celsius ke Fahrenheit menggunakan variabel.

## Referensi
- [Java Variables - W3Schools](https://www.w3schools.com/java/java_variables.asp)
- [Java Data Types - W3Schools](https://www.w3schools.com/java/java_data_types.asp)
