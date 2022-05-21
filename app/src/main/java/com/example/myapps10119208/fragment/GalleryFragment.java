package com.example.myapps10119208.fragment;
//dikerjakan oleh agung segara rizki pada tanggal 16 mei 2021
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import androidx.fragment.app.Fragment;

import com.example.myapps10119208.GalleryAdapter;
import com.example.myapps10119208.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {

    ArrayList<String> ImgUrl= new ArrayList<>();
    RecyclerView recyclerView;
    GalleryAdapter adapter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();

        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        ImgUrl.add("https://raw.githubusercontent.com/agungsegararizki/AKB-Latihan/main/2019-08-16%2008.51.40%201.jpg");
        ImgUrl.add("https://raw.githubusercontent.com/agungsegararizki/AKB-Latihan/main/2019-08-07%2007.37.38%201.jpg");
        ImgUrl.add("https://raw.githubusercontent.com/agungsegararizki/AKB-Latihan/main/2019-08-16%2008.52.36%201.jpg");


        this.recyclerView = (RecyclerView)view.findViewById(R.id.recycleView);
        int numberOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
        adapter = new GalleryAdapter(ImgUrl, getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
}