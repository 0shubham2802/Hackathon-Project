package com.ankitk10r.truckbooking.Tablayout.ViewPagerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ankitk10r.truckbooking.Tablayout.Fragement.Home.HomeFragment;
import com.ankitk10r.truckbooking.Tablayout.Fragement.notification.NotificationFragment;
import com.ankitk10r.truckbooking.Tablayout.Fragement.Order.OrderFragment;
import com.ankitk10r.truckbooking.Tablayout.Fragement.profile.ProfileFragment;

public class Adapter extends FragmentPagerAdapter {
    int tabCount;


    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super( fm, behavior );
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0:return new HomeFragment();
            case 1:return new ProfileFragment();
            case 2:return new OrderFragment();
            case 3:return new NotificationFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
