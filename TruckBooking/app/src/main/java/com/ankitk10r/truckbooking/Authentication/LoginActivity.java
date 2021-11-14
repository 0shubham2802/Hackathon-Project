package com.ankitk10r.truckbooking.Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ankitk10r.truckbooking.MainActivity;
import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        binding = ActivityLoginBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
        binding.SignInBtn.setOnClickListener( view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class );
            startActivity( intent );
            finish();
        } );
        binding.GoToSignUp.setOnClickListener( View -> {
            Intent intent = new Intent(getApplicationContext(), SignUpActivity.class );
            startActivity( intent );
            finish();
        } );
    }
}