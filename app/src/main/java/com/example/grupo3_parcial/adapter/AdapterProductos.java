package com.example.grupo3_parcial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.grupo3_parcial.R;
import com.example.grupo3_parcial.clases.partido;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterProductos extends RecyclerView.Adapter<AdapterProductos.ViewHolder> {
    private ArrayList<partido> listaPartidos;
    private OnItemClickListener onItemClickListener;

    public AdapterProductos(ArrayList<partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
        this.onItemClickListener=null;

    }
    public void setListaPartidos(ArrayList<partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public AdapterProductos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_partido,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProductos.ViewHolder holder, int position) {
        partido p= listaPartidos.get(position);
        holder.enlazar(p);}


    @Override
    public int getItemCount() {
        return listaPartidos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameRival, golesEquipo, golesRival;
        private ImageView escudo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameRival=itemView.findViewById(R.id.nombreEquipo);
            golesEquipo=itemView.findViewById(R.id.golesEquipo);
            golesRival=itemView.findViewById(R.id.golesRival);
            escudo=itemView.findViewById(R.id.escudo);

        }
        public void enlazar(partido p){
            nameRival.setText(p.getNombre_rival());
            golesRival.setText(String.valueOf(p.getGoles_anotados_rival()));
            golesEquipo.setText(String.valueOf(p.getGoles_anotados_principal()));
            Picasso.get().load(p.getEscudo_url())
                    .error(R.drawable.ic_launcher_background)
                   .into(escudo);

            if(onItemClickListener!=null){
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClickListener.onItemClick(p,getAdapterPosition());
                    }
                });
            }

        }

    }

    public  interface OnItemClickListener{
        void onItemClick(partido p, int posicion);

    }
}
