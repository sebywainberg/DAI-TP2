package com.example.dai_tp2;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton[] ArrayBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayBot = new ImageButton[9];
        ArrayBot[0] = (ImageButton) findViewById(R.id.Boton1);
        ArrayBot[1] = (ImageButton) findViewById(R.id.Boton2);
        ArrayBot[2] = (ImageButton) findViewById(R.id.Boton3);
        ArrayBot[3] = (ImageButton) findViewById(R.id.Boton4);
        ArrayBot[4] = (ImageButton) findViewById(R.id.Boton5);
        ArrayBot[5] = (ImageButton) findViewById(R.id.Boton6);
        ArrayBot[6] = (ImageButton) findViewById(R.id.Boton7);
        ArrayBot[7] = (ImageButton) findViewById(R.id.Boton8);
        ArrayBot[8] = (ImageButton) findViewById(R.id.Boton9);


        Random randomimg;
        randomimg = new Random();
        for (int i = 0; i < 9; i++) {
            int numimg = randomimg.nextInt(2);
            ImageButton BotonACambiar;
            BotonACambiar = ArrayBot[i];
            if (numimg == 0) {
                BotonACambiar.setImageResource(R.drawable.misse);
            } else {
                BotonACambiar.setImageResource(R.drawable.ranoldo);
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void arranque(View vistoncita) {
        TextView juan;
        juan = (TextView) findViewById(R.id.contador);
        juan.setVisibility(View.VISIBLE);
        TextView juan2;
        juan2 = (TextView) findViewById(R.id.jugadas);
        juan2.setVisibility(View.VISIBLE);
        ArrayBot[0].setVisibility(View.VISIBLE);
        ArrayBot[1].setVisibility(View.VISIBLE);
        ArrayBot[2].setVisibility(View.VISIBLE);
        ArrayBot[3].setVisibility(View.VISIBLE);
        ArrayBot[4].setVisibility(View.VISIBLE);
        ArrayBot[5].setVisibility(View.VISIBLE);
        ArrayBot[6].setVisibility(View.VISIBLE);
        ArrayBot[7].setVisibility(View.VISIBLE);
        ArrayBot[8].setVisibility(View.VISIBLE);


    }

    public void click(View vista) {
        TextView juan;
        juan = (TextView) findViewById(R.id.contador);
        int number;
        number = Integer.parseInt(juan.getText().toString());
        number++;
        juan.setText(Integer.toString(number));
        ImageButton PressedB;
        PressedB = (ImageButton) vista;
        String PressedTag;
        PressedTag = PressedB.getTag().toString();
        int NumPressedB;
        NumPressedB = Integer.parseInt(PressedTag);
        switch (NumPressedB) {
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
        int messi = 0;
        int ronaldo = 0;
        Drawable.ConstantState codmessi;
        codmessi = getDrawable(R.drawable.misse).getConstantState();
        for (int i = 0; i < 9; i++) {

            ImageButton miboton;
            miboton = ArrayBot[i];
            Drawable.ConstantState codigoImagenpres;
            codigoImagenpres = miboton.getDrawable().getConstantState();
            if (codigoImagenpres == codmessi) {
                messi++;
            } else {
                ronaldo++;
            }
        }
        if (ronaldo == 9 || messi == 9) {
            number--;
            TextView ganador;
            ganador = (TextView) findViewById(R.id.msjGana);
            ganador.setVisibility(View.VISIBLE);
            juan = (TextView) findViewById(R.id.contador);
            juan.setVisibility(View.GONE);
            TextView juan2;
            juan2 = (TextView) findViewById(R.id.jugadas);
            juan2.setVisibility(View.GONE);
            ganador.setText("Ganaste con "+ number+ " jugadas");


        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void InvertirImagenBoton(int bot) {

        ImageButton miboton;
        miboton = ArrayBot[bot];
        Drawable.ConstantState codigoImagenpres;
        codigoImagenpres = miboton.getDrawable().getConstantState();
        Drawable.ConstantState codigoImagen1;
        codigoImagen1 = getDrawable(R.drawable.misse).getConstantState();

        if (codigoImagenpres == codigoImagen1) {
            ArrayBot[bot].setImageResource(R.drawable.ranoldo);
        } else {
            ArrayBot[bot].setImageResource(R.drawable.misse);
        }

    }
}

