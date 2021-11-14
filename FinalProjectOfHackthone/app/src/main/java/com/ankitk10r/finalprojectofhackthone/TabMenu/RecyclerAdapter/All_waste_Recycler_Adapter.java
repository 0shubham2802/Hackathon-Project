package com.ankitk10r.finalprojectofhackthone.TabMenu.RecyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.finalprojectofhackthone.BuyWaste.DetailsActivity;
import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.databinding.AllWasteRecyclerItemsDesignBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class All_waste_Recycler_Adapter extends RecyclerView.Adapter<All_waste_Recycler_Adapter.Holder> {
    private Context context;
    ArrayList<waste_model> wasteModels;

    public All_waste_Recycler_Adapter(Context context, ArrayList<waste_model> wasteModels) {
        this.context = context;
        this.wasteModels = wasteModels;
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.all_waste_recycler_items_design,parent,false );
        return new Holder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        final waste_model waste_model = wasteModels.get( position );
        holder.binding.WastListTitle.setText( wasteModels.get( position ).getWaste_name() );
        holder.binding.price.setText( wasteModels.get( position ).getWaste_price());
        holder.binding.LocationTextView.setText( wasteModels.get( position ).getWaste_location());
        Glide.with( context ). load(  wasteModels.get( position) .getWaste_image_url() ).into( holder.binding.wasteListImg );
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class );
                intent.putExtra( "img",waste_model.getWaste_image_url() );
                intent.putExtra( "name",waste_model.getWaste_name() );
                intent.putExtra( "price",waste_model.getWaste_price() );
                intent.putExtra( "location",waste_model.getWaste_location() );
                intent.putExtra( "contact",waste_model.getContact_no() );
                intent.putExtra( "quantity",waste_model.getWaste_Quantity() );
                intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
                context.startActivity( intent );
            }
        } );

    }

    @Override
    public int getItemCount() {
        return wasteModels.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        AllWasteRecyclerItemsDesignBinding binding;
        public Holder(@NonNull View itemView) {
            super( itemView );
            binding = AllWasteRecyclerItemsDesignBinding.bind( itemView );
        }
    }
}
