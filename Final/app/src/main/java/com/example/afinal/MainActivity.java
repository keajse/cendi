package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irPromedio (View view){
        Intent promedio = new Intent(MainActivity.this,Promedio.class);
        startActivity(promedio);
    }

    public void irDatos (View view){
        Intent datos = new Intent(MainActivity.this,formulario.class);
        startActivity(datos);
    }

}