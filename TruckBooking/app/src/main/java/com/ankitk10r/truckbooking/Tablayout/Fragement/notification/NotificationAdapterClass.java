package com.ankitk10r.truckbooking.Tablayout.Fragement.notification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.truckbooking.R;
import com.ankitk10r.truckbooking.databinding.ActivityNotificationItemsClassBinding;

import java.util.ArrayList;

class NotificationAdapterClass extends RecyclerView.Adapter<NotificationAdapterClass.notificationHolder>{

    Context context;
    ArrayList<NotificationModelClass> arrayList;

    public NotificationAdapterClass(Context context, ArrayList<NotificationModelClass> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public notificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.activity_notification_items_class,parent,false );
        return new notificationHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull notificationHolder holder, int position) {
        holder.binding.customerName.setText( "Customer Name: "+arrayList.get( position ).getCustomerName() );
        holder.binding.customerNo.setText( "Contact N0: "+arrayList.get( position ).getCustomerNumber() );
        holder.binding.customerLocation.setText( "Waste Location: "+arrayList.get( position ).getCustomerLocation() );
        holder.binding.deliveryLocation.setText( "Delivery Location: "+arrayList.get( position ).getDeliveryLocation() );
        holder.binding.wasteType.setText( "Waste Type: "+arrayList.get( position ).getWasteType() );
        holder.binding.wasteQuantity.setText( "Waste Quantity: "+arrayList.get( position ).getWasteQuantity());
        holder.binding.price.setText("Pay : "+ arrayList.get( position ).getPrice() );

        holder.binding.callBtn.setOnClickListener( view -> Toast.makeText( context, "Click on Call", Toast.LENGTH_SHORT ).show() );
        holder.binding.cancelBtn.setOnClickListener( view -> Toast.makeText( context, "Click on Cancel", Toast.LENGTH_SHORT ).show() );
        holder.binding.acceptedBtn.setOnClickListener( view -> Toast.makeText( context, "Click on Accepted", Toast.LENGTH_SHORT ).show() );
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class notificationHolder extends RecyclerView.ViewHolder {
        ActivityNotificationItemsClassBinding binding;
        public notificationHolder(@NonNull View itemView) {
            super( itemView );
            binding = ActivityNotificationItemsClassBinding.bind( itemView );
        }
    }
}
