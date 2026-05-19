package com.progra3.calculadoraPolaca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    TextView txtPila;

    String numeroActual = "";

    Pila pila = new Pila();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResultado = findViewById(R.id.txtResultado);
        txtPila = findViewById(R.id.txtPila);
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnPunto = findViewById(R.id.btnPunto);
        Button btnEnter = findViewById(R.id.btnEnter);
        Button btnSumar = findViewById(R.id.btnSumar);
        Button btnRestar = findViewById(R.id.btnRestar);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);
        Button btnModulo = findViewById(R.id.btnModulo);
        Button btnPotencia = findViewById(R.id.btnPotencia);
        Button btnLimpiar = findViewById(R.id.btnLimpiar);

        // NÚMEROS
        btn0.setOnClickListener(v -> agregarNumero("0"));
        btn1.setOnClickListener(v -> agregarNumero("1"));
        btn2.setOnClickListener(v -> agregarNumero("2"));
        btn3.setOnClickListener(v -> agregarNumero("3"));
        btn4.setOnClickListener(v -> agregarNumero("4"));
        btn5.setOnClickListener(v -> agregarNumero("5"));
        btn6.setOnClickListener(v -> agregarNumero("6"));
        btn7.setOnClickListener(v -> agregarNumero("7"));
        btn8.setOnClickListener(v -> agregarNumero("8"));
        btn9.setOnClickListener(v -> agregarNumero("9"));
        btnPunto.setOnClickListener(v -> agregarNumero("."));
        // ENTER
        btnEnter.setOnClickListener(v -> {
            if (!numeroActual.isEmpty()) {
                pila.insertar(Double.parseDouble(numeroActual));
                numeroActual = "";
                txtResultado.setText("0");
                actualizarPila();
            }
        });
        // OPERADORES
        btnSumar.setOnClickListener(v -> operar("+"));
        btnRestar.setOnClickListener(v -> operar("-"));
        btnMultiplicar.setOnClickListener(v -> operar("*"));
        btnDividir.setOnClickListener(v -> operar("/"));
        btnModulo.setOnClickListener(v -> operar("%"));
        btnPotencia.setOnClickListener(v -> operar("^"));
        // CLEAR
        btnLimpiar.setOnClickListener(v -> {
            pila = new Pila();
            numeroActual = "";
            txtResultado.setText("0");
            actualizarPila();
        });
        actualizarPila();
    }
    private void agregarNumero(String numero) {
        numeroActual += numero;
        txtResultado.setText(numeroActual);
    }
    private void operar(String operador) {
        try {
            if (pila.getTamanio() < 2) {
                txtResultado.setText("Error");
                return;
            }
            double b = pila.eliminar();
            double a = pila.eliminar();
            double resultado = 0;
            switch (operador) {
                case "+":
                    resultado = a + b;
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "*":
                    resultado = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        txtResultado.setText("División entre 0");
                        return;
                    }
                    resultado = a / b;
                    break;
                case "%":
                    if (b == 0) {
                        txtResultado.setText("Módulo entre 0");
                        return;
                    }
                    resultado = a % b;
                    break;
                case "^":
                    resultado = Math.pow(a, b);
                    break;
            }
            pila.insertar(resultado);
            txtResultado.setText(String.valueOf(resultado));
            actualizarPila();
        } catch (Exception e) {
            txtResultado.setText("Error");
        }
    }
    private void actualizarPila() {
        txtPila.setText(pila.toString());
    }
}