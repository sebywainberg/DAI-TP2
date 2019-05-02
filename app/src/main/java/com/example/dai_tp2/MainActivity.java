package com.example.dai_tp2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton[] ArrayBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayBot = new ImageButton[9];
        ArrayBot[0] = (ImageButton)findViewById(R.id.Boton1);
        ArrayBot[1] = (ImageButton)findViewById(R.id.Boton2);
        ArrayBot[2] = (ImageButton)findViewById(R.id.Boton3);
        ArrayBot[3] = (ImageButton)findViewById(R.id.Boton4);
        ArrayBot[4] = (ImageButton)findViewById(R.id.Boton5);
        ArrayBot[5] = (ImageButton)findViewById(R.id.Boton6);
        ArrayBot[6] = (ImageButton)findViewById(R.id.Boton7);
        ArrayBot[7] = (ImageButton)findViewById(R.id.Boton8);
        ArrayBot[8] = (ImageButton)findViewById(R.id.Boton9);


        Random randomimg;
        randomimg = new Random();
        for (int i = 0; i < 9; i++) {
            int numimg = randomimg.nextInt(2);
            ImageButton BotonACambiar;
            BotonACambiar=ArrayBot[i];
            if(numimg==0){
                BotonACambiar.setImageResource(R.drawable.misse);
            }
            else{
                BotonACambiar.setImageResource(R.drawable.ranoldo);
            }
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void click (View vista){


        Drawable.ConstantState codmessi;
        codmessi=getDrawable(R.drawable.misse).getConstantState();
        Drawable.ConstantState codronaldo;
        codronaldo=getDrawable(R.drawable.ranoldo).getConstantState();
        if(){

        }


        ImageButton PressedB;
        PressedB =  (ImageButton)vista;
        String PressedTag;
        PressedTag= PressedB.getTag().toString();
        int NumPressedB;
        NumPressedB= Integer.parseInt(PressedTag);
        switch (NumPressedB){
            case 0:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(1);
                InvertirImagenBoton(3);
                InvertirImagenBoton(4);
                break;
            case 1:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(0);
                InvertirImagenBoton(2);
                InvertirImagenBoton(4);
                break;
            case 2:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(1);
                InvertirImagenBoton(4);
                InvertirImagenBoton(5);
                break;
            case 3:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(0);
                InvertirImagenBoton(4);
                InvertirImagenBoton(6);
                break;
            case 4:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(1);
                InvertirImagenBoton(3);
                InvertirImagenBoton(5);
                InvertirImagenBoton(7);
                break;
            case 5:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(2);
                InvertirImagenBoton(4);
                InvertirImagenBoton(8);
                break;
            case 6:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(3);
                InvertirImagenBoton(4);
                InvertirImagenBoton(7);
                break;
            case 7:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(4);
                InvertirImagenBoton(6);
                InvertirImagenBoton(8);
                break;
            case 8:
                InvertirImagenBoton(NumPressedB);
                InvertirImagenBoton(4);
                InvertirImagenBoton(5);
                InvertirImagenBoton(7);
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void InvertirImagenBoton(int bot){

        ImageButton miboton;
        miboton=ArrayBot[bot];
        Drawable.ConstantState codigoImagen1;
        codigoImagen1=getDrawable(R.drawable.misse).getConstantState();
        Drawable.ConstantState codigoImagenpres;
        codigoImagenpres=miboton.getDrawable().getConstantState();
        if(codigoImagenpres == codigoImagen1){
            ArrayBot[bot].setImageResource(R.drawable.ranoldo);
        }
        else{
            ArrayBot[bot].setImageResource(R.drawable.misse);
        }

    }
}

