package com.example.pruebarecyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    ImageView img_pokemon_add;
    TextView txt_nombre_pokemon_add, txt_tipo_pokemon_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img_pokemon_add = findViewById(R.id.img_pokemon_add);
        txt_nombre_pokemon_add = findViewById(R.id.txt_nombre_pokemon_add);
        txt_tipo_pokemon_add = findViewById(R.id.txt_tipo_pokemon_add);

        String imagen = getIntent().getStringExtra("imagen");
        String nombre = getIntent().getStringExtra("nombre");
        String tipo = getIntent().getStringExtra("tipo");

        Picasso.get().load(imagen).into(img_pokemon_add);
        txt_nombre_pokemon_add.setText(nombre);
        txt_tipo_pokemon_add.setText(tipo);

    }
}