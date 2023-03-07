package com.example.m_book.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.m_book.R
import com.example.m_book.api.APIClient
import com.example.m_book.model.BookModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MenuBookFragment : Fragment(R.layout.fragment_menu_book) {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_menu_book, container, false)
        // Inflate the layout for this fragment

        getBooksData()
        return root
    }


    private fun getBooksData(){

        val apiClient = APIClient.create()
        val callData = apiClient.getBooks()

        callData.enqueue(
            object : Callback<ArrayList<BookModel>>{
                override fun onResponse(
                    call: Call<ArrayList<BookModel>>,
                    response: Response<ArrayList<BookModel>>
                ) {
                    val data = response.body()
                    val dt_code = response.code().toString()
                    Log.d("this_data", data.toString())
                }

                override fun onFailure(call: Call<ArrayList<BookModel>>, t: Throwable) {

                }
            }
        )
    }
}