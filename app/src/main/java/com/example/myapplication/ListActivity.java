package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<Tree> trees;
    ListAdapter adapter;
    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        trees = new ArrayList<>();
        trees.add(new Tree("Cây thông","chịu lạnh tốt","xanh",R.drawable.thong));
        trees.add(new Tree("cây đào","nở hoa vào mùa xuân","xanh",R.drawable.dao));
       ListView listTree = findViewById(R.id.list_tree);
        adapter = new ListAdapter(ListActivity.this,R.layout.activity_item,trees);
        listTree.setAdapter(adapter);
    }

}