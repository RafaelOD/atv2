package com.example.aluno.geradornumerosaleatrios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //public void alterartexto(View view) {
        //Button b = (Button)view;
        //b.setText("Gerador de números aleatórios");
        //findViewById(R.layout.activity_main);
        //TextView text = (TextView) findViewById(R.id.textView2);
        //text.setText("SSSSS");

    //}

    TextView Textnumero1 = (TextView) findViewById(R.id.numero1);
    int numero1 = Integer.parseInt(Textnumero1.getText().toString());

    TextView Textnumero2 = (TextView) findViewById(R.id.numero2);
    int numero2 = Integer.parseInt(Textnumero2.getText().toString());


    Random aleatorio = new Random();
    int randon = aleatorio.nextInt(numero2) + numero1;

    public void gerar(View view) {

        TextView sorteio = (TextView) findViewById(R.id.sorteio);

        sorteio.setText(Integer.toString(randon));


    }
}

