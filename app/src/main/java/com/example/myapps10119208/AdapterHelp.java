package com.example.myapps10119208;
//dikerjakan oleh agung segara rizki pada tanggal 16 mei 2021
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterHelp extends RecyclerView.Adapter {
    Context context;
    ArrayList arrayList, arrayListName ;

    public AdapterHelp(Context context, ArrayList arrayList, ArrayList arrayListName){
        this.context = context;
        this.arrayList = arrayList;
        this.arrayListName = arrayListName;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolderClass viewHolderClass = new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass = (ViewHolderClass) holder;
        viewHolderClass.imageView.setImageResource(Adapter.images[position]);
        viewHolderClass.textView.setText(Adapter.names[position]);

    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
