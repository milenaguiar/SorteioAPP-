package com.example.sorteioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado     = findViewById(R.id.textResultado);
    }

    public  void sortearNumero (View view){
        int x = new Random().nextInt(11);
        textResultado.setText(" O número selecionado foi: " + x);

    }
}
