package com.example.grupo3_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.grupo3_parcial.clases.partido;

import java.util.ArrayList;

public class JugadosActivity extends AppCompatActivity {


    private  int ganados, perdidos, empate;
    private TextView victorias, empates, derrotas;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jugados);
        victorias=findViewById(R.id.txtvictorias);
        derrotas=findViewById(R.id.txtderrotas);
        empates=findViewById(R.id.txtempates);

        ganados=0;
        perdidos=0;
        empate=0;

        ArrayList<partido> listado =(ArrayList<partido>) getIntent().getSerializableExtra("partido");

        for (int i = 0; i < listado.size(); i++) {
            partido p= listado.get(i);
            evaluar(p);



        }
        victorias.setText(String.valueOf(ganados));
        derrotas.setText(String.valueOf(perdidos));
        empates.setText(String.valueOf(empate));
    }

    public void evaluar(partido p){
        if (p.getGoles_anotados_principal()==p.getGoles_anotados_rival() ){
            empate++;
        }else if(p.getGoles_anotados_rival()<p.getGoles_anotados_principal()){
            ganados++;
        }else{
            perdidos++;
        }
    }
}