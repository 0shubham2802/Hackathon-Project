package com.ankitk10r.finalprojectofhackthone.TabMenu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.TabMenu.MoreFragment;
import com.ankitk10r.finalprojectofhackthone.TabMenu.ProfileFragment;
import com.ankitk10r.finalprojectofhackthone.TabMenu.ShopFragment;

public class videPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public videPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super( fm, behavior );
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0:return new HomeFragment();
            case 1:return new ProfileFragment();
            case 2:return new ShopFragment();
            case 3:return new MoreFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
