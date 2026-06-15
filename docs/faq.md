# Frequently Asked Questions (FAQ)

**1. Apa bedanya JDK, JRE, dan JVM?**
- **JVM (Java Virtual Machine)**: Mesin virtual yang menjalankan bytecode Java.
- **JRE (Java Runtime Environment)**: Berisi JVM dan library dasar untuk *menjalankan* program Java.
- **JDK (Java Development Kit)**: Berisi JRE dan tools (seperti `javac`) untuk *mengembangkan/membuat* program Java.

**2. Kenapa harus pakai JDK 17?**
JDK 17 adalah versi LTS (Long Term Support) yang stabil dan banyak digunakan di industri saat ini.

**3. Apakah harus pakai VS Code? Boleh pakai IntelliJ / Eclipse?**
Boleh saja. VS Code dipilih dalam panduan ini karena ringan dan gratis, sangat cocok untuk pemula. Jika Anda sudah terbiasa atau lebih memilih IntelliJ IDEA atau Eclipse, silakan gunakan.

**4. Error "javac is not recognized" — cara fix**
Artinya Java belum didaftarkan ke environment variable `PATH` OS Anda. Silakan lihat panduan instalasi di folder `docs/installation/` untuk mengatur `PATH`.

**5. Apa bedanya `java` dan `javac`?**
- `javac` (Java Compiler): Digunakan untuk mengubah file `.java` (source code) menjadi `.class` (bytecode).
- `java`: Digunakan untuk menjalankan file `.class` (bytecode) tersebut di dalam JVM.

**6. Kenapa nama file harus sama dengan nama class?**
Di Java, jika sebuah class memiliki access modifier `public`, maka class tersebut harus disimpan di dalam file yang namanya persis sama dengan nama class tersebut (case-sensitive).

**7. Apa itu `public static void main(String[] args)`?**
Itu adalah titik awal (entry point) dari sebuah program Java. Ketika kita menjalankan program, JVM akan mencari method ini pertama kali untuk dieksekusi.

**8. Bagaimana cara debug di VS Code?**
Dengan Extension Pack for Java terinstall, Anda bisa menambahkan *breakpoint* (titik merah) di sebelah kiri nomor baris kode, lalu klik tombol **Debug** (atau ikon serangga) yang muncul di atas method `main`.

**9. Apakah materi ini cukup untuk mendapatkan pekerjaan?**
Materi ini adalah fondasi (Java Core). Untuk bekerja di industri, Anda biasanya perlu mempelajari framework tambahan seperti Spring Boot untuk backend, dan teknologi terkait lainnya. Namun, menguasai fondasi ini sangat krusial.

**10. Di mana bisa belajar lebih lanjut setelah menyelesaikan repository ini?**
Anda bisa mempelajari Java Spring Boot untuk Backend Web Development, atau Android Development menggunakan Java. Dokumentasi resmi Spring dan berbagai tutorial di YouTube bisa menjadi langkah selanjutnya.
