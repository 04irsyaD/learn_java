# ☕ Java Learning

![GitHub license](https://img.shields.io/github/license/username/java-learning)
![GitHub stars](https://img.shields.io/github/stars/username/java-learning?style=social)
![GitHub forks](https://img.shields.io/github/forks/username/java-learning?style=social)

Selamat datang di repository **Java Learning**! Repository ini disusun secara khusus untuk membantu pemula belajar bahasa pemrograman Java dari dasar hingga mampu membuat project aplikasi sederhana.

---

## 📑 Table of Contents
- [Tentang Repository](#-tentang-repository)
- [Prasyarat](#-prasyarat)
- [Panduan Instalasi](#-panduan-instalasi)
- [Verifikasi Instalasi](#-verifikasi-instalasi)
- [Roadmap Pembelajaran](#-roadmap-pembelajaran)
- [Struktur Repository](#-struktur-repository)
- [Cara Menjalankan Program Java](#-cara-menjalankan-program-java)
- [Kontribusi](#-kontribusi)
- [Lisensi](#-lisensi)

---

## 🎯 Tentang Repository

Repository **Java Learning** dirancang sebagai panduan belajar komprehensif bagi mahasiswa, pelajar, maupun siapa saja yang ingin memulai karir sebagai Software Engineer, khususnya di ekosistem Java. Materi disusun secara terstruktur agar mudah diikuti oleh mereka yang belum memiliki latar belakang pemrograman sama sekali.

---

## 🛠️ Prasyarat

Sebelum memulai perjalanan belajar Java, pastikan Anda telah menginstal beberapa perangkat lunak berikut di komputer Anda:

- **Java JDK (Java Development Kit):** Compiler dan runtime environment utama untuk menjalankan Java (Disarankan menggunakan versi 17 atau terbaru).
- **Visual Studio Code (VS Code):** Teks editor yang ringan dan powerful.
- **Extension Pack for Java:** Ekstensi VS Code dari Microsoft untuk memudahkan penulisan kode Java.
- **Git:** Version control system untuk mengelola kode dan mengunduh repository ini.

---

## 📥 Panduan Instalasi

Berikut adalah panduan instalasi berdasarkan sistem operasi yang Anda gunakan:

### 🪟 Windows
1. Unduh installer JDK dari [situs resmi Oracle](https://www.oracle.com/java/technologies/downloads/) atau gunakan [Adoptium (Temurin)](https://adoptium.net/).
2. Jalankan installer dan ikuti instruksi hingga selesai.
3. Pastikan untuk menambahkan Java ke dalam `PATH` environment variable.

### 🐧 Linux (Ubuntu/Debian)
Buka terminal dan jalankan perintah berikut:
```bash
sudo apt update
sudo apt install default-jdk
```

### 🍎 macOS
Anda dapat menggunakan Homebrew untuk menginstal JDK dengan mudah. Buka terminal dan jalankan:
```bash
brew install openjdk
```

---

## ✅ Verifikasi Instalasi

Setelah proses instalasi selesai, pastikan Java sudah terkonfigurasi dengan benar. Buka terminal (atau Command Prompt / PowerShell) dan ketikkan perintah berikut:

Cek versi Java Runtime Environment (JRE):
```bash
java -version
```

Cek versi Java Compiler (JDK):
```bash
javac -version
```

Jika output menampilkan versi Java yang Anda instal, maka instalasi berhasil!

---

## 🗺️ Roadmap Pembelajaran

Materi dalam repository ini dibagi menjadi beberapa tahapan yang sebaiknya dipelajari secara berurutan:

1. **Hello World** - Program pertama dan struktur dasar kode Java
2. **Variabel** - Cara menyimpan data dalam memori
3. **Tipe Data** - Mengenal jenis-jenis data (int, double, String, boolean, dll)
4. **Operator** - Operasi aritmatika, logika, dan perbandingan
5. **Percabangan** - Mengatur alur program (`if-else`, `switch-case`)
6. **Perulangan** - Menjalankan blok kode berulang kali (`for`, `while`, `do-while`)
7. **Array** - Menyimpan banyak nilai dalam satu variabel
8. **Method** - Membuat fungsi untuk menggunakan ulang kode
9. **Object Oriented Programming (OOP)** - Konsep Class, Object, Inheritance, Polymorphism, Encapsulation, dan Abstraction
10. **Collection Framework** - Struktur data dinamis (`ArrayList`, `HashMap`, `HashSet`)
11. **Exception Handling** - Menangani error saat program berjalan (`try-catch`)
12. **File Handling** - Membaca dan menulis data ke dalam file
13. **Database JDBC** - Menghubungkan program Java ke database relasional (MySQL/PostgreSQL)
14. **Mini Project** - Menggabungkan semua materi untuk membuat project sederhana

---

## 📂 Struktur Repository

Berikut adalah gambaran struktur folder pada repository ini:

```text
java-learning/
├── 01_HelloWorld/
│   └── HelloWorld.java
├── 02_Variabel/
├── 03_TipeData/
├── 04_Operator/
├── ...
├── 14_MiniProject/
└── README.md
```

---

## ▶️ Cara Menjalankan Program Java

Untuk menjalankan program Java melalui terminal, ikuti langkah-langkah berikut:

1. **Kompilasi (Compile):** Mengubah file `.java` menjadi Java Bytecode (`.class`).
   ```bash
   javac HelloWorld.java
   ```
2. **Jalankan (Run):** Mengeksekusi file Bytecode yang telah dikompilasi.
   ```bash
   java HelloWorld
   ```
   *(Catatan: Jangan tambahkan ekstensi `.class` saat menjalankan perintah `java`)*

---

## 🤝 Kontribusi

Repository ini bersifat Open Source. Kami sangat mengapresiasi kontribusi dari siapa pun! Jika Anda menemukan kesalahan penulisan, bug pada kode, atau ingin menambahkan materi pembelajaran baru, silakan lakukan langkah berikut:

1. Lakukan **Fork** pada repository ini.
2. Buat branch baru (`git checkout -b fitur-baru-anda`).
3. Lakukan **Commit** perubahan Anda (`git commit -m 'Menambahkan materi tentang Thread'`).
4. Lakukan **Push** ke branch Anda (`git push origin fitur-baru-anda`).
5. Buat **Pull Request** agar kami dapat meninjaunya.

---

## 📄 Lisensi

Repository ini dilisensikan di bawah **MIT License**. Anda bebas menggunakan, memodifikasi, dan mendistribusikan ulang materi yang ada di sini baik untuk kepentingan pribadi maupun komersial.
