package com.ankitk10r.truckbooking.Tablayout.Fragement.Home;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    public HomeFragment() {}
    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       binding = FragmentHomeBinding.inflate( inflater,container,false );

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        final View customLayout = getLayoutInflater().inflate( R.layout.truck_data, null);
        builder.setView(customLayout);
        AlertDialog dialog = builder.create();
        dialog.show();
        return binding.getRoot();
    }

}