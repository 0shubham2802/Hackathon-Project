package com.ankitk10r.finalprojectofhackthone.TabMenu.RecyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.Buy_waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.databinding.AllWasteRecyclerItemsDesignBinding;
import com.ankitk10r.finalprojectofhackthone.databinding.BuyWasteRecyclerItemsDesignBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Buy_waste_Recycler_Adapter extends RecyclerView.Adapter<Buy_waste_Recycler_Adapter.Holder> {
    private Context context;
    ArrayList<Buy_waste_model> wasteModels;

    public Buy_waste_Recycler_Adapter(Context context, ArrayList<Buy_waste_model> wasteModels) {
        this.context = context;
        this.wasteModels = wasteModels;
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.buy_waste_recycler_items_design,parent,false );
        return new Holder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.binding.TitleOfWaste.setText( wasteModels.get( position ).getWaste_name() + " From " + wasteModels.get( position ).getCompany_name() );
        holder.binding.WastePrice.setText( wasteModels.get( position ).getWaste_price());
        holder.binding.WasteLocation.setText( wasteModels.get( position ).getWaste_location());
        holder.binding.quentity.setText( "Quantity: "+ wasteModels.get( position ).getWaste_Quantity());
        holder.binding.contactNo.setText( wasteModels.get( position ).getContact_no() );
        Glide.with( context ). load(  wasteModels.get( position) .getWaste_image_url() ).into( holder.binding.WasteImg );
    }

    @Override
    public int getItemCount() {
        return wasteModels.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        BuyWasteRecyclerItemsDesignBinding binding;
        public Holder(@NonNull View itemView) {
            super( itemView );
            binding = BuyWasteRecyclerItemsDesignBinding.bind( itemView );
        }
    }
}
