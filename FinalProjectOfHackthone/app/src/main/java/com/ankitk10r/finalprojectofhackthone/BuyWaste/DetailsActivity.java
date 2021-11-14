package com.ankitk10r.finalprojectofhackthone.BuyWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ankitk10r.finalprojectofhackthone.LogInActivity;
import com.ankitk10r.finalprojectofhackthone.MainActivity;
import com.ankitk10r.finalprojectofhackthone.Notifacation.NotificationsActivity;
import com.ankitk10r.finalprojectofhackthone.Notifacation.oderModel;
import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.databinding.ActivityDetailsBinding;
import com.ankitk10r.finalprojectofhackthone.usear_Info;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding binding;
    int count = 1;
    private String address;

    FirebaseFirestore firestore;
    ArrayList<usear_Info> usear_infos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );
        binding = ActivityDetailsBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );

        firestore = FirebaseFirestore.getInstance();
        usear_infos = new ArrayList<>();


        binding.WasteName.setText( getIntent().getStringExtra( "name" )+" "+  getIntent().getStringExtra( "location" )+" "+ getIntent().getStringExtra( "contact" ));
        binding.Price.setText( getIntent().getStringExtra( "price" ) );
        binding.Quentity.setText( getIntent().getStringExtra( "quantity" ) );
        Glide.with( this ). load( getIntent().getStringExtra( "img" ) ).into( binding.WasteIMG );


        binding.abc.setOnClickListener( view -> {
            Toast.makeText( this, "Your Order Completed", Toast.LENGTH_SHORT ).show();
            Intent i=new Intent(getApplicationContext(), MainActivity.class );
            startActivity(i);
            finish();
        } );

        String currentuser = FirebaseAuth.getInstance().getCurrentUser().getUid();
        firestore  .collection( "users" )
                .document(currentuser)
                .collection( "Info" )
                .document("Address_info")
                .get().addOnSuccessListener( documentSnapshot -> {
            usear_Info userDetails = documentSnapshot.toObject(usear_Info.class);
            String cno =  userDetails.getContactNo();
            String add =  userDetails.getAddress();
            String sta =  userDetails.getState();
            String pin =  userDetails.getPinCode();
            String cun =  userDetails.getCountry();
            binding.address.setText( add );
            binding.city.setText( sta);
            binding.Dpincode.setText( pin);
            binding.dState.setText( cun);

        } );

        binding.OrderBtn.setOnClickListener( view -> {
            switch (count){
                case 1: binding.AddressLayout.getLayoutParams().height = ActionBar.LayoutParams.WRAP_CONTENT;
                    binding.AddressLayout.requestLayout();
                    binding.OrderBtn.setText( "Cancel" );
                    count++;
                    break;
                case 2:  binding.AddressLayout.getLayoutParams().height = 0;
                    binding.AddressLayout.requestLayout();
                    binding.OrderBtn.setText( "Orders" );
                    count = 1;
                    break;
            }
        } );


    }

}