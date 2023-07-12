package com.example.gamesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    //1.Data
    private Context context;
    private ArrayList<GameModel> gameList;

    /* 2 . Constructor */

    public MyAdapter(Context context, ArrayList<GameModel> gameList) {
        this.context = context;
        this.gameList = gameList;
    }

    //3. View Holder
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView gameImg;
        private TextView gameTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            gameImg=itemView.findViewById(R.id.img);
            gameTitle=itemView.findViewById(R.id.gametitle);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GameModel model=gameList.get(position);
        holder.gameTitle.setText(model.getGameName());
        holder.gameImg.setImageResource(model.getGameImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Choose: "+gameList.get(position).getGameName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

}
