package com.example.p7_75_5b6

import android.content.Intent
import android.widget.MediaController
import android.widget.VideoView
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pavanpatel.p7_75_5b6.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoView: VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)

        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        button.setOnClickListener {
            Intent(this, youtubeActivity::class.java).apply { startActivity(this) }
        }
    }
}
