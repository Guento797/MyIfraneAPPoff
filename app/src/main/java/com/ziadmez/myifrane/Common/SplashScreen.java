package com.ziadmez.myifrane.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.ziadmez.myifrane.R;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIMER=5000;
    //variables
   ImageView backgroundImage ;
   TextView  poweredByLine ;
   //animations
   Animation fadeAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        backgroundImage =findViewById(R.id.background_image);
        poweredByLine =findViewById(R.id.powered_by_line);
        //anim
        fadeAnim = AnimationUtils.loadAnimation(this,R.anim.fade_anim);
        //setting animations for splash elements
        backgroundImage.setAnimation(fadeAnim);
        poweredByLine.setAnimation(fadeAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },SPLASH_TIMER);
    }



}
