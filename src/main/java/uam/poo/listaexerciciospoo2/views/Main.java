package uam.poo.listaexerciciospoo2.views;

import uam.poo.listaexerciciospoo2.models.Botao;
import uam.poo.listaexerciciospoo2.models.Empregado;
import uam.poo.listaexerciciospoo2.models.Lampada;

/**
 * @author NycolasVieira
 */
public class Main {
   public static void main(String[] args){
       teste();
   }
   
   public static void teste(){
       Lampada lampada1 = new Lampada();
       lampada1.preco = 4.30f;
       lampada1.estaAcessa = true;
       
       Empregado empregado1 = new Empregado();
       empregado1.id = 1;
       empregado1.primeiroNome = "Nycolas";
       empregado1.sobreNome = "de Lima Vieira";
       empregado1.salario = 5.000f;
       
       Botao botao1 = new Botao();
       botao1.posX = 2.3f;
       botao1.posY = 5.2f;
       botao1.largura = 2.0f;
       botao1.altura = 5.0f;
       botao1.texto = "Botão teste";
       botao1.formato = 1;
   }
}
