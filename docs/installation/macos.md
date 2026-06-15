# Panduan Instalasi Java di macOS

Panduan ini akan membantu Anda menginstall JDK, Visual Studio Code, dan Git di macOS. Disarankan menggunakan **Homebrew**.

## 1. Install Homebrew (Jika Belum Ada)
Buka Terminal dan jalankan perintah berikut:
```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

## 2. Install JDK
Gunakan Homebrew untuk menginstall OpenJDK 17:
```bash
brew install openjdk@17
```

## 3. Setup `JAVA_HOME`
1. Buka file konfigurasi shell Anda (biasanya `.zshrc` untuk macOS modern):
   ```bash
   nano ~/.zshrc
   ```
2. Tambahkan baris berikut (Homebrew akan memberikan path yang tepat setelah instalasi selesai):
   ```bash
   export PATH="/usr/local/opt/openjdk@17/bin:$PATH"
   ```
   Atau jika menggunakan Apple Silicon (M1/M2):
   ```bash
   export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"
   ```
3. Simpan file dan muat ulang:
   ```bash
   source ~/.zshrc
   ```

## 4. Install Visual Studio Code
Install via Homebrew:
```bash
brew install --cask visual-studio-code
```
Atau download manual dari [situs resminya](https://code.visualstudio.com/).

## 5. Install Extension Pack for Java
1. Buka VS Code.
2. Buka panel Extensions (`Cmd+Shift+X`).
3. Cari "Extension Pack for Java" oleh Microsoft, lalu klik **Install**.

## 6. Install Git
Git biasanya sudah ada jika Anda menginstall Xcode Command Line Tools. Jika belum, jalankan:
```bash
xcode-select --install
```
Atau via Homebrew:
```bash
brew install git
```

## 7. Verifikasi Instalasi
Buka Terminal dan ketik:
```bash
java -version
javac -version
git --version
```

## 8. Troubleshooting Umum
- Pastikan path di `JAVA_HOME` sesuai dengan arsitektur Mac Anda (Intel vs Apple Silicon).
