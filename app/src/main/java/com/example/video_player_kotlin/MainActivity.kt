package com.example.video_player_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView : VideoView = findViewById(R.id.videoView1)

        // Video path
        videoView.setVideoPath("android.resource://" +packageName +"/" +R.raw.video)

        // Media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start() // If want to start video when this screen open

    }
}