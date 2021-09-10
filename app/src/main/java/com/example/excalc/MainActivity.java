package com.example.excalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText valor1, valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.idResultado);
        valor1 = (EditText) findViewById((R.id.idValor1));
        valor2 = (EditText) findViewById(R.id.idValor2);

    }




        public void somar(View view) {

            double val1 = Double.parseDouble(valor1.getText().toString());
            double val2 = Double.parseDouble(valor2.getText().toString());
            resultado.setText(String.valueOf(val1+val2));
        }

        public void subtrair(View view){
            double val1 = Double.parseDouble(valor1.getText().toString());
            double val2 = Double.parseDouble(valor2.getText().toString());
            resultado.setText(String.valueOf(val1- val2));
        }
        public void multiplicar(View view) {
            double val1 = Double.parseDouble(valor1.getText().toString());
            double val2 = Double.parseDouble(valor2.getText().toString());
            resultado.setText(String.valueOf(val1 * val2));
        }
        public void dividir(View view) {
            double val1 = Double.parseDouble(valor1.getText().toString());
            double val2 = Double.parseDouble(valor2.getText().toString());
            resultado.setText(String.valueOf(val1 / val2));
        }
        public void limpar(View view){
            valor1.setText("");
            valor2.setText("");
            resultado.setText("");
    }

}