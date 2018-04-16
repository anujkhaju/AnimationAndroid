package com.example.anukhaju.sample2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.khalibali
        );
    }

    public void PLAY(View view) {
        mediaPlayer.start();
    }

    public void PAUSE(View view) {
        mediaPlayer.pause();
    }

    public void STOP(View view) {
mediaPlayer.stop();
    }
}
