package com.example.sounds;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
//    private SoundPool mSoundPool;
//    private int mClapSound, mVoiceSound;
//    AssetManager am = this.getAssets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.film);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.projector);
        ImageButton btn = (ImageButton) this.findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mp2.stop();

                    }
                },3300);
            }
        });

//        mSoundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
//        mSoundPool.setOnLoadCompleteListener(this);
//        try {
//            mVoiceSound = mSoundPool.load(am.openFd("res/raw/projector"), 1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


//    @Override
//    public void onLoadComplete(SoundPool soundPool, int i, int i1) {
//
//    }
}