# Tugas UTSPBO 23064 Ahmad Zulkarnaen 3D
## Cara Menjalankan

1. **Clone repository**:
    ```sh
    git clone <URL_REPOSITORY>
    cd <NAMA_FOLDER_REPOSITORY>
    ```

2. **Buka proyek di IDE**:
    Buka proyek di IDE favorit Anda (misalnya, IntelliJ IDEA, Eclipse, atau NetBeans).

3. **Jalankan program**:
    Jalankan kelas `Main` yang berada di package `main`.

## Kelas dan Fungsionalitas

### Main.java
Kelas ini berfungsi sebagai titik masuk utama untuk menjalankan aplikasi.

### User.java
Kelas abstrak yang merepresentasikan pengguna umum dalam sistem. Memiliki atribut `name`, `password`, `rooms`, dan `reservations`.

### Admin.java
Kelas yang merepresentasikan admin dalam sistem. Admin memiliki akses untuk mengelola kamar dan membuat laporan.

### Customer.java
Kelas yang merepresentasikan customer dalam sistem. Customer dapat melakukan reservasi kamar dan melihat detail pesanan mereka.

### Room.java
Kelas yang merepresentasikan kamar dalam hotel. Memiliki atribut `roomNumber`, `type`, `price`, `facilities`, dan `isBooked`.

### Reservation.java
Kelas yang merepresentasikan reservasi kamar. Memiliki atribut `roomNumber`, `customerName`, `checkInDate`, dan `checkOutDate`.

### HotelManagement.java
Kelas yang mengelola logika aplikasi, termasuk login, sign up, menu pengguna, dan fitur-fitur lainnya.

## Contoh Penggunaan

1. **Login**:
    - Masukkan jenis pengguna (admin/customer).
    - Masukkan nama dan password.

2. **Sign Up**:
    - Masukkan jenis pengguna (admin/customer).
    - Masukkan nama dan password.

3. **Reservasi Kamar**:
    - Pilih opsi untuk memesan kamar.
    - Masukkan nomor kamar yang ingin dipesan.

4. **Cek Ketersediaan Kamar**:
    - Pilih opsi untuk memeriksa ketersediaan kamar.
    - Masukkan nomor kamar yang ingin diperiksa.

5. **Lihat Detail Pesanan**:
    - Pilih opsi untuk melihat detail pesanan.

6. **Batalkan Pesanan**:
    - Pilih opsi untuk membatalkan pesanan.
    - Masukkan nomor kamar yang ingin dibatalkan.

7. **Perbarui Informasi Pengguna**:
    - Pilih opsi untuk memperbarui informasi pengguna.
    - Masukkan nama dan password baru.

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan fork repository ini dan buat pull request dengan perubahan yang Anda usulkan.

## Lisensi

Proyek ini dilisensikan di bawah [MIT License](LICENSE).
