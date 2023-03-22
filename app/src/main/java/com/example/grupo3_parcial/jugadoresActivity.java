package com.example.grupo3_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.grupo3_parcial.clases.partido;

public class jugadoresActivity extends AppCompatActivity {

    private partido partido;
    private TextView titulo;
    String mensaje="Partido ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);

        partido=(partido) getIntent().getSerializableExtra("partido");
        setTitle(mensaje+"Vs "+partido.getNombre_rival());

        titulo=findViewById(R.id.txtTitulo);

        evaluar(partido);

        titulo.setText(mensaje);

    }
    public void evaluar(partido partido){
        if (partido.getGoles_anotados_principal()==partido.getGoles_anotados_rival() ){
            mensaje+="Empatado";
        }else if(partido.getGoles_anotados_rival()<partido.getGoles_anotados_principal()){
            mensaje+="Ganado";
        }else{
            mensaje+="Perdido";
        }
    }
}