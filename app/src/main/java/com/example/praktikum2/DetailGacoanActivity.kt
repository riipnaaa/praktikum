package com.example.praktikum2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailGacoanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gacoan)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val gacoan = intent.getParcelableExtra<Gacoan>(MainActivity.INTENT_PARCELABLE)
        val imgGacoan = findViewById<ImageView>(R.id.img_item_photo)
        val nameGacoan = findViewById<TextView>(R.id.tv_item_name)
        val descGacoan = findViewById<TextView>(R.id.tv_item_description)

        imgGacoan.setImageResource(gacoan?.imgGacoan!!)
        nameGacoan.text = gacoan.nameGacoan
        descGacoan.text = gacoan.descGacoan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}