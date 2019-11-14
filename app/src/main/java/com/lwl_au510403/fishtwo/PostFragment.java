package com.lwl_au510403.fishtwo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PostFragment extends Fragment {
    private static final String TAG = "Posts";

    ImageView closePost;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_post, container, false);

        closePost = view.findViewById(R.id.closePosts_imv);
        closePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Closing dialog");
                getActivity().getSupportFragmentManager().popBackStack();
                // getActivity().onBackPressed // anden metode
            }
        });

        return view;
    }
}
