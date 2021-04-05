package com.example.viewannimation;

import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends BaseAct {

    private static final String TAG = "MainActivity";
    private ImageView ivIcon;

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        ivIcon = findViewById(R.id.iv_icon, this);
        startAnim();
    }

    private void startAnim() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale_translate);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Log.d(TAG, "onAnimationStart()...");
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.d(TAG, "onAnimationEnd()...");
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Log.d(TAG, "onAnimationRepeat()...");
            }
        });
        ivIcon.startAnimation(animation);
    }

}