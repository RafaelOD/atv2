package com.example.aluno.geradornumerosaleatrios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView Textnumero1;
    TextView Textnumero2;
    TextView sorteio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Textnumero1 = (TextView) findViewById(R.id.numero1);
        Textnumero2 = (TextView) findViewById(R.id.numero2);
        sorteio = (TextView) findViewById(R.id.sorteio);
    }

    //public void alterartexto(View view) {
        //Button b = (Button)view;
        //b.setText("Gerador de números aleatórios");
        //findViewById(R.layout.activity_main);
        //TextView text = (TextView) findViewById(R.id.textView2);
        //text.setText("SSSSS");

    //}

    public void gerar(View view) {
        int result=0;




        if(!Textnumero1.getText().toString().contentEquals("")){
            int numero1 = Integer.parseInt(Textnumero1.getText().toString());
            result = numero1 + 273;
            sorteio.setText(Integer.toString(result));
            result = 0;

        }else if(!Textnumero2.getText().toString().contentEquals("")){
            int numero2 = Integer.parseInt(Textnumero2.getText().toString());
            result = (numero2 * (9/5)) + 32;
            sorteio.setText(Integer.toString(result));
            result = 0;
        }


    }


    public void Limpar(View view) {
        sorteio.setText("Resultado");
        Textnumero1.setText("");
        Textnumero2.setText("");


    }
}

