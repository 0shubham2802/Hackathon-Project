package com.ankitk10r.truckbooking.Authentication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ankitk10r.truckbooking.MainActivity;
import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {
    ActivitySignUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_up );
        binding = ActivitySignUpBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
        binding.SignUpBtn.setOnClickListener( view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class );
            startActivity( intent );
            finish();
        } );
        binding.GoToSignIn.setOnClickListener( View -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class );
            startActivity( intent );
            finish();
        } );
    }
}