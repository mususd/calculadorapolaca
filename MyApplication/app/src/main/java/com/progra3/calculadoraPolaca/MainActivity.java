package com.progra3.calculadoraPolaca;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etExpresion;
    TextView tvResultado;
    TextView tvPostfix;
    TextView tvPasos;
    Button btnEvaluar;
    Button btnConvertir;
    Button btnLimpiar;
    RadioButton rbPostfix;
    RadioButton rbInfix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etExpresion = findViewById(R.id.etExpresion);
        tvResultado = findViewById(R.id.tvResultado);
        tvPostfix = findViewById(R.id.tvPostfix);
        tvPasos = findViewById(R.id.tvPasos);
        btnEvaluar = findViewById(R.id.btnEvaluar);
        btnConvertir = findViewById(R.id.btnConvertir);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        rbPostfix = findViewById(R.id.rbPostfix);
        rbInfix = findViewById(R.id.rbInfix);
        btnEvaluar.setOnClickListener(v -> evaluar());
        btnConvertir.setOnClickListener(v -> convertir());
        btnLimpiar.setOnClickListener(v -> limpiar());
    }

    private void evaluar() {
        String expr = etExpresion.getText().toString().trim();
        if (expr.isEmpty()) {
            tvResultado.setText("Ingresa una expresión");
            return;
        }

        try {
            String postfix;
            if (rbInfix.isChecked()) {
                postfix = ConversorPostfix.convertir(expr);
            } else {
                postfix = expr;
            }
            tvPostfix.setText("Postfix: " + postfix);
            double resultado = EvaluadorPostFix.evaluar(postfix);
            tvResultado.setText("Resultado: " + resultado);
            tvPasos.setText(generarPasos(postfix));
        } catch (Exception e) {
            tvResultado.setText("Error: " + e.getMessage());
        }
    }

    private void convertir() {
        String expr = etExpresion.getText().toString().trim();
        if (expr.isEmpty()) {
            tvPostfix.setText("Ingresa una expresión");
            return;
        }

        try {
            String postfix = ConversorPostfix.convertir(expr);
            tvPostfix.setText("Postfix: " + postfix);
        } catch (Exception e) {
            tvPostfix.setText("Error: " + e.getMessage());
        }
    }

    private void limpiar() {
        etExpresion.setText("");
        tvResultado.setText("");
        tvPostfix.setText("");
        tvPasos.setText("");
    }

    private String generarPasos(String postfix) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasos de la pila:\n\n");
        Pila pila = new Pila();
        String[] tokens = postfix.trim().split("\\s+");
        for (String token : tokens) {
            try {
                double num = Double.parseDouble(token);
                pila.insertar(num);
                sb.append("INSERTAR ")
                        .append(num)
                        .append(" → tope = ")
                        .append(pila.verTope())
                        .append("\n");
            } catch (NumberFormatException e) {
                double b = pila.eliminar();
                double a = pila.eliminar();
                double r = 0;
                switch (token) {
                    case "+":
                        r = a + b;
                        break;
                    case "-":
                        r = a - b;
                        break;
                    case "*":
                        r = a * b;
                        break;
                    case "/":
                        r = a / b;
                        break;
                    case "%":
                        r = a % b;
                        break;
                    case "^":
                        r = Math.pow(a, b);
                        break;
                }
                pila.insertar(r);
                sb.append(a)
                        .append(" ")
                        .append(token)
                        .append(" ")
                        .append(b)
                        .append(" = ")
                        .append(r)
                        .append("\n");
            }
        }
        return sb.toString();
    }
}