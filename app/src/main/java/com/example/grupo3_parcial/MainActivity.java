package com.example.grupo3_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.grupo3_parcial.clases.partido;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<partido> listaPartidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Partidos de la Seleccion");


    }
}