package com.example.and3sprint3challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_starfragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           button_add.setOnClickListener {
               val starfragment = Starfragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment,starfragment)
                .commit()
           }

    }
}