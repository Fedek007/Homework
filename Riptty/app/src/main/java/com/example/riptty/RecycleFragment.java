package com.example.riptty;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleFragment extends Fragment {
    RecyclerView recyclerView;


    public RecycleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        recyclerView = view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new UserAdapter(getUsers()));
        return view;
    }



    private ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("New York", R.drawable.photo1));
        users.add(new User("Los Angeles", R.drawable.photo2));
        users.add(new User("Washington", R.drawable.photo3));
        users.add(new User("Houston", R.drawable.photo4));
        users.add(new User("Chicago", R.drawable.photo5));
        users.add(new User("Philadelphia", R.drawable.photo6));
        users.add(new User("Phoenix", R.drawable.photo7));
        users.add(new User("San Diego", R.drawable.photo8));
        users.add(new User("Dallas", R.drawable.photo9));
        users.add(new User("San Jose", R.drawable.photo10));
        users.add(new User("Austin", R.drawable.photo12));
        users.add(new User("Jacksonville", R.drawable.photo13));
        users.add(new User("San Francisco", R.drawable.photo14));
        users.add(new User("Memphis", R.drawable.photo15));
        users.add(new User("Denver", R.drawable.photo16));
        users.add(new User("Boston", R.drawable.photo17));
        return users;
    }


}
