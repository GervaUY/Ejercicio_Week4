package com.gerva.ejercicioweek4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> listMascotas;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMascotas = new ArrayList<>();
        recyclerView = findViewById(R.id.amRvMascotas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        llenarMascotas();
        RecyclerAdapter adapter = new RecyclerAdapter(listMascotas);
        recyclerView.setAdapter(adapter);

        }

    private void llenarMascotas() {
        listMascotas.add(new Mascota("Dueque",R.drawable.mascota_1));
        listMascotas.add(new Mascota("Sultán",R.drawable.mascota_2));
        listMascotas.add(new Mascota("Bombo",R.drawable.mascota3));
        listMascotas.add(new Mascota("Lali",R.drawable.mascota4));
        listMascotas.add(new Mascota("Peque",R.drawable.mascota5));
        listMascotas.add(new Mascota("Ramón",R.drawable.mascota_6));
        listMascotas.add(new Mascota("Lola",R.drawable.mascota7));
    }


    }
