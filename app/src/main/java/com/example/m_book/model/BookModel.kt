package com.example.m_book.model




//{
//    "id": "15",
//    "code": null,
//    "judul": "ryan",
//    "pengarang": "ryan",
//    "tahun_terbit": "2014",
//    "kota_terbit": "jogjaa",
//    "sampul": "1670428523_3b6bfdb5b6f85985d3de.png",
//    "isi_konten": "ini adalah konten"
//}
data class BookModel(
    val id: String?,
    val code: String?,
    val judul: String?,
    val pengarang: String?,
    val tahun_terbit: String?,
    val kota_terbit: String?,
    val isi_konten: String?,
)
