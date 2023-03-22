package com.example.grupo3_parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.grupo3_parcial.clases.partido;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String[] equipo1    ={
            "W. Fariñez",
            "R. Hernandez",
            "N. Ferraresi",
            "C. Makoun",
            "O. Gonzales",
            "J. Martinez",
            "T. Rincon",
            "Y. Herrera",
            "D. Machis",
            "J. Rondon",
            "Y. Soteldo"

    };
    String[] equipo2    ={
            "D. Martinez",
            "G. Montiel",
            "G. Pezzella",
            "L. Martinez",
            "M. Acuña",
            "G. Lo Celso",
            "G. Rodriguez",
            "Papu Gomez",
            "A. Di Maria",
            "L. Martinez",
            "L. Ocampos"

    };
    String[] equipo3    ={
            "P. Gallese",
            "M. lopez",
            "A. Callens",
            "C. zambrano",
            "A. Corzo",
            "R. Tapia",
            "C. Cueva",
            "Y. Yotun",
            "S. Peña",
            "A. Carrillo",
            "G. Lapadula"

    };
    String[] equipo4    ={
            "Alisson",
            "Danilo",
            "Maqeuinhos",
            "T. silva",
            "A. Sandro",
            "Fred",
            "Casemiro",
            "Lucas Paqueta",
            "Raphinha",
            "G. Jesus",
            "Neymar"

    };
    String[] equipo5    ={
            "A. Dominguez",
            "P. Estupiñan",
            "P. hincapie",
            "F. Torres",
            "A. Preciado",
            "A. Mena",
            "C. gruezo",
            "M. Caicedo",
            "A. Franco",
            "E. Valencia",
            "M. Estrada"

    };


    public void cargarDatos(){

        partido partido1 = new partido("Venezuela",1, "http://as00.epimg.net/img/comunes/fotos/fichas/equipos/large/2930.png",2,equipo1);
        partido partido2 = new partido("Argentina",2, "https://logodownload.org/wp-content/uploads/2016/11/argentina-national-football-team-logo-1-1.png",1,equipo2);
        partido partido3 = new partido("Peru",0, "http://as00.epimg.net/img/comunes/fotos/fichas/equipos/large/1429.png",2,equipo3);
        partido partido4 = new partido("Brasil",1, "http://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/1881.png",1,equipo4);
        partido partido5 = new partido("Ecuador",1, "https://static.wikia.nocookie.net/futbol/images/b/b2/Ecuador.png/revision/latest?cb=20210804150428",0,equipo5);
    }
}