package com.example.pruebarecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebarecyclerview.adaptadores.PokemonAdaptador;
import com.example.pruebarecyclerview.clases.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView Pokemon;
    List<Pokemon> listaPokemon = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pokemon = findViewById(R.id.Pokemon);

        Pokemon pokemon1 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/001.png","Bulbasaur","Planta,Veneno");
        Pokemon pokemon2 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/002.png","Ivysaur","Planta,Veneno");
        Pokemon pokemon3 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/003.png","Venusaur","Planta,Veneno");
        Pokemon pokemon4 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/004.png","Charmander","Fuego");
        Pokemon pokemon5 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/005.png","Charmeleon","Fuego");
        Pokemon pokemon6 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/006.png","Charizard","Fuego");
        Pokemon pokemon7 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/007.png","Squirtle","Agua");
        Pokemon pokemon8 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/008.png","Wartortle","Agua");
        Pokemon pokemon9 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/009.png","Blastoise","Agua");
        Pokemon pokemon10 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/025.png","Pikachu","Eléctrico");
        Pokemon pokemon11 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/026.png","Raichu","Eléctrico");
        Pokemon pokemon12 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/037.png","Vulpix","Fuego");
        Pokemon pokemon13 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/038.png","Ninetales","Fuego");
        Pokemon pokemon14 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/129.png","Magikarp","Agua");
        Pokemon pokemon15 = new Pokemon("https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/130.png","Gyarados","Agua");



        listaPokemon.add(pokemon1);
        listaPokemon.add(pokemon2);
        listaPokemon.add(pokemon3);
        listaPokemon.add(pokemon4);
        listaPokemon.add(pokemon5);
        listaPokemon.add(pokemon6);
        listaPokemon.add(pokemon7);
        listaPokemon.add(pokemon8);
        listaPokemon.add(pokemon9);
        listaPokemon.add(pokemon10);
        listaPokemon.add(pokemon11);
        listaPokemon.add(pokemon12);
        listaPokemon.add(pokemon13);
        listaPokemon.add(pokemon14);
        listaPokemon.add(pokemon15);

        Pokemon.setLayoutManager(new LinearLayoutManager(this));
        Pokemon.setAdapter(new PokemonAdaptador(listaPokemon));


    }
}