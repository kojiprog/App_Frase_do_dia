package com.projeto.projeto_frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Não perca a motivação só porque as coisas não estão correndo como o " +
                "previsto. Adversidade gera sabedoria e é isso que levará você ao sucesso.",

                "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é " +
                        "por isso que ele é recomendado diariamente.",

                "Há dias que você tem que ir para a frente só com o que você tem na mão, não dá para" +
                        " esperar pela motivação.",

                "Eu acredito em você e na sua capacidade porque conheço o seu esforço e a sua " +
                        "motivação. Não desista!",
               

        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.txtResultado);
        texto.setText(frases[numero]);

    }

}