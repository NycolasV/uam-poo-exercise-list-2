package uam.poo.listaexerciciospoo2.views;

import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.Botao;
import uam.poo.listaexerciciospoo2.models.Empregado;
import uam.poo.listaexerciciospoo2.models.Lampada;

/**
 * @author NycolasVieira
 */
public class Main {
   public static void main(String[] args){
       testeIO();
   }
   
   public static void testeIO(){
       Lampada lampada1 = new Lampada();
       Empregado empregado1 = new Empregado();
       Botao botao1 = new Botao();
       Scanner input = new Scanner(System.in);
       
       System.out.println("Insira um preco na lampada: ");
       lampada1.preco = input.nextFloat();
       input.nextLine();
       
       System.out.println("A lampada esta acesa? ");
       lampada1.estaAcessa = input.nextBoolean();
       input.nextLine();
       
       System.out.println("--------------------------------");
       
       System.out.println("Insira o id do empregado: ");
       empregado1.id = input.nextInt();
       input.nextLine();
       
       System.out.println("Insira o primeiro nome do empregado: ");
       empregado1.primeiroNome = input.nextLine();
       
       System.out.println("Insira o sobrenome do empregado: ");
       empregado1.sobreNome = input.nextLine();
       
       System.out.println("Insira o salario do empregado: ");
       empregado1.salario = input.nextFloat();
       input.nextLine();
       
       System.out.println("--------------------------------");
       
       System.out.println("Insira a posicao horizontal do botao: ");
       botao1.posX = input.nextFloat();
       input.nextLine();
       
       System.out.println("Insira a posicao vertical do botao: ");
       botao1.posY = input.nextFloat();
       input.nextLine();
       
       System.out.println("Insira a largura do botao: ");
       botao1.largura = input.nextFloat();
       input.nextLine();
       
       System.out.println("Insira a altura do botao: ");
       botao1.altura = input.nextFloat();
       input.nextLine();
       
       System.out.println("Insira o texto do botao: ");
       botao1.texto = input.nextLine();
       
       System.out.println("Insira o formato do botao: ");
       botao1.formato = input.nextInt();
       input.close();
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
