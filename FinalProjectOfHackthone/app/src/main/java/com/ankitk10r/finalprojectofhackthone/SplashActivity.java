package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.ankitk10r.finalprojectofhackthone.databinding.ActivitySplashBinding;


public class SplashActivity extends AppCompatActivity {
        ActivitySplashBinding binding;
        int SPLASH_SCREEN_TIME_OUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView( R.layout.activity_splash );
       binding = ActivitySplashBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );

        new Handler().postDelayed( () -> {
            Intent i=new Intent(getApplicationContext(),LogInActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_SCREEN_TIME_OUT);
    }
}