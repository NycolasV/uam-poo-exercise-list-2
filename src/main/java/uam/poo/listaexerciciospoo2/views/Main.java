package uam.poo.listaexerciciospoo2.views;

import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.Botao;
import uam.poo.listaexerciciospoo2.models.Empregado;
import uam.poo.listaexerciciospoo2.models.Lampada;

/**
 * @author NycolasVieira
 */
public class Main {
    public static Lampada lampada;
    public static Empregado empregado;
    public static Botao botao;
    
    public static void main(String[] args){
        lampada = new Lampada();
        empregado = new Empregado();
        botao = new Botao();
        
        teste();
    }
   
    public static void teste(){
        var input = new Scanner(System.in);

        insertValuesLampada(input);

        insertValuesEmpregado(input);

        insertValuesBotao(input);

        input.close();
    }

    public static Lampada insertValuesLampada(Scanner input){
        try{
             System.out.println("Insira um preco na lampada: ");
             lampada.preco = input.nextFloat();
             input.nextLine();

             System.out.println("A lampada esta acesa? ");
             lampada.estaAcessa = input.nextBoolean();

             System.out.println("--------------------------------");
             return lampada;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static Empregado insertValuesEmpregado(Scanner input){
        try{
             System.out.println("Insira o id do empregado: ");
             empregado.id = input.nextInt();
             input.nextLine();

             System.out.println("Insira o primeiro nome do empregado: ");
             empregado.primeiroNome = input.nextLine();

             System.out.println("Insira o sobrenome do empregado: ");
             empregado.sobreNome = input.nextLine();

             System.out.println("Insira o salario do empregado: ");
             empregado.salario = input.nextFloat();

             System.out.println("--------------------------------");
             return empregado;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static Botao insertValuesBotao(Scanner input){
        try{
            System.out.println("Insira a posicao horizontal do botao: ");
            botao.posX = input.nextFloat();
            input.nextLine();

            System.out.println("Insira a posicao vertical do botao: ");
            botao.posY = input.nextFloat();
            input.nextLine();

            System.out.println("Insira a largura do botao: ");
            botao.largura = input.nextFloat();
            input.nextLine();

            System.out.println("Insira a altura do botao: ");
            botao.altura = input.nextFloat();
            input.nextLine();

            System.out.println("Insira o texto do botao: ");
            botao.texto = input.nextLine();

            System.out.println("Insira o formato do botao: ");
            botao.formato = input.nextInt();

            System.out.println("--------------------------------");
            return botao;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}