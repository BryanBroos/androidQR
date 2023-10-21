package com.example.biblioteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biblioteca.databinding.ActivityMajijiBinding
import com.squareup.picasso.Picasso
import javax.net.ssl.SSLSessionBindingEvent

class majiji : AppCompatActivity() {
    lateinit var url:String
    lateinit var imageBinding: ActivityMajijiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imageBinding = ActivityMajijiBinding.inflate(layoutInflater)
        setContentView(imageBinding.root)

        url = intent.getStringExtra("url_key").toString()
        Picasso.get().load(url).into(imageBinding.imageView)
    }
}