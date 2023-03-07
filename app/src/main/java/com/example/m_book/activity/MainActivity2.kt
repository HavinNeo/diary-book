package com.example.m_book.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.m_book.R
import com.example.m_book.fragment.MenuBookFragment
import com.example.m_book.fragment.ProfileFragment
import com.example.m_book.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    private val menuBookFragment = MenuBookFragment()
    private val searchFragment = SearchFragment()
    private val profileFragment= ProfileFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        replaceFragment(menuBookFragment)
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.book_menu -> replaceFragment(menuBookFragment)
                R.id.search -> replaceFragment(searchFragment)
                R.id.profile -> replaceFragment(profileFragment)
            }
            true
        }


    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}