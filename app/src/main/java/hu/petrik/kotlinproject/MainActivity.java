package hu.petrik.kotlinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button javaGomb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addListeners();
    }

    private void addListeners() {
        javaGomb.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, JavaActivity.class);
            startActivity(intent);
            finish();
        });
    }


    private void init() {
        javaGomb = findViewById(R.id.javaGomb);
    }
}