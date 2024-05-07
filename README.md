# Penyelesaian Permainan Word Ladder Menggunakan Algoritma UCS, Greedy Best First Search, dan A*
> REPOSITORY INI HANYA MENGANDUNG BACKEND. Klik link [ini](https://github.com/riyorax/Tucil3_13522061) untuk mencapai repository utama.
## Table of Contents
- [Penyelesaian Permainan Word Ladder Menggunakan Algoritma UCS, Greedy Best First Search, dan A\*](#penyelesaian-permainan-word-ladder-menggunakan-algoritma-ucs-greedy-best-first-search-dan-a)
  - [Table of Contents](#table-of-contents)
  - [General Information](#general-information)
  - [Technologies Used](#technologies-used)
  - [Features](#features)
  - [Setup](#setup)
  - [Usage](#usage)
  - [Links](#links)
<!-- * [License](#license) -->


## General Information
Pada tugas kecil ini kami ditugaskan untuk membuat program pencarian solusi dari game word ladder. Disini kami menggunakan algoritma pencarian UCS, GBFS, dan A* dan juga menggunakan bahasa Java dalam pengeimplementasiannya. Program menerima kata awal dan kata akhir dan mengembalikan path yang diambil untuk mendapatkan solusi.


## Technologies Used
- Java
- Springboot
- React


## Features
List the ready features here:
- Mencari solusi optimal menggunakan UCS
- Mencari solusi menggunakan GBFS
- Mencari solusi optimal menggunakan A*

## Setup
Untuk menjalankan program ini maka dibutuhkan IDE IntelliJ yang merupakan IDE khusus Java dan Kotlin. Anda dapat mengunduhnya pada link [ini](https://www.jetbrains.com/idea/download/?section=mac) dan jika ingin mendapatkan versi ultimate maka klik link [ini](https://www.jetbrains.com/community/education/#students) dan daftar menggunakan akun std stei, disana anda akan mendapatkan license ultimate secara gratis.


## Usage
Jika sudah mengunduh maka buat project baru dari repository dan masukkan link repository ini.

Kemudian telusuri src/main/java dan buka file "Tucil313522061BeApplication". Tunggu IDE untuk menginstall dependencies terlebih dahulu. Jika tidak terjadi pengunduhan coba click tombol run pada kanan atas. Setelah dependencies terpasang click tombol run pada kanan atas

Jika ingin mengubah dictionary yang dipakai maka pada folder src/main/resources masukkan file .txt yang ingin digunakan kemudian cari class Dictionary.java pada src/main/java/model dan ganti dictionary.txt pada
```shell
Resource resource = new ClassPathResource("dictionary.txt");
```
Menjadi nama txt yang ingin digunakan. PASTIKAN FILE MEMILIKI FORMAT YANG SESUAI DENGAN dictionary.txt :')



## Links
- [Link Spek](https://docs.google.com/document/d/1TUvKn-vPXhLsxga8K7mjSUbYnInHp2TSRtGFWlngwYk/edit)
- [Link Laporan](https://docs.google.com/document/d/1-sLCyWsWPvsNpP2iUOl8SdsGduytEipTyRx4QoV2p88/edit?usp=sharing)