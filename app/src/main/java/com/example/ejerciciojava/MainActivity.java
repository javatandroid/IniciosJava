package com.example.ejerciciojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEtiqueta, tvResultado; //En la misma línea siempre y cuando sean del mismo tipo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar la vista
        tvEtiqueta = (TextView)findViewById(R.id.tvEtiqueta);
        tvResultado = (TextView)findViewById(R.id.tvResultado);

        //Editar el texto de un Text View
        tvEtiqueta.setText("Hola mundo");

        //Obtener el valor de un Text View
        String contenidoEtiqueta = tvEtiqueta.getText().toString();

        tvResultado.setText(contenidoEtiqueta);

    } //FIN OnCreate

}//FIN MainActivity
