package com.example.p7_75_5b6

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pavanpatel.p7_75_5b6.R
class youtubeActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtubeId="fJn9B64Znrk"
        val youtubeWebView:WebView=findViewById(R.id.ytVideo)
        val webSettings:WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton5)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).apply{startActivity(this)}
        }
    }
}
