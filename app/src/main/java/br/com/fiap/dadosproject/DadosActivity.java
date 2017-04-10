package br.com.fiap.dadosproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
    }
    //metodo para o clique do botao
    public void jogar(View view){
        ImageView imgJogador = (ImageView) findViewById(R.id.img_jogador);
        ImageView imgComputador = (ImageView) findViewById(R.id.img_computador);

        //sortear 2 numeros
        Random random = new Random();
        int jogador = random.nextInt(6);
        int computador = random.nextInt(6);

        switch (jogador){
            case 0:
                imgJogador.setImageResource(R.drawable.dado1);
                break;
            case 1:
                imgJogador.setImageResource(R.drawable.dado2);
                break;
            case 2:
                imgJogador.setImageResource(R.drawable.dado3);
                break;
            case 3:
                imgJogador.setImageResource(R.drawable.dado4);
                break;
            case 4:
                imgJogador.setImageResource(R.drawable.dado5);
                break;
            default:
                imgJogador.setImageResource(R.drawable.dado6);
                break;
        }

        switch (computador){
            case 0:
                imgComputador.setImageResource(R.drawable.dado1);
                break;
            case 1:
                imgComputador.setImageResource(R.drawable.dado2);
                break;
            case 2:
                imgComputador.setImageResource(R.drawable.dado3);
                break;
            case 3:
                imgComputador.setImageResource(R.drawable.dado4);
                break;
            case 4:
                imgComputador.setImageResource(R.drawable.dado5);
                break;
            default:
                imgComputador.setImageResource(R.drawable.dado6);
                break;
        }
        //recupera o TextView de resultado da tela do app
        TextView txtResultado = (TextView) findViewById(R.id.txt_resultado);

        //determinar vencedor
        if (jogador > computador){
            //jogador ganhou
            txtResultado.setText("Jogador Ganhou!!!");
        }else if(computador > jogador){
            //computador ganhou
            txtResultado.setText("Computador Ganhou!!!");
        }else {
            //empate
            txtResultado.setText("Empate!!!");
        }

        /*altera a imgagem do elemento da tela
        imgComputador.setImageResource(R.drawable.dado1);*/
    }

}
