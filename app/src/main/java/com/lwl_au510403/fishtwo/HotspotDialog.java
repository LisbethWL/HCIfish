package com.lwl_au510403.fishtwo;

import android.content.Intent;
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
import android.widget.ImageView;

public class HotspotDialog extends DialogFragment {
    private static final String TAG = "HotspotDialog";

    ImageView close;
    Button addPost;
    Button seePosts; // To be implemented

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.hotspot_dialog, container, false);

        close = view.findViewById(R.id.closePopup_img);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Closing dialog");
                getDialog().dismiss();
            }
        });

        addPost = view.findViewById(R.id.add_dlg_btn);
        addPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddPostActivity.class);
                startActivity(intent);
                getDialog().dismiss();
            }
        });

        seePosts = view.findViewById(R.id.posts_btn);
        seePosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment goPost = new PostFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, goPost );
                transaction.addToBackStack(null);  // add transaction to backstack
                transaction.commit();
                getDialog().dismiss();
            }
        });


    // https://stackoverflow.com/questions/32700818/how-to-open-a-fragment-on-button-click-from-a-fragment-in-android


        return view;
    }
}

// https://www.youtube.com/watch?v=LUV_djRHSEY