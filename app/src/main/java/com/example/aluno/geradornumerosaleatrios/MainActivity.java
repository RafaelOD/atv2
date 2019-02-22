package com.example.aluno.geradornumerosaleatrios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void alterartexto(View view) {
        //Button b = (Button)view;
        //b.setText("Gerador de números aleatórios");
        //findViewById(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("SSSSS");

    }


}
