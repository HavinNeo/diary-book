package com.example.m_book.`interface`

import com.example.m_book.model.BookModel
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {
    @GET("books")
    fun getBooks(): Call<ArrayList<BookModel>>

    @GET("books/{id}")
    fun getBook( @Path("id") id:Int ): Call<ArrayList<BookModel>>

    @FormUrlEncoded
    @POST("Books")
    fun createBooks(
        @Field("kode")kode: String,
        @Field("judul")judul: String,
        @Field("pengarang")pengarang: String,
        @Field("tahun_terbit")tahun_terbit: String,
        @Field("kota_terbit")kota_terbit: String,
        @Field("sampul")sampul: String,
        @Field("isi_konten")isi_konten: String,
    ) : Call<BookModel>

    @POST("Books/{id}")
    fun updateBooks(
        @Path("id")id: Int,
        @Field("kode")kode: String,
        @Field("judul")judul: String,
        @Field("pengarang")pengarang: String,
        @Field("tahun_terbit")tahun_terbit: String,
        @Field("kota_terbit")kota_terbit: String,
        @Field("sampul")sampul: String,
        @Field("isi_konten")isi_konten: String,
    ) : Call<BookModel>

//    {
//        "id": "15",
//        "code": null,
//        "judul": "ryan",
//        "pengarang": "ryan",
//        "tahun_terbit": "2014",
//        "kota_terbit": "jogjaa",
//        "sampul": "1670428523_3b6bfdb5b6f85985d3de.png",
//        "isi_konten": "ini adalah konten"
//    }

    @DELETE("books/{id}")
    fun deleteBook(@Path("id") id: Int): Call<Unit>


}
