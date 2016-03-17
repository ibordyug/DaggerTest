package com.example.ivanbordiuh.daggertest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ivan.Bordiuh on 15.03.2016.
 */
public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Dagger", "Fragment");
//        if (((MainActivity) getActivity()).context != null)
//            Log.d("Dagger", "Frag OLOLO");
//        if (((MainActivity) getActivity()).localBroadcastManager != null)
//            Log.d("Dagger", "Frag manager OLOLO");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
