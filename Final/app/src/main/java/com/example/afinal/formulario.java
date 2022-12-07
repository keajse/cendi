package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    EditText edt_name, edt_email, edt_Adress;
    RadioButton rbtn_completo, rbtn_MedioTiempo;
    Spinner spinner;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        edt_name = findViewById(R.id.edt_name);
        edt_email = findViewById(R.id.edt_email);
        edt_Adress = findViewById(R.id.edt_Adress);
        spinner = findViewById(R.id.spinner);

        rbtn_completo = findViewById(R.id.rbtn_completo);
        rbtn_MedioTiempo = findViewById(R.id.rbtn_MedioTiempo);


    }

    public void guardar(View view){

        if(edt_name.getText().toString().equals("") || edt_email.getText().toString().equals("") ){
            Toast.makeText(formulario.this, "Ingresar nombre y correo", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(formulario.this,GuardarActivity.class);


            String horario = "";

            if(rbtn_completo.isChecked()){
                horario = "Tiempo Completo";
            }else{
                horario = "Medio Tiempo";
            }

            intent.putExtra("horario", horario);

            Bundle miBundle = new Bundle();
            miBundle.putString("nombre", edt_name.getText().toString());
            miBundle.putString("correo", edt_email.getText().toString());
            miBundle.putString("direccion", edt_Adress.getText().toString());


            intent.putExtras(miBundle);
            startActivity(intent);


        }

    }
}