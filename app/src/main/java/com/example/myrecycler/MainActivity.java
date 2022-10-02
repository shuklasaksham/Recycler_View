package com.example.myrecycler;


import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecycler.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Rahul Kumar", R.drawable.d),
                new MyListData("Chris Nolan", R.drawable.a),
                new MyListData("Perm Kallis", R.drawable.b),
                new MyListData("David Jones", R.drawable.g),
                new MyListData("Karan Mehta", R.drawable.c),
                new MyListData("Emily Harris", R.drawable.e),
                new MyListData("Kumar Baldev", R.drawable.f),
                new MyListData("Ram Kapoor", R.drawable.h),
                new MyListData("Heera Thakur", R.drawable.i),
        };

        RecyclerView recyclerView = binding.recyclerView;
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}