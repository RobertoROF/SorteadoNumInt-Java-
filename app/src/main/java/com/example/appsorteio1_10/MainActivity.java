package com.example.appsorteio1_10;

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
    public void sortearNum(View view){
        TextView texto = findViewById(R.id.textView3);//Identificando qual TextView vai ser alterado

        int num = new Random().nextInt(11); //Sorteando um numero inteiro de 0 a 10

        texto.setText("O numero escolhido foi: "+ num); //Mostra qual numero foi sirteado
    }

}