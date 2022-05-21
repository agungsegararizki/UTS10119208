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
import com.example.myapps10119208.fragment.profile.AboutFragment;
import com.example.myapps10119208.fragment.profile.ContactFragment;
import com.example.myapps10119208.fragment.profile.FindFragment;
import com.example.myapps10119208.fragment.profile.MyFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import com.example.myapps10119208.R;


public class ProfileFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button btn = (Button) view.findViewById(R.id.btn_profile);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new MyFragment());
                fr.commit();
            }
        });

        Button conbtn = (Button) view.findViewById(R.id.btn_contact);
        conbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new ContactFragment());
                fr.commit();
            }
        });

        Button findbtn = (Button) view.findViewById(R.id.btn_find);
        findbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new FindFragment());
                fr.commit();
            }
        });

        Button abotbtn = (Button) view.findViewById(R.id.btn_about);
        abotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.page_profile, new AboutFragment());
                fr.commit();
            }
        });

        return view;
    }
}