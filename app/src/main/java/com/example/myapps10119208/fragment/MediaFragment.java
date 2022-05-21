package com.example.myapps10119208.fragment;
//dikerjakan oleh agung segara rizki pada tanggal 18 mei 2021
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.fragment.app.Fragment;

import com.example.myapps10119208.Adapter;
import com.example.myapps10119208.AdapterHelp;
import com.example.myapps10119208.fragment.dailyfriend.FriendFragment;
import com.example.myapps10119208.fragment.media.MediaAdapter;
import com.example.myapps10119208.FriendAdapterHelp;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapps10119208.R;

import java.util.ArrayList;


public class MediaFragment extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_media, container, false);

        Button btn = (Button) view.findViewById(R.id.btn_musik);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_media, new MusicFragment());
                fr.commit();
            }
        });

        Button btn_1 = (Button) view.findViewById(R.id.btn_video);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_media, new VideoFragment());
                fr.commit();
            }
        });

        return view;
    }
}