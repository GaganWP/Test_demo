package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recycleview.Adapters.BookAdapter;
import com.example.recycleview.Model.BookModel;
import com.example.recycleview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<BookModel> list=new ArrayList<>();

        list.add(new BookModel(R.drawable.untitled1,"Book1"));
        list.add(new BookModel(R.drawable.untitled2,"Book2"));
        list.add(new BookModel(R.drawable.untitled3,"Book3"));
        list.add(new BookModel(R.drawable.untitled4,"Book4"));
        list.add(new BookModel(R.drawable.untitled5,"Book5"));
        list.add(new BookModel(R.drawable.untitled6,"Book6"));
        list.add(new BookModel(R.drawable.untitled7,"Book7"));
        list.add(new BookModel(R.drawable.untitled8,"Book8"));


        BookAdapter adapter=new BookAdapter(list,this);
        binding.recycleView.setAdapter(adapter);

        LinearLayoutManager lm=new LinearLayoutManager(this);
        binding.recycleView.setLayoutManager(lm);


    }
}