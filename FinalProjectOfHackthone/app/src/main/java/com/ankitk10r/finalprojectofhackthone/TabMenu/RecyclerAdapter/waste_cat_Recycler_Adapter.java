package com.ankitk10r.finalprojectofhackthone.TabMenu.RecyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.Categoris_waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.databinding.WasteRecyclerItemsDesignBinding;
import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class waste_cat_Recycler_Adapter extends RecyclerView.Adapter<waste_cat_Recycler_Adapter.Holder> {
    private Context context;
    ArrayList<Categoris_waste_model> wasteModels;

    public waste_cat_Recycler_Adapter(Context context, ArrayList<Categoris_waste_model> wasteModels) {
        this.context = context;
        this.wasteModels = wasteModels;
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.waste_recycler_items_design,parent,false );
        return new Holder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.binding.WastListTitle.setText( wasteModels.get( position ).getWaste_name() );
        Glide.with( context ). load(  wasteModels.get( position) .getWaste_image_url() ).into( holder.binding.wasteListImg );


    }

    @Override
    public int getItemCount() {
        return wasteModels.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        WasteRecyclerItemsDesignBinding binding;
        public Holder(@NonNull View itemView) {
            super( itemView );
            binding = WasteRecyclerItemsDesignBinding.bind( itemView );
        }
    }
}
