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
       testeIOConstrutor();
   }
   
   public static void testeIOConstrutor(){
       try (Scanner input = new Scanner(System.in)) {
           System.out.println("Insira um preco na lampada: ");
           float preco  = input.nextFloat();
           input.nextLine();
           
           System.out.println("A lampada esta acesa? ");
           boolean estaAcessa = input.nextBoolean();
           input.nextLine();
           
           System.out.println("--------------------------------");
           
           System.out.println("Insira o id do empregado: ");
           int id = input.nextInt();
           input.nextLine();
           
           System.out.println("Insira o primeiro nome do empregado: ");
           String primeiroNome = input.nextLine();
           
           System.out.println("Insira o sobrenome do empregado: ");
           String sobreNome = input.nextLine();
           
           System.out.println("Insira o salario do empregado: ");
           Float salario = input.nextFloat();
           input.nextLine();
           
           System.out.println("--------------------------------");
           
           System.out.println("Insira a posicao horizontal do botao: ");
           float posX = input.nextFloat();
           input.nextLine();
           
           System.out.println("Insira a posicao vertical do botao: ");
           float posY = input.nextFloat();
           input.nextLine();
           
           System.out.println("Insira a largura do botao: ");
           float largura = input.nextFloat();
           input.nextLine();
           
           System.out.println("Insira a altura do botao: ");
           float altura = input.nextFloat();
           input.nextLine();
           
           System.out.println("Insira o texto do botao: ");
           String texto = input.nextLine();
           
           System.out.println("Insira o formato do botao: ");
           int formato = input.nextInt();
           
           System.out.println("--------------------------------");
           
           Lampada lampada1 = new Lampada(preco, estaAcessa);
           Empregado empregado1 = new Empregado(id, primeiroNome, sobreNome, salario);
           Botao botao1 = new Botao(posX, posY, largura, altura, texto, formato);
       } catch (Exception ex){
           System.out.println(ex.getMessage());
       }
   }
}
