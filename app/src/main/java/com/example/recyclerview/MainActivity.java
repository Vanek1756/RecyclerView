package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItemArrayList = new ArrayList<>();
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,
                "Happy", "Life is fun!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,
                "Sad", "Life is sad!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,
                "Neutral", "Life is life!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,
                "Happy", "Life is fun!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,
                "Sad", "Life is sad!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,
                "Neutral", "Life is life!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,
                "Happy", "Life is fun!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,
                "Sad", "Life is sad!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,
                "Neutral", "Life is life!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,
                "Happy", "Life is fun!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,
                "Sad", "Life is sad!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,
                "Neutral", "Life is life!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_alt_24,
                "Happy", "Life is fun!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_dissatisfied_24,
                "Sad", "Life is sad!"));
        recyclerViewItemArrayList.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24,
                "Neutral", "Life is life!"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(new RecyclerViewAdapter(recyclerViewItemArrayList));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}