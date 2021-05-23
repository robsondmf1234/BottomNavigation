package com.example.bottonnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botton_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    Toast.makeText(this, "Botao Home clicado!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.bottom_favorite -> {
                    Toast.makeText(this, "Botao Favorite clicado!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, FavoriteActivity::class.java))
                    true
                }
                else -> {
                    Toast.makeText(this, "Botao Search clicado!", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, SearchActivity::class.java))
                    false
                }
            }
        }
    }
}