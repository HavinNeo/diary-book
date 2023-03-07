package com.example.m_book.api

import com.example.m_book.`interface`.APIInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    const val BASE_URL = "http://192.168.1.8/book-api/public/"

    fun create() : APIInterface {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(APIInterface::class.java)
    }
}