package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GuardarActivity extends AppCompatActivity {

    TextView Rec_name, Rec_email, Rec_adress, Rec_depart, Rec_tiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        Rec_name = findViewById(R.id.Rec_name);
        Rec_email = findViewById(R.id.Rec_email);
        Rec_adress = findViewById(R.id.Rec_adress);
        //Rec_tiempo = findViewById(R.id.Rec_horario);


        Bundle miBundle = this.getIntent().getExtras();

        if (miBundle != null){
            String nombre = miBundle.getString("nombre");
            Rec_name.setText(nombre);

            String correo = miBundle.getString("correo");
            Rec_email.setText(correo);

            String direccion = miBundle.getString("direccion");
            Rec_adress.setText(direccion);

            /*String departamento= miBundle.getString("departamento");
            Rec_depart.setText(departamento);

            String tiempo = miBundle.getString("tiempo");
            Rec_tiempo.setText(tiempo);*/
        }


    }
}