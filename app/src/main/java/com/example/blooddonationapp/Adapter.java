package com.example.blooddonationapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewholder> {
ArrayList<blood_database>arrayList =new ArrayList<>();

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
           holder.bloodgroup.setText(arrayList.get(position).getBlood_group());;
           holder.name.setText(arrayList.get(position).getName());
           holder.age.setText(arrayList.get(position).getAge());
           holder.contact.setText(arrayList.get(position).getMob_no());
           holder.address.setText(arrayList.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public void update(ArrayList<blood_database>arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }
    public class viewholder extends RecyclerView.ViewHolder{
        TextView name,bloodgroup,age,contact,address;
        public viewholder(@NonNull View itemView) {
            super(itemView);
           name=itemView.findViewById(R.id.tname);
           bloodgroup=itemView.findViewById(R.id.bloodgroupt);
           age=itemView.findViewById(R.id.aget);
           contact=itemView.findViewById(R.id.numbert);
           address=itemView.findViewById(R.id.addresst);
        }
    }
}
