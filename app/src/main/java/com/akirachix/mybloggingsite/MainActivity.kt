package com.akirachix.mybloggingsite

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate.NightMode
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mybloggingsite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlog.layoutManager = LinearLayoutManager(this)
        showcaseAuthors()
    }

    fun showcaseAuthors() {
        val author1 = MyBlog("Susan", "ALL 46 DREAMWORKS ANIMATIONS RANKED", "June-27-2024")
        val author2 = MyBlog("Winnie", "Where is Mimo", "22-05-2024")
        val author3 = MyBlog("John", "Bridgerton", "21-06-2024")
        val author4 = MyBlog("Masaku", "Damsel", "4-01-2024")
        val author5 = MyBlog("Mwende", "How to ruin Christmas", "11-02-2024")
        val author6 = MyBlog("Eunice", "Originals", "9-03-2024")
        val author7 = MyBlog("Favour", "Legacies", "14-04-2024")
        val author8 = MyBlog("Alice", "Vampoire Diaries", "27-06-2024")
        val author9 = MyBlog("Abigail", "Dark Desire", "29-05-2024")
        val author10 = MyBlog("Brian", "Blood and Water", "22-05-2024")


        val myAuthors = listOf(
            author1,
            author2,
            author3,
            author4,
            author5,
            author6,
            author7,
            author8,
            author9,
            author10
        )

        val myMovieAdapter = MyMovieAdapter(myAuthors)
        binding.rvBlog.adapter = myMovieAdapter
    }
}