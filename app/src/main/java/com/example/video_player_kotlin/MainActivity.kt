package com.example.video_player_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView : VideoView = findViewById(R.id.videoView1)

    }
}