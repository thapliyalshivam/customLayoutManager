package com.example.tshivam.customlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = findViewById(R.id.rvDisplay);

        r1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        DisplayAdapter adapter = new DisplayAdapter(this);
        r1.setAdapter(adapter);

    }
}
