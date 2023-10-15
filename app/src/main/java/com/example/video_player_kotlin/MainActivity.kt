package com.example.video_player_kotlin

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Local storage videoView
        val videoView : VideoView = findViewById(R.id.videoView1)
        // Video path
        videoView.setVideoPath("android.resource://" +packageName +"/" +R.raw.video)
        // Media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start() // If want to start video when this screen open

        // From internet
        val videoView2 : VideoView = findViewById(R.id.videoView2)
        // Give link
        val uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4")
        // Fetch video from link
        videoView2.setVideoURI(uri)
        // Set media controller
        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        mediaController2.setMediaPlayer(videoView2)
        videoView2.setMediaController(mediaController2)

    }
}