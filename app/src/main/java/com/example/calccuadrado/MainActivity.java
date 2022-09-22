package com.example.calccuadrado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.internal.EdgeToEdgeUtils;

public class MainActivity extends AppCompatActivity {

    private EditText editText = null;
    private TextView txResultado=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.numero);
        txResultado=findViewById(R.id.result);
    }

    public void Calcular_cuadrado(View view) {
        String texto = String.valueOf(editText.getText());
        long numero = 0;
        if (! texto.isEmpty()){
            numero = Long.valueOf(texto);
        }
        if (numero>100000){
            editText.setError("Escribe un numero de 5 cifras o menos");
        }


        long resultado = numero*numero;

        txResultado.setText(String.valueOf(resultado));

    }
}