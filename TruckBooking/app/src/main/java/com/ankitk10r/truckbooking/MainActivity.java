package com.ankitk10r.truckbooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ankitk10r.truckbooking.Tablayout.ViewPagerAdapter.Adapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    ViewPager viewPager;
    TabLayout tabLayout;
    TabItem tab1,tab2,tab3,tab4;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tab1 = findViewById( R.id.Home );
        tab2 = findViewById( R.id.Profile );
        tab3 = findViewById( R.id.order );
        tab4 = findViewById( R.id.notification );
        viewPager = findViewById( R.id.viewPager2 );
        tabLayout = findViewById( R.id.tabLayout );
        toolbar = findViewById( R.id.toolbar );


        adapter = new Adapter( getSupportFragmentManager(),tabLayout.getTabCount() );
        viewPager.setAdapter( adapter );


        tabLayout.setOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );
                switch (tab.getPosition()){
                    case 0:  toolbar.setTitle( "Home" );
                            break;
                    case 1:  toolbar.setTitle( "Profile" );
                        break;
                    case 2:  toolbar.setTitle( "Order" );
                        break;
                    case 3:  toolbar.setTitle( "Notification" );
                        break;
                }
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2){
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}
            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        } );
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayout ) );
    }
}