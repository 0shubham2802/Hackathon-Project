package com.ankitk10r.truckbooking.Tablayout.Fragement.Order;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ankitk10r.truckbooking.databinding.FragmentOrderBinding;
import java.util.ArrayList;

public class OrderFragment extends Fragment {
    public OrderFragment() {}

   FragmentOrderBinding binding;
    DeliveryAdapterClass adapterClass;
    ArrayList<AccaptDelivryModel> arrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOrderBinding.inflate( inflater,container,false );
        arrayList = new ArrayList<>();
        arrayList.add( new AccaptDelivryModel("Ankit", "7845129630", "deo", "Aurangabad","Co2", "45", "1750") );

        binding.takeDeliveryRecycler.setLayoutManager( new LinearLayoutManager( getContext(), RecyclerView.VERTICAL,false ) );
        adapterClass = new DeliveryAdapterClass( arrayList,getContext() );
        binding.takeDeliveryRecycler.setAdapter( adapterClass );



        return binding.getRoot();
    }
}