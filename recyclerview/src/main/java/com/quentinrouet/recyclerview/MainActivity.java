package com.quentinrouet.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.quentinrouet.recyclerview.bo.Voiture;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Voiture> alVoiture = new ArrayList<>();
        alVoiture.add(new Voiture("Renault","Clio",90,2017,"essence"));
        alVoiture.add(new Voiture("Renault","Mégane ETech",180,2022,"électricité"));
        alVoiture.add(new Voiture("Citroen","eC4",135,2022,"électricité"));
        alVoiture.add(new Voiture("Tesla","Model S",600,2022,"électricité"));
        alVoiture.add(new Voiture("Tesla","Model 3",350,2022,"électricité"));
        alVoiture.add(new Voiture("Hyundai","Ioniq",120,2016,"électricité"));
        alVoiture.add(new Voiture("Hyundai","Kona",170,2022,"électricité"));
        alVoiture.add(new Voiture("Kia","eNiro",170,2022,"électricité"));

        RecyclerView rvVoiture = findViewById(R.id.rvVoiture);
        rvVoiture.setLayoutManager(new LinearLayoutManager(this));
        rvVoiture.setAdapter(new VoitureAdapter(alVoiture));
    }
}