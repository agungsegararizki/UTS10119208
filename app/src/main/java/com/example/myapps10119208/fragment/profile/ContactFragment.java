package com.example.myapps10119208.fragment.profile;
//dikerjakan oleh agung segara rizki pada tanggal 18 mei 2021
import android.content.Intent;
import android.net.Uri;
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
import com.example.myapps10119208.fragment.profile.MyFragment;
import com.example.myapps10119208.fragment.profile.ContactFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapps10119208.R;


public class ContactFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);


        Button wabtn = (Button) view.findViewById(R.id.btn_whatsapp);
        wabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wa.me/6283825382525"));
                startActivity(intent);
            }
        });

        Button telebtn = (Button) view.findViewById(R.id.btn_telegram);
        telebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/6283825382525"));
                startActivity(intent);
            }
        });

        Button gitbtn = (Button) view.findViewById(R.id.btn_github);
        gitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/agungsegararizki"));
                startActivity(intent);
            }
        });

        Button emailtbtn = (Button) view.findViewById(R.id.btn_gmail);
        emailtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/?hl=en#inbox?compose=DmwnWtMlRGxQvTgSFWTZPfRzTptcFXnLmTLTKJBZltXTbtsGxxQxkCxDWGgpJzTkdNgWzfzbzCFq"));
                startActivity(intent);
            }
        });

        return view;
    }
}