# ☕ Java Learning Repository

![Java Version](https://img.shields.io/badge/Java-17%2B-blue?logo=java)
![License](https://img.shields.io/badge/License-MIT-green)
![Stars](https://img.shields.io/github/stars/username/learn_java?style=social)
![Forks](https://img.shields.io/github/forks/username/learn_java?style=social)

Selamat datang di **Java Learning Repository**! Repository ini adalah panduan lengkap dan terstruktur bagi pemula yang ingin belajar bahasa pemrograman Java dari dasar hingga dapat membuat aplikasi yang terhubung ke database.

---

## 📑 Daftar Isi

- [Tentang Repository](#-tentang-repository)
- [Prasyarat](#-prasyarat)
- [Quick Start](#-quick-start)
- [Panduan Instalasi](#-panduan-instalasi)
- [Verifikasi Instalasi](#-verifikasi-instalasi)
- [Roadmap Pembelajaran](#-roadmap-pembelajaran)
- [Struktur Repository](#-struktur-repository)
- [Cara Menjalankan Program](#-cara-menjalankan-program)
- [Exercises & Challenges](#-exercises--challenges)
- [Mini Projects](#-mini-projects)
- [Kontribusi](#-kontribusi)
- [Lisensi](#-lisensi)
- [Kontak & Support](#-kontak--support)

---

## 🎯 Tentang Repository

**Tujuan:** Repository ini dibuat untuk memfasilitasi pembelajaran mandiri (self-study) bahasa pemrograman Java dengan materi yang sistematis, mudah dipahami, dan disertai banyak contoh kode serta latihan.

**Target Learner:**
- Mahasiswa IT / Ilmu Komputer yang baru mendapatkan mata kuliah Algoritma dan Pemrograman.
- Pelajar atau pemula yang sama sekali belum pernah belajar programming.
- Siapapun yang ingin memperkuat pemahaman fundamental Java (Java Core) sebelum terjun ke framework seperti Spring Boot atau Android.

---

## ⚙️ Prasyarat

Sebelum mulai belajar, pastikan perangkat Anda telah terinstall software berikut:
1. **JDK (Java Development Kit) versi 17 atau lebih baru**.
2. **Visual Studio Code (VS Code)** (direkomendasikan) atau IDE lain seperti IntelliJ IDEA / Eclipse.
3. **Extension Pack for Java** (jika menggunakan VS Code).
4. **Git** untuk mengunduh (clone) repository ini.
5. **MySQL Server & Workbench** (Khusus untuk Modul 12).

---

## 🚀 Quick Start

Hanya butuh 3 langkah untuk mulai menjalankan kode di dalam repository ini:

1. **Clone repository ini ke komputer Anda:**
   ```bash
   git clone https://github.com/username/learn_java.git
   ```

2. **Masuk ke folder modul pertama dan compile:**
   ```bash
   cd learn_java/01-hello-world
   javac HelloWorld.java
   ```

3. **Jalankan program:**
   ```bash
   java HelloWorld
   ```

---

## 🛠 Panduan Instalasi

Jika Anda belum menginstall prasyarat di atas, silakan ikuti panduan instalasi step-by-step sesuai dengan Sistem Operasi Anda:

- [🍎 Panduan Instalasi macOS](docs/installation/macos.md)
- [🪟 Panduan Instalasi Windows](docs/installation/windows.md)
- [🐧 Panduan Instalasi Linux](docs/installation/linux.md)

---

## ✅ Verifikasi Instalasi

Untuk memastikan semuanya sudah siap, buka terminal/Command Prompt dan ketikkan perintah berikut:

```bash
java -version
javac -version
```

Jika terminal menampilkan informasi versi Java (misal: `javac 17.0.x`), maka Anda sudah siap untuk mulai belajar!

---

## 🗺 Roadmap Pembelajaran

Ikuti urutan modul di bawah ini agar pemahaman Anda terstruktur. Anda juga dapat melihat [diagram roadmap lengkap di sini](docs/roadmap.md).

| Modul | Topik Pembelajaran | Deskripsi Singkat |
|---|---|---|
| [**01**](01-hello-world/) | Hello World | Pengenalan Java, JVM, dan cara menulis program pertama |
| [**02**](02-variables-and-data-types/) | Variables & Data Types | Konsep variabel dan tipe data primitif & referensi |
| [**03**](03-operators/) | Operators | Operator aritmatika, perbandingan, logika, dan penugasan |
| [**04**](04-conditional-statements/) | Conditional Statements | Pengambilan keputusan menggunakan `if`, `else`, dan `switch` |
| [**05**](05-loops/) | Loops | Perulangan menggunakan `for`, `while`, dan `do-while` |
| [**06**](06-arrays/) | Arrays | Menyimpan banyak data dalam struktur array 1D & 2D |
| [**07**](07-methods/) | Methods | Memecah program menjadi fungsi-fungsi kecil agar reusable |
| [**08**](08-oop/) | Object Oriented Programming | Konsep OOP: Class, Object, Encapsulation, Inheritance, dll |
| [**09**](09-collections/) | Collections | Struktur data tingkat lanjut: `ArrayList`, `HashSet`, `HashMap` |
| [**10**](10-exception-handling/) | Exception Handling | Menangani error atau pengecualian saat runtime |
| [**11**](11-file-handling/) | File Handling | Membaca dan menulis data ke dalam file teks |
| [**12**](12-database-jdbc/) | Database JDBC | Menghubungkan aplikasi Java ke database MySQL |

---

## 📁 Struktur Repository

```text
learn_java/
├── docs/                      # Dokumentasi pendukung
│   ├── installation/          # Panduan instalasi
│   ├── faq.md                 # Pertanyaan yang sering diajukan
│   ├── getting-started.md     # Panduan cara memulai
│   └── roadmap.md             # Visualisasi alur belajar
├── 01-hello-world/            # Folder modul materi (berlanjut hingga 12)
├── exercises/                 # Kumpulan soal latihan terpisah per level
│   ├── beginner/
│   ├── intermediate/
│   └── advanced/
├── challenges/                # Tantangan logika tanpa kode awal
├── projects/                  # Mini project dengan code starter
├── .gitignore                 # Daftar file yang diabaikan Git
├── LICENSE                    # Lisensi MIT
└── README.md                  # Halaman utama ini
```

---

## 💻 Cara Menjalankan Program

Cara termudah untuk menjalankan program Java (tanpa IDE kompleks) adalah melalui terminal:

1. Buka terminal (atau terminal internal VS Code dengan `` Ctrl + ` ``).
2. Arahkan direktori (gunakan perintah `cd`) ke folder tempat file `.java` berada.
3. Ubah source code menjadi bytecode menggunakan *compiler*:
   ```bash
   javac NamaFile.java
   ```
4. Jalankan *bytecode* yang telah dibuat:
   ```bash
   java NamaFile
   ```

> [!NOTE]
> Mulai dari Java 11+, Anda juga dapat menjalankan file `.java` secara langsung tanpa compile manual dengan perintah `java NamaFile.java`. Namun disarankan tetap mempelajari proses `javac` untuk memahami alurnya.

---

## 🏋️ Exercises & Challenges

Setelah mempelajari teori, uji kemampuan Anda di folder ini:

- [**Exercises**](exercises/): Berisi soal-soal latihan singkat dan spesifik per level (Beginner, Intermediate, Advanced) untuk menguji pemahaman per topik.
- [**Challenges**](challenges/): Tantangan kasus yang lebih kompleks yang meminta Anda membuat sebuah program kecil dari nol.

---

## 🏆 Mini Projects

Sebagai ujian akhir, cobalah kerjakan mini projects yang telah kami sediakan kerangka awalnya *(code starter)*:

1. [**Calculator App**](projects/calculator-app/) - Implementasi operasi aritmatika, kondisional, dan loop.
2. [**Student Management System**](projects/student-management-system/) - Implementasi OOP dan ArrayList.
3. [**Library Management System**](projects/library-management-system/) - Sistem perpustakaan dengan fitur pinjam/kembali buku.
4. [**Travel Booking System**](projects/travel-booking-system/) - Sistem pemesanan tiket dengan file handling/database.

---

## 🤝 Kontribusi

Kami sangat menyambut kontribusi dari siapa saja! Jika Anda menemukan salah ketik (typo), kode yang tidak efisien, atau ingin menambahkan soal latihan baru, silakan lakukan kontribusi dengan cara:

1. **Fork** repository ini.
2. Buat branch baru (`git checkout -b fitur-baru`).
3. Lakukan perubahan Anda dan **commit** (`git commit -m 'Menambahkan fitur XYZ'`).
4. **Push** ke branch (`git push origin fitur-baru`).
5. Buka **Pull Request** di GitHub.

---

## 📄 Lisensi

Repository ini dilisensikan di bawah [MIT License](LICENSE) - Anda bebas menggunakan, memodifikasi, dan mendistribusikan kode di dalam repository ini baik untuk tujuan personal maupun komersial, dengan tetap mencantumkan hak cipta aslinya.

---

## 📬 Kontak & Support

Jika Anda menemukan kendala saat belajar, kebingungan pada materi tertentu, atau menemukan *bug* pada contoh kode, jangan ragu untuk **membuka Issue** pada menu [Issues](https://github.com/username/learn_java/issues) di GitHub. Mari belajar bersama!

Happy Coding! 🚀
