package com.example.makanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Data> dataArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new MakananAdapter(dataArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        dataArrayList = new ArrayList<>();
        dataArrayList.add(new Data("PISANG_MUGET", "Bahan : pisang, cream, tepung adonan ", "Harga : 15.000.", R.drawable.pisan_muget));
        dataArrayList.add((new Data("PISCOK", "Bahan : pisang, cream, tepung adonan ", "Harga : 17.000.", R.drawable.piscok)));
        dataArrayList.add((new Data("SEBLAK", "Bahan : sosis , mie, kuah, siomay, sayur", "Harga: 14.000.", R.drawable.seblak)));

    }
}
