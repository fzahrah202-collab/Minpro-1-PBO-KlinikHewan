# Minpro-1-PBO-KlinikHewan

## Deskripsi Singkat Program

Sistem Manajemen Klinik Hewan merupakan program berbasis Java yang digunakan untuk mengelola data klinik hewan. Program ini dapat melakukan proses CRUD (Create, Read, Update, Delete) terhadap data pemilik, data hewan, dan data pemeriksaan.

Program dibuat dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO) seperti class, object, constructor, access modifier, encapsulation, ArrayList, percabangan, dan perulangan.

## Class yang Digunakan

### 1. KlinikHewan

Merupakan class entry point yang digunakan untuk menjalankan program dan menampilkan menu utama.

### 2. Service

Digunakan untuk menangani proses CRUD, yaitu menambah, menampilkan, menghapus, dan memperbarui data.

### 3. Hewan

Digunakan untuk menyimpan data hewan seperti ID Data, nama hewan, jenis hewan, dan umur.

### 4. Pemilik

Digunakan untuk menyimpan data pemilik seperti ID Data, nama pemilik, dan nomor telepon.

### 5. Pemeriksaan

Digunakan untuk menyimpan data pemeriksaan seperti ID Data, keluhan, dan diagnosa.

## Alur Program

1. Program dijalankan dan menampilkan menu utama.
2. User memilih menu yang ingin digunakan.
3. Jika memilih Tambah Data, user mengisi data pemilik, hewan, dan pemeriksaan.
4. Data yang sudah dimasukkan akan disimpan.
5. Jika memilih Tampilkan Data, program akan menampilkan semua data yang sudah tersimpan.
6. Jika memilih Hapus Data, user memasukkan ID Data yang ingin dihapus.
7. Jika memilih Update Data, user memasukkan ID Data lalu mengubah data yang diinginkan.
8. Jika memilih Keluar, program akan berhenti.
9. Program akan terus berjalan sampai user memilih menu Keluar.

## Penerapan Nilai Tambah

### Access Modifier

Access modifier diterapkan dengan menggunakan `private` pada atribut setiap class dan `public` pada constructor, getter, dan setter.

<img width="324" height="105" alt="image" src="https://github.com/user-attachments/assets/4441054f-6c84-4a8b-89e0-0cd2e1f676df" />

### Encapsulation
Encapsulation diterapkan dengan membuat atribut menjadi private dan menggunakan getter serta setter untuk mengakses atau mengubah data.

<img width="365" height="453" alt="image" src="https://github.com/user-attachments/assets/1f58e05e-801d-41d6-9e96-6b99ad29becf" />

### Validasi Input
Validasi input diterapkan pada pemilihan menu. Jika user memasukkan pilihan selain 1 sampai 5, program akan menampilkan pesan Pilihan tidak valid! dan kembali ke menu utama.

<img width="337" height="264" alt="image" src="https://github.com/user-attachments/assets/223dd7bc-f395-4ec3-a065-e399633573c1" />


### Dokumentasi Program
1. Menu Utama
   
   <img width="697" height="385" alt="image" src="https://github.com/user-attachments/assets/0a58d7b6-b385-4f03-bad4-f0f6d7a0bfc6" />

2. Tambah Data
   
   <img width="439" height="686" alt="image" src="https://github.com/user-attachments/assets/eda68bd5-6995-4c73-adcd-3f0673459b39" />

3. Tampilkan Data
   
   <img width="418" height="685" alt="image" src="https://github.com/user-attachments/assets/81f95268-fe5b-461e-be94-1e3df974f202" />

4. Update Data
   
   <img width="402" height="717" alt="image" src="https://github.com/user-attachments/assets/d4147c24-22d0-4af9-ba20-2e70bfeb44c7" />

5. Hapus Data
    
   <img width="309" height="490" alt="image" src="https://github.com/user-attachments/assets/a08bbbea-0c18-40ec-b5db-312c35579184" />








