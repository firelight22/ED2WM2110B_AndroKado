package com.quentinrouet.androkado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.quentinrouet.androkado.bo.Article;
import com.quentinrouet.androkado.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding amb = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Article painAuChocolat = new Article(
                "Pain Au chocolat",
                "Une viennoiserie au beurre et du chocolat",
                "https://wikipedia.org/wiki/Pain_au_chocolat",
                1.1f,
                4.0f,
                true
        );
        amb.setArticle(painAuChocolat);
        amb.buttonUrl.setOnClickListener(
                view -> {
                    Toast.makeText(MainActivity.this, painAuChocolat.getUrl(), Toast.LENGTH_SHORT).show();
                    Intent intentToInfoUrl = new Intent(MainActivity.this,InfoUrlActivity.class);
                    intentToInfoUrl.putExtra("article",painAuChocolat);
                    startActivity(intentToInfoUrl);
                }
        );

        //TextView tvTitre = findViewById(R.id.textViewNomArticle);
        //TextView textViewPrix = findViewById(R.id.textViewPrix);
        //TextView textViewDescription = findViewById(R.id.textViewDescription);
        //RatingBar ratingBarDegreEnvie = findViewById(R.id.ratingBarDegreEnvie);
        //ImageButton imageButtonUrl = findViewById(R.id.buttonUrl);
        //ToggleButton toggleButtonIsAchete = findViewById(R.id.toggleButtonIsAchete);
//
        //tvTitre.setText(painAuChocolat.getTitre());
        //textViewPrix.setText(painAuChocolat.getPrix()+ "€");
        //textViewDescription.setText(painAuChocolat.getDescription());
        //ratingBarDegreEnvie.setRating(painAuChocolat.getDegreEnvie());
        //toggleButtonIsAchete.setChecked(painAuChocolat.isAchete());
        //toggleButtonIsAchete.setOnCheckedChangeListener((compoundButton, b) -> painAuChocolat.setAchete(b));
    }
}