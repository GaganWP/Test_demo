package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.recycleview.Fragments.FirstFragment;
import com.example.recycleview.Fragments.SecondFragment;

public class MainActivity2 extends AppCompatActivity {

    Button fbutton,sbutton;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fbutton=findViewById(R.id.fbtn);
        sbutton=findViewById(R.id.sbtn);
        linearLayout=findViewById(R.id.vlayout);

        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment first=new FirstFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.vlayout,first);
                transaction.commit();
            }
        });

        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment second=new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.vlayout,second);
                transaction.commit();
                
            }
        });


    }
}