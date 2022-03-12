package com.prathamyadav006.viewme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userlist;
    private Context context;
    public Adapter(List<ModelClass> userlist, Context context){
        this.context = context;
        this.userlist = userlist;
    };


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.item_desing,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int image = userlist.get(position).getImageview();
        String animalName = userlist.get(position).getTextview();

        holder.setData(image,animalName);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "This is "+ animalName, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        ImageView imageview;
        TextView textview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.imageview);
            textview = itemView.findViewById(R.id.textview);

        }

        public void setData(int image, String animalName) {

            imageview.setImageResource(image);
            textview.setText(animalName);

        }
    }
}
