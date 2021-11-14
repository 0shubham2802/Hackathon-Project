package com.ankitk10r.truckbooking.Tablayout.Fragement.Order;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.ActivityDeliveryItemsClassBinding;
import java.util.ArrayList;
class DeliveryAdapterClass extends RecyclerView.Adapter<DeliveryAdapterClass.deliveryHolder> {
    ArrayList<AccaptDelivryModel> arrayList;
    Context context;

    public DeliveryAdapterClass(ArrayList<AccaptDelivryModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public deliveryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.activity_delivery_items_class,parent,false );
        return new deliveryHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull deliveryHolder holder, int position) {
        holder.binding.customerName.setText( "Customer Name: "+arrayList.get( position ).getCustomerName() );
        holder.binding.customerNo.setText( "Contact N0: "+arrayList.get( position ).getCustomerNumber() );
        holder.binding.customerLocation.setText( "Waste Location: "+arrayList.get( position ).getCustomerLocation() );
        holder.binding.deliveryLocation.setText( "Delivery Location: "+arrayList.get( position ).getDeliveryLocation() );
        holder.binding.wasteType.setText( "Waste Type: "+arrayList.get( position ).getWasteType() );
        holder.binding.wasteQuantity.setText( "Waste Quantity: "+arrayList.get( position ).getWasteQuantity());
        holder.binding.price.setText("Pay : "+ arrayList.get( position ).getPrice() );

        holder.binding.callBtn.setOnClickListener( view -> Toast.makeText( context, "Click on Call", Toast.LENGTH_SHORT ).show() );
        holder.binding.viewRouteBtn.setOnClickListener( view -> Toast.makeText( context, "Click on View Route ", Toast.LENGTH_SHORT ).show() );
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class deliveryHolder extends RecyclerView.ViewHolder {
        ActivityDeliveryItemsClassBinding binding;
        public deliveryHolder(@NonNull View itemView) {
            super( itemView );
            binding = ActivityDeliveryItemsClassBinding.bind( itemView );
        }
    }
}
