package com.example.aplikasitugasku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void imageButton4(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
        startActivity(intent);

    }; public void imageButton10(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
        startActivity(intent);
    }
}
