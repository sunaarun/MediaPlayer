package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button ;

public class MainActivity extends AppCompatActivity {
   MediaPlayer player ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       player = MediaPlayer.create(this, R.raw.alfatiha);
    }

    public void playMedia(View view){
       player.start();
    }

    public void stopMedia(View view){
      player.stop();
    }
}
