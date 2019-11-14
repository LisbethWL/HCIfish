package com.lwl_au510403.fishtwo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
    private static final String TAG = "HomeFragment";
    Button hotspotBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        hotspotBtn = rootView.findViewById(R.id.hotspot_btn);

        hotspotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: opening dialog");

                HotspotDialog dialog = new HotspotDialog();
                dialog.show(getFragmentManager(), "HotspotDialog");
            }
        });

        return rootView;
    }


}

// https://stackoverflow.com/questions/32700818/how-to-open-a-fragment-on-button-click-from-a-fragment-in-android
// https://www.youtube.com/watch?v=67j1yIFa48s
// https://stackoverflow.com/questions/5393197/show-dialog-from-fragment