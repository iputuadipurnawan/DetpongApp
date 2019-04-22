package com.example.hp.detpongapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class DetailTariLegong extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Contoh VideoView");
        getSupportActionBar().setSubtitle("Belajar di okedroid.com");

        videoView = (VideoView) findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoPath("http://techslides.com/demos/sample-videos/small.mp4");
        //digunakan untuk mengidentifikasi resource alamat url video
        videoView.setMediaController(new MediaController(this));
        //menampilkan media controller video
        videoView.start();
        //memulai video


    }
}