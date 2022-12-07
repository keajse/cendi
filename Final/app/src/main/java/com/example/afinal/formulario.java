package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    EditText txt_nombre, txt_email, txt_direccion;
    RadioButton radBtnCompleto, radBtnMedioTiempo;
    Spinner spnDepartamento;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        txt_nombre = findViewById(R.id.edt_name);
        txt_email = findViewById(R.id.edt_email);
        txt_direccion = findViewById(R.id.edt_Adress);
        spnDepartamento = findViewById(R.id.spinner);

        radBtnCompleto = findViewById(R.id.rbtn_completo);
        radBtnMedioTiempo = findViewById(R.id.rbtn_MedioTiempo);


    }

    public void guardar(View view){

        if(txt_nombre.getText().toString().equals("") || txt_email.getText().toString().equals("") ){
            Toast.makeText(formulario.this, "Ingresar nombre y correo", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(formulario.this, "Vamos bien", Toast.LENGTH_LONG);
        }

    }
}