package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView imageResultado;
    private ImageButton imageButtonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);
        imageResultado = findViewById(R.id.imageResultado);
        //Recuperar os dados da MainActivity com Bundle
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");
        if (numero == 0) {
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else{
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }
        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}