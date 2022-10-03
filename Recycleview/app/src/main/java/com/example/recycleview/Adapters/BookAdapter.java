package com.example.recycleview.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.Model.BookModel;
import com.example.recycleview.R;

import java.util.ArrayList;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.viewHolder> {
   ArrayList<BookModel> list;
   Context context;

    public BookAdapter(ArrayList<BookModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(context).inflate(R.layout.booklist,parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
         BookModel model= list.get(position);
         holder.bookImage.setImageResource(model.getImage());
         holder.bookName.setText(model.getBookName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView bookImage;
        TextView bookName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            bookImage=itemView.findViewById(R.id.bkimg);
            bookName=itemView.findViewById(R.id.bktxt);
        }
    }


}
