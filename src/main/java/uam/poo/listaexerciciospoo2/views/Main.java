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
       testeIOConstrutorMod();
   }
   
   public static void testeIOConstrutorMod(){
       var input = new Scanner(System.in);
       
       insertValuesLampada(input);
       
       insertValuesEmpregado(input);
       
       insertValuesBotao(input);
       
       input.close();
   }
   
   public static Lampada insertValuesLampada(Scanner input){
       try{
            System.out.println("Insira um preco na lampada: ");
            float preco  = input.nextFloat();
            input.nextLine();

            System.out.println("A lampada esta acesa? ");
            boolean estaAcessa = input.nextBoolean();

            System.out.println("--------------------------------");
            return new Lampada(preco, estaAcessa);
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }
   
   public static Empregado insertValuesEmpregado(Scanner input){
       try{
            System.out.println("Insira o id do empregado: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.println("Insira o primeiro nome do empregado: ");
            String primeiroNome = input.nextLine();

            System.out.println("Insira o sobrenome do empregado: ");
            String sobreNome = input.nextLine();

            System.out.println("Insira o salario do empregado: ");
            Float salario = input.nextFloat();

            System.out.println("--------------------------------");
            return new Empregado(id, primeiroNome, sobreNome, salario);
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }
   
   public static Botao insertValuesBotao(Scanner input){
       try{
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
           return new Botao(posX, posY, largura, altura, texto, formato);   
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
           return null;
       }
   }
}