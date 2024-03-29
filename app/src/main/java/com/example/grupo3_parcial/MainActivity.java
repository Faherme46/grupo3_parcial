package com.example.grupo3_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.grupo3_parcial.adapter.AdapterProductos;
import com.example.grupo3_parcial.clases.partido;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<partido> listaPartidos;
    private RecyclerView recyclerView;
    private Button btnJugados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Partidos de la Seleccion");
        cargarDatos();
        recyclerView=findViewById(R.id.listaPartidos);
        btnJugados=findViewById(R.id.bJugados);

        AdapterProductos adapter=new AdapterProductos(listaPartidos);
        adapter.setOnItemClickListener(new AdapterProductos.OnItemClickListener() {
            @Override
            public void onItemClick(partido p, int posicion) {
                Intent i1=new Intent(MainActivity.this, jugadoresActivity.class);
                i1.putExtra("partido",p);
                startActivity(i1);
            }
        });

        btnJugados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, JugadosActivity.class);
                i.putExtra("partido",listaPartidos);
                startActivity(i);
            }
        });



        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


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

        partido partido1 = new partido("Venezuela",1, "https://e00-marca.uecdn.es/deporte/futbol/copa-america/2016/img/escudos/venezuela.png",2,equipo1);
        partido partido2 = new partido("Argentina",2, "https://logodownload.org/wp-content/uploads/2016/11/argentina-national-football-team-logo-1-1.png",1,equipo2);
        partido partido3 = new partido("Peru",0, "https://i.pinimg.com/originals/df/80/24/df8024f334cb93242252e56555493cf4.png",2,equipo3);
        partido partido4 = new partido("Brasil",1, "https://i.pinimg.com/originals/5f/6b/60/5f6b606c2c2e7e0cc5c6d6de2edb7afe.png",1,equipo4);
        partido partido5 = new partido("Ecuador",1, "https://static.wikia.nocookie.net/futbol/images/b/b2/Ecuador.png/revision/latest?cb=20210804150428",0,equipo5);

        listaPartidos=new ArrayList<>();
        listaPartidos.add(partido1);
        listaPartidos.add(partido2);
        listaPartidos.add(partido3);
        listaPartidos.add(partido4);
        listaPartidos.add(partido5);
    }
}