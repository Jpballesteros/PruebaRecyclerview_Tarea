package com.example.pruebarecyclerview.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.MainActivity2;
import com.example.pruebarecyclerview.R;
import com.example.pruebarecyclerview.clases.Pokemon;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdaptador extends RecyclerView.Adapter<PokemonAdaptador.ViewHolder> {

    private List<Pokemon> datos;

    public PokemonAdaptador(List<Pokemon> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public PokemonAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdaptador.ViewHolder holder, int position) {
        Pokemon dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView txt_nombre_pokemon,txt_tipo_pokemon;
        ImageView img_pokemon;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_pokemon = itemView.findViewById(R.id.txt_nombre_pokemon);
            txt_tipo_pokemon = itemView.findViewById(R.id.txt_tipo_pokemon);
            img_pokemon = itemView.findViewById(R.id.img_pokemon);
        }

        public void bind(Pokemon dato){
            txt_nombre_pokemon.setText(dato.getNombre());
            txt_tipo_pokemon.setText(dato.getTipo());
            //Imagen libreria
            Picasso.get().load(dato.getImagen()).into(img_pokemon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), MainActivity2.class);
                    i.putExtra("imagen",dato.getImagen());
                    i.putExtra("nombre",dato.getNombre());
                    i.putExtra("tipo",dato.getTipo());
                    view.getContext().startActivity(i);
                }
            });

        }
    }
}
