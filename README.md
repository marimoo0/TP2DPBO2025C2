# TP 2 DPBO 2025

## -- Janji --

Saya Khana Yusdiana NIM 2100991 mengerjakan soal TP 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## -- Desain Program --

Program berbasis OOP dengan menerapkan konsep Multi-level Inheritance.

Terdapat 3 Kelas yaitu kelas PetShop, Aksesoris, Baju

![1](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Class%20Diagram.png)

#### 1. Kelas PetShop

- memiliki private atribut untuk menyimpan data id, nama_produk, harga_produk, stok_produk, foto_produk.
- memiliki public method kontruktor, setter, dan getter untuk id, nama_produk, harga_produk, stok_produk, foto_produk.. Setter untuk menginisialisasi atribut sedangkan getter untuk mereturn nilai atribut pada kelas
- kelas PetShop ini menjadi super/base class, yaitu parent dari kelas Aksesoris

#### 2. Kelas Aksesoris

- memiliki private atribu untuk menyimpan data jenis, bahan, warna
- memiliki public method kontruktor, setter, dan getter untuk jenis, bahan, warna . Setter untuk menginisialisasi atribut sedangkan getter untuk mereturn nilai atribut pada kelas
- kelas Aksesoris ini menjadi derived class 1/Intermediary Class, yaitu child dari kelas PetShop dan parent dari kelas Baju

#### 3. Kelas Baju

- memiliki private atribut untuk menyimpan data size, merk
- memiliki public method kontruktor, setter, dan getter untuk size, merk. Setter untuk menginisialisasi atribut sedangkan getter untuk mereturn nilai atribut pada kelas
- kelas Baju ini menjadi derived class 2, yaitu child dari kelas Aksesoris

## -- Penjelasan Alur --

- Pertama, import library dan file kelas yang digunakan
- Membuat list of objek PetShop
- Instansiasi objek PetShop
- inisialisasi objek PetShop dengan menggunakan method setter yang ada pada kelas PetShop
- masukan objek ke dalam listPetShop
- menampilkan isi list PetShop

## -- Dokumentasi saat Program di Jalankan --

### Program dengan CPP

![1](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/CPP/SS/Screenshot_1.png)
![2](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/CPP/SS/Screenshot_2.png)
![3](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/CPP/SS/Screenshot_3.png)
![4](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/CPP/SS/Screenshot_4.png)

### Program dengan Java

![1](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Java/SS/Screenshot_1.png)
![2](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Java/SS/Screenshot_2.png)
![3](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Java/SS/Screenshot_3.png)
![4](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Java/SS/Screenshot_4.png)

### Program dengan Pyhton

![1](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Python/SS/Screenshot_1.png)
![2](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Python/SS/Screenshot_2.png)
![3](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Python/SS/Screenshot_3.png)
![4](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/Python/SS/Screenshot_4.png)

### Program dengan PHP

![1](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/PHP/SS/Screenshot_1.png)
![2](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/PHP/SS/Screenshot_2.png)
![3](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/PHP/SS/Screenshot_3.png)
![4](https://github.com/marimoo0/TP2DPBO2025C2/blob/9b99b3eb8f3cd28aaa53ee52a0342297ee2ccaa9/PHP/SS/Screenshot_4.png)
