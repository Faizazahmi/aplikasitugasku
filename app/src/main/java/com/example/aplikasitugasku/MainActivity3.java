package com.example.aplikasitugasku;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
private EditText editTextEmailAddress;

EditText password;

boolean passwordVisible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        password = findViewById(R.id.password);

        };  public void imageButton5(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);

    }; public void imageButton6(View view) {
            Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
            startActivity(intent);
    }
}
