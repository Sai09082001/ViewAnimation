package com.example.viewannimation;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class DrawerAct extends BaseAct {
    private static final String TAG ="DrawerAct" ;
    private ImageView btMenu;
    private DrawerLayout drawerLayout;
    private DrawerLayout.DrawerListener drawerListener;
    @Override
    protected int getLayoutID() {
        return R.layout.activity_drawer;
    }
    @Override
    protected void initViews() {
        btMenu=findViewById(R.id.bt_menu,this);
        drawerLayout=findViewById(R.id.drawerLayout);
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        drawerListener=new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerOpened(View drawerView) {
                Log.d(TAG, "onDrawerOpened()...");
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                Log.d(TAG, "onDrawerClosed()...");
            }
        };
        drawerLayout.addDrawerListener(drawerListener);
    }

    @Override
    protected void onDestroy() {
        drawerLayout.removeDrawerListener(drawerListener);
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bt_menu){
            // open
            drawerLayout.openDrawer(GravityCompat.START);
            //drawerLayout.closeDrawer(GravityCompat.START); dong tu phia ben trai
            //drawerLayout.closeDrawers();  dong tu moi phia
        }
    }

}
