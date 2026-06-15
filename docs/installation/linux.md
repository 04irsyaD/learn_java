# Panduan Instalasi Java di Linux

Panduan ini akan membantu Anda menginstall JDK, Visual Studio Code, dan Git di Linux (berbasis Debian/Ubuntu).

## 1. Install JDK via Package Manager
Buka terminal dan jalankan perintah berikut untuk menginstall OpenJDK 17:
```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

*(Alternatif: Anda juga bisa mendownload binary dari [Adoptium](https://adoptium.net/)).*

## 2. Setup `JAVA_HOME`
1. Buka file `.bashrc` atau `.zshrc` Anda menggunakan editor teks (misal: `nano ~/.bashrc`).
2. Tambahkan baris berikut di bagian paling bawah:
   ```bash
   export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
   export PATH=$PATH:$JAVA_HOME/bin
   ```
   *(Sesuaikan path dengan lokasi instalasi JDK di sistem Anda).*
3. Simpan dan muat ulang konfigurasi:
   ```bash
   source ~/.bashrc
   ```

## 3. Install Visual Studio Code
Anda bisa menginstall VS Code melalui snap:
```bash
sudo snap install --classic code
```
Atau download file `.deb` dari [situs resmi VS Code](https://code.visualstudio.com/) dan install via `sudo apt install ./code_*.deb`.

## 4. Install Extension Pack for Java
1. Buka VS Code.
2. Buka panel Extensions (`Ctrl+Shift+X`).
3. Cari "Extension Pack for Java" oleh Microsoft.
4. Klik **Install**.

## 5. Install Git
Jalankan perintah berikut di terminal:
```bash
sudo apt install git
```

## 6. Verifikasi Instalasi
Verifikasi dengan menjalankan perintah berikut di terminal:
```bash
java -version
javac -version
git --version
```

## 7. Troubleshooting Umum
- Jika `javac` tidak ditemukan, pastikan package `openjdk-17-jdk` (bukan hanya `jre`) sudah terinstall.
- Pastikan konfigurasi `JAVA_HOME` dan `PATH` sudah dimuat ulang dengan `source`.
