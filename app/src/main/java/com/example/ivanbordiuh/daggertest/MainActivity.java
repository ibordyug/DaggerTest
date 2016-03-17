package com.example.ivanbordiuh.daggertest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.ivanbordiuh.daggertest.dagger.component.ActivityComponent;
import com.example.ivanbordiuh.daggertest.dagger.component.DaggerActivityComponent;
import com.example.ivanbordiuh.daggertest.dagger.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityComponent activityComponent;
    @Inject
    Context context;
    @Inject
    LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onStart() {
        super.onStart();
        if (localBroadcastManager != null)
            Log.d("DAGGER", "localBroadcastManager OLOLO");
        else
            Log.d("DAGGER", "localBroadcastManager NE OLOLO");
        if (context != null)
            Log.d("DAGGER", "CONTEXT OLOLO");
        else
            Log.d("DAGGER", "CONTEXT NE OLOLO");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MyApplication) getApplication()).getApplicationComponent())
                .build();
        activityComponent.inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
