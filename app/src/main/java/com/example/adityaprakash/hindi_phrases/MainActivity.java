package com.example.adityaprakash.hindi_phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void playPhrase(View view){
        Button buttonPressed = (Button) view;

        MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
