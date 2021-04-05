package com.example.myfinances;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Keuangan> keuanganArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        KeuanganAdapter keuanganAdapter = new KeuanganAdapter(keuanganArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keuanganAdapter);
    }

    public void getData(){
        keuanganArrayList = new ArrayList<>();
        keuanganArrayList.add(new Keuangan("Beli Keperluan Usaha", "Keluar", "5/03/21", "500000 "));
        keuanganArrayList.add(new Keuangan("Pendapatan Usaha", "Masuk", "5/03/21", "1500000 "));
        keuanganArrayList.add(new Keuangan("Membeli Bahan Baku", "Keluar", "27/01/21", "350000 "));
        keuanganArrayList.add(new Keuangan("Penjualan", "Masuk", "29/01/21", "400000 "));
    }
}