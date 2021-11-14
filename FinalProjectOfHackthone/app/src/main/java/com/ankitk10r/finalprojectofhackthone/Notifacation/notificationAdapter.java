package com.ankitk10r.finalprojectofhackthone.Notifacation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.databinding.NotificationItemsCardBinding;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

class notificationAdapter extends RecyclerView.Adapter<notificationAdapter.notificationHolder> {
    private Context context;
    ArrayList<sellModelClass> sellModelClasses;

    public notificationAdapter(Context context, ArrayList<sellModelClass> sellModelClasses) {
        this.context = context;
        this.sellModelClasses = sellModelClasses;
    }

    @NonNull
    @Override
    public notificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.notification_items_card,parent,false );
        return new notificationHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull notificationHolder holder, int position) {
        sellModelClass model = sellModelClasses.get( position );
        holder.binding.ContactNo.setText( sellModelClasses.get( position ).getCustomerNumber() );
        holder.binding.CustomerName.setText( sellModelClasses.get( position ).getCustomerName() );
        holder.binding.WasteName.setText( sellModelClasses.get( position ).getWasteName() );
        holder.binding.DeliveryAddress.setText( sellModelClasses.get( position ).getDeliveryAddress() );
        Glide.with( context ). load(  sellModelClasses.get( position) .getWasteUrl() ).into( holder.binding.wasteImg);

        holder.binding.Call.setOnClickListener( view -> Toast.makeText( context, "Click on Call", Toast.LENGTH_SHORT ).show() );
        holder.binding.cancelButton.setOnClickListener( view -> Toast.makeText( context, "Click on Cancel", Toast.LENGTH_SHORT ).show() );
        holder.binding.truckBooking.setOnClickListener( view -> Toast.makeText( context, "Click on Booking Truck", Toast.LENGTH_SHORT ).show() );
    }

    @Override
    public int getItemCount() {
        return sellModelClasses.size();
    }

    class notificationHolder extends RecyclerView.ViewHolder {
        NotificationItemsCardBinding binding;
        public notificationHolder(@NonNull View itemView) {
            super( itemView );
            binding = NotificationItemsCardBinding.bind( itemView );
        }
    }
}
