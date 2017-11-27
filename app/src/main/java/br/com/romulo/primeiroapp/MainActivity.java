package br.com.romulo.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoClicado(View v) {
        TextView tViewResultado = findViewById(R.id.resultadoCalculo);
        TextView tConclusao = findViewById(R.id.conclusao);
        try {

        EditText eTextAltura = findViewById(R.id.alturaUsuario);
        EditText eTextPeso = findViewById(R.id.pesoUsuario);


            double altura = Double.parseDouble(eTextAltura.getText().toString());
            double peso = Double.parseDouble(eTextPeso.getText().toString());
            if (altura == 0) {
                tViewResultado.setText("Altura nula");


            } else {
                double imc = peso / (altura * altura);
                tViewResultado.setText(String.format("%.3f", imc));
                if (imc > 30) {
                    tConclusao.setText("Obeso");
                } else if (imc > 25) {
                    tConclusao.setText("Sobrepeso");
                } else if (imc > 18.50) {
                    tConclusao.setText("Peso normal");
                } else if (imc <= 18.50) {
                    tConclusao.setText("Abaixo do Peso Ideal3");
                }
            }
        } catch (java.lang.IllegalStateException | java.lang.NumberFormatException e1) {
            tViewResultado.setText("Digite Altura e Peso");
            tConclusao.setText("");
        }
    }
}