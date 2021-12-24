package com.example.dz33a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Person> data;
private RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initRecycler();
    }

    private void initRecycler() {
        recycler = findViewById(R.id.recycler);
        Adapter adapter= new Adapter(data);
        recycler.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Person(R.drawable.img, "C"));
        data.add(new Person(R.drawable.img_1, "C++"));
        data.add(new Person(R.drawable.img_2, "Java"));
        data.add(new Person(R.drawable.img_3, "Android"));
        data.add(new Person(R.drawable.img_4, "Kotlin"));
        data.add(new Person(R.drawable.img_5, "HTML"));
        data.add(new Person(R.drawable.img, "C"));
        data.add(new Person(R.drawable.img_1, "C++"));
        data.add(new Person(R.drawable.img_2, "Java"));
        data.add(new Person(R.drawable.img_3, "Android"));
        data.add(new Person(R.drawable.img_4, "Kotlin"));
        data.add(new Person(R.drawable.img_5, "HTML"));
        data.add(new Person(R.drawable.img, "C"));
        data.add(new Person(R.drawable.img_1, "C++"));
        data.add(new Person(R.drawable.img_2, "Java"));
        data.add(new Person(R.drawable.img_3, "Android"));
        data.add(new Person(R.drawable.img_4, "Kotlin"));
        data.add(new Person(R.drawable.img_5, "HTML"));
    }
}