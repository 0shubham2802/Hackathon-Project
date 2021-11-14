package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ankitk10r.finalprojectofhackthone.Notifacation.NotificationsActivity;
import com.ankitk10r.finalprojectofhackthone.Notifacation.sellModelClass;
import com.ankitk10r.finalprojectofhackthone.TabMenu.videPagerAdapter;
import com.ankitk10r.finalprojectofhackthone.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    videPagerAdapter adapter;
    ViewPager viewPager;
    TabLayout tabLayout;
    TabItem tab1,tab2,tab3,tab4;
    TextView notificationBtn;
    ArrayList<sellModelClass> sellModelClasses;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tab1 = findViewById( R.id.Home );
        tab2 = findViewById( R.id.Profile );
        tab3 = findViewById( R.id.Shop );
        tab4 = findViewById( R.id.More );
        viewPager = findViewById( R.id.viewPager2 );
        tabLayout = findViewById( R.id.tabLayout );
        notificationBtn = findViewById( R.id.NotificationBTN );
        sellModelClasses = new ArrayList<>();
        //sellModelClasses.add( new sellModelClass("Co2","data:image/jpeg;base64,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","Manish Sahu","7845123690","Chandigarh 784512"));
        if (sellModelClasses.size()!=0){
            notificationBtn.setText( ""+sellModelClasses.size() );
        }else {
            notificationBtn.setText("");
        }



        notificationBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NotificationsActivity.class );
                startActivity( intent );
            }
        } );

        adapter = new videPagerAdapter( getSupportFragmentManager(),tabLayout.getTabCount() );
        viewPager.setAdapter( adapter );


        tabLayout.setOnTabSelectedListener( new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem( tab.getPosition() );

                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2){
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        } );
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener( tabLayout ) );

    }
}