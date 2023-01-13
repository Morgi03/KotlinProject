package hu.petrik.kotlinproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity {
    private Button visszaGomb;
    private EditText nevInput;
    private Button kuldesGomb;
    private TextView koszontoSzoveg;

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

        kuldesGomb.setOnClickListener(view -> {
            String nev = nevInput.getText().toString().trim();
            koszontoSzoveg.setText("Hello "+nev);
            if (nev.length() <= 10) koszontoSzoveg.setTextColor(Color.RED);
            else if (nev.length() > 10 && nev.length() <= 20) koszontoSzoveg.setTextColor(Color.GREEN);
            else if (nev.length() > 20 && nev.length() <= 30) koszontoSzoveg.setTextColor(Color.BLUE);
            else koszontoSzoveg.setTextColor(Color.BLACK);
        });
    }


    private void init() {
        visszaGomb = findViewById(R.id.visszaGomb);
        nevInput = findViewById(R.id.nevInput);
        kuldesGomb = findViewById(R.id.kuldesGomb);
        koszontoSzoveg = findViewById(R.id.koszontoSzoveg);
    }
}