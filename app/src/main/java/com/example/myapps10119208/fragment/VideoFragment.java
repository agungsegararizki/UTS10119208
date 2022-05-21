package com.example.myapps10119208.fragment;
//dikerjakan oleh agung segara rizki pada tanggal 18 mei 2021
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapps10119208.R;
import com.example.myapps10119208.fragment.media.VideoAdapter;
import com.example.myapps10119208.fragment.media.VideoUrl;

import java.util.Vector;


public class VideoFragment extends Fragment {

    RecyclerView recyclerView;
    Vector<VideoUrl> youtubeVideo = new Vector<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_4);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        youtubeVideo.add(new VideoUrl("<iframe width=\"100%\" height=\"100%\" src=\"https://user-images.githubusercontent.com/88697883/169069547-34b6bb09-30a7-4eb8-bf9b-292eff2ba7fd.mp4\" frameborder=\"0\" allowfullscreen></iframe>"));
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideo);
        recyclerView.setAdapter(videoAdapter);

        return view;
    }
}