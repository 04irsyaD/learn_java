# 🔀 Modul 04: Conditional Statements
Mengontrol alur eksekusi program menggunakan struktur percabangan.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep percabangan atau logika kondisional.
- Mampu menggunakan statement `if`, `if-else`, dan *nested* `if`.
- Menggunakan `else if` ladder untuk mengevaluasi lebih dari dua kondisi.
- Mampu menggunakan `switch-case` dan memahami penggunaannya dibandingkan dengan `if-else`.

## Teori / Penjelasan

**Apa itu Percabangan?**
Percabangan dapat dianalogikan sebagai persimpangan jalan, di mana program akan mengambil jalur yang berbeda berdasarkan kondisi tertentu yang bernilai `true` atau `false`.

**1. `if` Statement**
Mengeksekusi blok kode hanya jika kondisinya bernilai `true`.
```java
if (kondisi) {
    // kode dieksekusi jika kondisi true
}
```

**2. `if-else` Statement**
Menyediakan alternatif eksekusi jika kondisi `if` bernilai `false`.
```java
if (kondisi) {
    // dieksekusi jika true
} else {
    // dieksekusi jika false
}
```

**3. `else if` Ladder**
Digunakan ketika terdapat lebih dari 2 kemungkinan kondisi.
```java
if (kondisi1) {
    // eksekusi
} else if (kondisi2) {
    // eksekusi
} else {
    // eksekusi jika semua salah
}
```

**4. Nested `if`**
Statement `if` di dalam statement `if` lainnya, digunakan untuk pengecekan berjenjang.

**5. `switch-case` Statement**
Struktur yang lebih elegan dibandingkan `else if` yang panjang, terutama ketika mengecek nilai tunggal (seperti menu pilihan).
- Mendukung tipe data `byte`, `short`, `int`, `char`, `String`, dan `enum`.
- `break` digunakan untuk menghentikan evaluasi kasus selanjutnya (mencegah *fall-through*).
- `default` berfungsi seperti `else`, dijalankan ketika tidak ada case yang cocok.

## Contoh Program
- `IfElse.java`: Demonstrasi dari penggunaan `if`, `if-else`, `else if` ladder, dan *nested* `if`.
- `SwitchCase.java`: Demonstrasi penggunaan statement `switch` dengan tipe data `int` dan `String`, termasuk perilaku `fall-through` jika tanpa `break`.

## Latihan
1. Buat program untuk menentukan grade nilai huruf (A, B, C, D, E) berdasarkan nilai angka (0-100).
2. Buat program yang menentukan nama hari berdasarkan input angka 1-7 menggunakan struktur `switch-case`.

## Referensi
- [Java If...Else - W3Schools](https://www.w3schools.com/java/java_conditions.asp)
- [Java Switch - W3Schools](https://www.w3schools.com/java/java_switch.asp)
