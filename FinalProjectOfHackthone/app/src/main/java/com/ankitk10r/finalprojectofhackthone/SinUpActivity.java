package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.ankitk10r.finalprojectofhackthone.databinding.ActivitySinUpBinding;
import com.google.firebase.firestore.FirebaseFirestore;

public class SinUpActivity extends AppCompatActivity {
    ActivitySinUpBinding binding;
    FirebaseAuth auth;
    FirebaseFirestore firestore;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sin_up );
        binding = ActivitySinUpBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );

       binding.SignUPBtn.setOnClickListener( view -> {
           sinupfun();

       } );

        binding.GotoLoginPageBtn.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),LogInActivity.class);
            startActivity(i);
            finish();
        } );
    }
    void sinupfun(){

        auth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        dialog = new ProgressDialog( this );
        dialog.setMessage( "Creating....." );

        String email,pass,name;
        email = binding.userEmail.getText().toString();
        pass = binding.userPass.getText().toString();
        name = binding.name.getText().toString();

        if (TextUtils.isEmpty( name )){
            binding.name.setError( "Enter Name" );
            return;
        }
        if (TextUtils.isEmpty( email )){
            binding.userEmail.setError( "Enter Email" );
            return;
        }
        if (TextUtils.isEmpty( pass )){
            binding.userPass.setError( "Enter pass" );
            return;
        }
        if (!(binding.checkBox.isChecked())){
            binding.checkBox.setError( "please Checked" );
            return;
        }
        usear_Info info = new usear_Info( name,email,pass );
        dialog.show();
        auth.createUserWithEmailAndPassword( email,pass ).addOnCompleteListener( task -> {

                if (task.isSuccessful()) {

                    String uid = task.getResult().getUser().getUid();
                    Toast.makeText( this,"Successfully",Toast.LENGTH_LONG ).show();
                    dialog.dismiss();
                    firestore
                            .collection( "users" )
                            .document(uid)
                            .set( info );
                    startActivity( new Intent(this,MainActivity.class) );
                    finish();

                }else {
                    dialog.dismiss();
                    Toast.makeText( this,  task.getException() .getLocalizedMessage(),Toast.LENGTH_SHORT ).show();
                }
        } );

    }
}