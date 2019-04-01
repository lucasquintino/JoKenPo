package com.example.jokenpo;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        selecionarOpcao("pedra");
    }
    public void selecionarPapel(View view){
        selecionarOpcao("papel");
    }
    public void selecionarTesoura(View view){
        selecionarOpcao("tesoura");
    }
    public void selecionarOpcao(String opcao){
        ImageView usuario = (ImageView) findViewById(R.id.usuario);
        switch(opcao) {
            case "pedra":
                usuario.setImageDrawable(getDrawable(R.drawable.pedra));
                break;
            case "papel":
                usuario.setImageDrawable(getDrawable(R.drawable.papel));
                break;
            case "tesoura":
                usuario.setImageDrawable(getDrawable(R.drawable.tesoura));
                break;
        }
        jogar(opcao);
    }
    public void jogar(String opcao){
        int numero = new Random().nextInt(3);
        switch(numero) {
            //pedra
            case 0:
                ImageView adversario = (ImageView) findViewById(R.id.adversario);
                adversario.setImageDrawable(getDrawable(R.drawable.pedra));
                if(opcao == "pedra"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você empatou!");
                } else if(opcao == "tesoura"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você perdeu!");
                  } else {
                        TextView text = (TextView) findViewById(R.id.text);
                        text.setText("Você ganhou!");
                    }
                break;
            //papel
            case 1:
                ImageView adversario2 = (ImageView) findViewById(R.id.adversario);
                adversario2.setImageDrawable(getDrawable(R.drawable.papel));
                if(opcao == "pedra"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você perdeu!");
                } else if(opcao == "tesoura"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você ganhou!");
                } else {
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você empatou!");
                }
                break;
            //tesoura
            case 2:
                ImageView adversario3 = (ImageView) findViewById(R.id.adversario);
                adversario3.setImageDrawable(getDrawable(R.drawable.tesoura));
                if(opcao == "pedra"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você ganhou!");
                } else if(opcao == "tesoura"){
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você empatou!");
                } else {
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText("Você perdeu!");
                }
                break;
        }
    }
}
