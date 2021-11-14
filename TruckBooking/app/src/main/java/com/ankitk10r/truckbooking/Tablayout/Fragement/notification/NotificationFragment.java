package com.ankitk10r.truckbooking.Tablayout.Fragement.notification;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.FragmentNotificationBinding;

import java.util.ArrayList;

public class NotificationFragment extends Fragment {
    public NotificationFragment() {}

    FragmentNotificationBinding binding;
    NotificationAdapterClass adapterClass;
    ArrayList<NotificationModelClass> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNotificationBinding.inflate( inflater,container,false );
        arrayList = new ArrayList<>();
        arrayList.add( new NotificationModelClass("Ankit", "7845129630", "deo", "Aurangabad","Co2", "45", "1750") );
        arrayList.add( new NotificationModelClass("Ankit", "7845129630", "deo", "Aurangabad","Co2", "45", "1750") );
        arrayList.add( new NotificationModelClass("Ankit", "7845129630", "deo", "Aurangabad","Co2", "45", "1750") );
        arrayList.add( new NotificationModelClass("Ankit", "7845129630", "deo", "Aurangabad","Co2", "45", "1750") );

        binding.notificationRecycler.setLayoutManager( new LinearLayoutManager( getContext(),LinearLayoutManager.VERTICAL,false ) );
        adapterClass =new NotificationAdapterClass( getContext(),arrayList );
        binding.notificationRecycler.setAdapter( adapterClass );




        return binding.getRoot();
    }
}