package com.progra3.calculadorapostfix.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.progra3.calculadorapostfix.R;
import android.util.Log;
import com.progra3.calculadorapostfix.utils.Pila;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //ejemplo
        Pila<Integer> pila = new Pila<>();

        pila.push(10);

        pila.push(20);

        pila.push(30);

        Log.d("PILA", "Peek: " + pila.peek());

        Log.d("PILA", "Pop: " + pila.pop());

        Log.d("PILA", "Peek actual: " + pila.peek());

        Log.d("PILA", "Size: " + pila.size());
    }
}