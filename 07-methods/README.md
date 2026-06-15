# 🛠️ Modul 07: Methods
Method adalah sekumpulan blok kode yang diberi nama dan dapat dieksekusi atau dipanggil kembali. Method membantu kita menghindari penulisan kode yang berulang.

## Daftar Isi
- [Tujuan Pembelajaran](#tujuan-pembelajaran)
- [Teori / Penjelasan](#teori--penjelasan)
- [Contoh Program](#contoh-program)
- [Latihan](#latihan)
- [Referensi](#referensi)

## Tujuan Pembelajaran
- Memahami konsep dasar method dan manfaatnya (reusability)
- Mampu membuat method dengan dan tanpa return value
- Mampu menggunakan parameter dan argumen
- Memahami konsep method overloading
- Mengetahui perbedaan scope variabel (local vs global)
- Mengenal konsep dasar rekursi

## Teori / Penjelasan
Method di Java mirip dengan fungsi dalam matematika, di mana ia menerima input, melakukan proses, dan bisa mengembalikan output.
- **Deklarasi Method**: `accessModifier returnType methodName(parameters) { // body }`
- **Void vs Return**: `void` artinya method tidak mengembalikan nilai. Jika tipe selain `void` (seperti `int`, `String`), wajib menggunakan keyword `return`.
- **Parameter vs Argumen**: Parameter adalah variabel dalam deklarasi method, argumen adalah nilai yang dikirim saat memanggil method.
- **Overloading**: Membuat lebih dari satu method dengan nama yang sama, asalkan tipe atau jumlah parameternya berbeda.

```java
// Contoh deklarasi
public static int tambah(int a, int b) {
    return a + b;
}
```

## Contoh Program
- `MethodBasic.java`: Menunjukkan method void dan method dengan return value.
- `MethodParameter.java`: Menunjukkan penggunaan multiple parameter, method overloading, dan contoh sederhana rekursi serta scope variabel.

## Latihan
1. Buat method `hitungLuasSegitiga(double alas, double tinggi)` yang mengembalikan nilai luas.
2. Buat method overloading `cetakInfo()` yang bisa menerima 1 parameter nama, atau 2 parameter nama dan umur, atau 3 parameter nama, umur, dan alamat.

## Referensi
- [Oracle Java Docs - Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
