package com.ankitk10r.finalprojectofhackthone.TabMenu;


import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ankitk10r.finalprojectofhackthone.R;

import com.ankitk10r.finalprojectofhackthone.databinding.FragmentProfileBinding;
import com.ankitk10r.finalprojectofhackthone.usear_Info;
import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {
    public ProfileFragment() {}
    FragmentProfileBinding binding;
    FirebaseAuth auth;
    FirebaseFirestore firestore;
    ProgressDialog dialog1;
    ArrayList<usear_Info> usear_infos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate( inflater,container,false );
        auth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        dialog1 = new ProgressDialog( getContext() );
        dialog1.setMessage( "UPLOADING..." );
        usear_infos = new ArrayList<>();

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        final View customLayout = getLayoutInflater().inflate( R.layout.info_page, null);
        EditText contact = (EditText) customLayout.findViewById( R.id.phNo );
        EditText Address = (EditText) customLayout.findViewById( R.id.ad );
        EditText pinCode = (EditText) customLayout.findViewById( R.id.pin );
        EditText state = (EditText) customLayout.findViewById( R.id.std );
        EditText Country = (EditText) customLayout.findViewById( R.id.cunt );
        Button uploadBtn =  customLayout.findViewById( R.id.upload );
        ImageView close =  customLayout.findViewById( R.id.closeBtn );
        builder.setView(customLayout);
        AlertDialog dialog = builder.create();

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
               binding.adddress.setText( add );
               binding.uPhoneNo.setText("Phone No: "+ cno);
               binding.state.setText( sta);
               binding.pincode.setText( pin);
               binding.country.setText( cun);

            if (TextUtils.isEmpty(cno ))dialog.show();
            if (TextUtils.isEmpty( add ))dialog.show();
            if (TextUtils.isEmpty( sta ))dialog.show();
            if (TextUtils.isEmpty( pin ))dialog.show();
            if (TextUtils.isEmpty( cun ))dialog.show();


        } );





        close.setOnClickListener( view -> dialog.dismiss() );
       uploadBtn.setOnClickListener( view -> {

           String ContactNo,address,PinCode,State,country;
           country = Country.getText().toString();
           State = state.getText().toString();
           PinCode = pinCode.getText().toString();
           address = Address.getText().toString();
           ContactNo = contact.getText().toString();

           usear_Info info = new usear_Info( ContactNo,address,PinCode,State,country );

           String currentuser1 = FirebaseAuth.getInstance().getCurrentUser().getUid();
           dialog1.show();
           firestore
                   .collection( "users" )
                   .document(currentuser1)
                   .collection( "Info" )
                   .document("Address_info")
                   .set( info )
                   .addOnCompleteListener( task -> {
                       dialog.dismiss();
                       dialog1.dismiss();
                       Toast.makeText( getContext(),"Successfully upload",Toast.LENGTH_LONG ).show();
                   } ).addOnFailureListener( e -> {
               dialog.dismiss();
               dialog1.dismiss();
               Toast.makeText( getContext(),"uploading Failed!",Toast.LENGTH_LONG ).show();
           } );
       } );





        return binding.getRoot();
    }

}