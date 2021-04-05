package com.example.viewannimation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseAct extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        initViews();
    }

    protected abstract void initViews();

    protected abstract int getLayoutID();

    public final <T extends View> T findViewById(int id, View.OnClickListener event) {
        T v = findViewById(id);
        if (v != null && event != null) {
            v.setOnClickListener(this);
        }
        return v;
    }


    @Override
    public void onClick(View v) {
        // do something
    }
}
