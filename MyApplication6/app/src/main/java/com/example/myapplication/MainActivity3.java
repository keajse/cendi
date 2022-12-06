package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText nota1, nota2, nota3, nota4;
    private TextView resultado, res;
    private Button promedio;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nota1 = (EditText) findViewById(R.id.edit_mat);
        nota2 = (EditText) findViewById(R.id.edit_ing);
        nota3 = (EditText) findViewById(R.id.edit_pensAlg);
        nota4 = (EditText) findViewById(R.id.edit_Android);

        promedio = (Button) findViewById(R.id.btn_calcular);
        resultado = (TextView) findViewById(R.id.txtResultado);

        res = (TextView)findViewById(R.id.txt_resp);

        promedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(nota1.getText().toString());
                float num2 = new Float(nota2.getText().toString());
                float num3 = new Float(nota3.getText().toString());
                float num4 = new Float(nota4.getText().toString());

                float prom = (num1+num2+num3+num4)/4;

                resultado.setText(""+ prom);

                if (prom >= 3.0){
                    res.setText("APROBADO 🥳😁");
                }else{
                    res.setText("REPROBADO 😢😭");
                }


            }
        });
    }



}