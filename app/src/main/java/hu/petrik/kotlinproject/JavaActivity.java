package hu.petrik.kotlinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class JavaActivity extends AppCompatActivity {
    private Button visszaGomb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        init();
        addListeners();
    }

    private void addListeners() {
        visszaGomb.setOnClickListener(view -> {
            Intent intent = new Intent(JavaActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }


    private void init() {
        visszaGomb = findViewById(R.id.javaGomb);
    }
}