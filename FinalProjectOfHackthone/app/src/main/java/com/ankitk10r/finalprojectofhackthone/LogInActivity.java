package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.ankitk10r.finalprojectofhackthone.databinding.ActivityLogInBinding;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    ActivityLogInBinding binding;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_log_in );
        binding = ActivityLogInBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog( this );
        dialog.setMessage( "Wait....." );

        if(auth.getCurrentUser() != null){
            startActivity( new Intent(this,MainActivity.class) ) ;
            finish();
        }

        binding.LoginBtn.setOnClickListener( view -> {
            signfun();
        } );
        binding.SignUpBTN.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),SinUpActivity.class);
            startActivity(i);
            finish();
        } );
        binding.forgetPass.setOnClickListener( view -> {
            forgotePass();
        } );

    }
    void signfun(){
        auth = FirebaseAuth.getInstance();
        dialog = new ProgressDialog( this );
        dialog.setMessage( "Wait....." );


        String email,pass;
        email=binding.userEmail.getText().toString();
        pass= binding.userPass.getText().toString();
        if (TextUtils.isEmpty( email )){
            binding.userEmail.setError( "Enter Email" );
            return;
        }
        if (TextUtils.isEmpty( pass )){
            binding.userPass.setError( "Enter pass" );
            return;
        }
        dialog.show();
        auth.signInWithEmailAndPassword( email,pass ).addOnCompleteListener( task -> {
            if (task.isSuccessful()) {
                dialog.dismiss();
                Toast.makeText( this,"successful login",Toast.LENGTH_SHORT ).show();
                startActivity( new Intent(getApplicationContext(),MainActivity.class) ) ;
                finish();
            }else {
                dialog.dismiss();
                Toast.makeText( this,  task.getException() .getLocalizedMessage(),Toast.LENGTH_SHORT ).show();
            }
        } );

    }
    void forgotePass(){
        String email = binding.userEmail.getText().toString().trim();
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplication(), "Enter your registered email id", Toast.LENGTH_SHORT).show();
            return;
        }
        dialog.show();
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener( task -> {
                    dialog.show();
                    if (task.isSuccessful()) {
                        Toast.makeText(this, "We have sent you instructions to reset your password!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    } else {
                        Toast.makeText(this, "Failed to send reset email!"+task.getException() .getLocalizedMessage(), Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                } );
        dialog.dismiss();
    }
}