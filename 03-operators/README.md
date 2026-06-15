# ➕ Modul 03: Operators
Memanipulasi nilai dan variabel menggunakan berbagai jenis operator di Java.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Mengenal jenis-jenis operator di Java.
- Mampu menggunakan operator aritmatika, perbandingan, dan logika.
- Memahami konsep *short-circuit evaluation*.
- Mengetahui perbedaan *prefix* dan *postfix* pada operator unary.
- Menggunakan operator *ternary* untuk logika sederhana.

## Teori / Penjelasan

**1. Operator Aritmatika**
Digunakan untuk operasi matematika dasar.
- `+` (Penjumlahan)
- `-` (Pengurangan)
- `*` (Perkalian)
- `/` (Pembagian): Perhatikan bahwa membagi `int` dengan `int` akan menghasilkan `int` (mengabaikan sisa). Gunakan `double` untuk hasil desimal.
- `%` (Modulus): Menghasilkan sisa bagi. Berguna untuk mengecek bilangan genap/ganjil.

**2. Operator Assignment (Penugasan)**
Digunakan untuk memberikan nilai ke variabel.
- `=` (Sama dengan)
- `+=`, `-=`, `*=`, `/=`, `%=` (Compound assignment)

**3. Operator Perbandingan (Relational)**
Menghasilkan nilai `boolean` (`true` atau `false`).
- `==` (Sama dengan)
- `!=` (Tidak sama dengan)
- `>`, `<`, `>=`, `<=` (Lebih dari, Kurang dari, dll.)

**4. Operator Logika**
Digunakan untuk menggabungkan dua atau lebih kondisi boolean.
- `&&` (Logical AND): `true` jika kedua kondisi `true`.
- `||` (Logical OR): `true` jika salah satu kondisi `true`.
- `!` (Logical NOT): Membalik nilai boolean.
*Short-circuit evaluation:* Pada `&&`, jika kondisi pertama `false`, kondisi kedua tidak dievaluasi. Pada `||`, jika kondisi pertama `true`, kondisi kedua tidak dievaluasi.

**5. Operator Unary**
Beroperasi pada satu operand (variabel).
- `++` (Increment, tambah 1)
- `--` (Decrement, kurang 1)
*Prefix* (`++i`): Ditambah dulu, baru nilainya digunakan.
*Postfix* (`i++`): Nilainya digunakan dulu, baru ditambah.

**6. Operator Ternary**
Sintaks singkat untuk kondisi `if-else`.
Sintaks: `kondisi ? nilaiTrue : nilaiFalse`

**Operator Precedence:**
Urutan prioritas operator. Misalnya, perkalian `*` dilakukan sebelum penjumlahan `+`. Gunakan kurung `()` untuk mengatur prioritas.

## Contoh Program
- `Operators.java`: Demonstrasi dari seluruh jenis operator di Java dengan komentar yang detail.

## Latihan
1. Buat program kalkulator sederhana (menerima input 2 angka hardcode, lalu tampilkan hasil `+`, `-`, `*`, `/`, `%`).
2. Buat program untuk mengecek apakah sebuah bilangan adalah genap atau ganjil menggunakan modulus dan ternary operator.

## Referensi
- [Java Operators - W3Schools](https://www.w3schools.com/java/java_operators.asp)
