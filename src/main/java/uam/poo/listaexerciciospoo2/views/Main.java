package uam.poo.listaexerciciospoo2.views;

import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.*;

/**
 * @author NycolasVieira
 */
public class Main {
    public static void main(String[] args){
        testeEncapsulamento();
    }
   
    public static void testeEncapsulamento(){
        var lampada = new LampadaEncapsulada();
        var empregado = new EmpregadoEncapsulado();
        var botao = new BotaoEncapsulado();
        var input = new Scanner(System.in);

        insertValuesLampada(input, lampada);

        insertValuesEmpregado(input, empregado);

        insertValuesBotao(input, botao);

        input.close();
    }

    public static LampadaEncapsulada insertValuesLampada(Scanner input, LampadaEncapsulada lampada){
        try{
             System.out.println("Insira um preco na lampada: ");
             lampada.setPreco(input.nextFloat());
             while(lampada.getPreco() == 0){
                 System.out.println("Preco invalido, insira novamente: ");
                 lampada.setPreco(input.nextFloat());
             }
             input.nextLine();

             System.out.println("A lampada esta acesa? ");
             lampada.setEstaAcessa(input.nextBoolean());

             System.out.println("--------------------------------");
             return lampada;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static EmpregadoEncapsulado insertValuesEmpregado(Scanner input, EmpregadoEncapsulado empregado){
        try{
             System.out.println("Insira o id do empregado: ");
             empregado.setId(input.nextInt());   
             while(empregado.getId() == 0){
                 System.out.println("Id invalido, insira novamente: ");
                 empregado.setId(input.nextInt());   
             }
             input.nextLine();

             System.out.println("Insira o primeiro nome do empregado: ");
             empregado.setPrimeiroNome(input.nextLine());

             System.out.println("Insira o sobrenome do empregado: ");
             empregado.setSobreNome(input.nextLine());

             System.out.println("Insira o salario do empregado: ");
             empregado.setSalario(input.nextFloat());
             while(empregado.getSalario() == 0){
                 System.out.println("Salario invalido, insira novamente: ");
                 empregado.setSalario(input.nextFloat());
             }

             System.out.println("--------------------------------");
             return empregado;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static BotaoEncapsulado insertValuesBotao(Scanner input, BotaoEncapsulado botao){
        try{
            System.out.println("Insira a posicao horizontal do botao: ");
            botao.setPosX(input.nextFloat());
            while(botao.getPosX() == 0){
                 System.out.println("Posicao X invalida, insira novamente: ");
                 botao.setPosX(input.nextFloat());
             }
            input.nextLine();

            System.out.println("Insira a posicao vertical do botao: ");
            botao.setPosY(input.nextFloat());
            while(botao.getPosY()== 0){
                 System.out.println("Posicao Y invalida, insira novamente: ");
                 botao.setPosY(input.nextFloat());
             }
            input.nextLine();

            System.out.println("Insira a largura do botao: ");
            botao.setLargura(input.nextFloat());
            input.nextLine();

            System.out.println("Insira a altura do botao: ");
            botao.setAltura(input.nextFloat());
            input.nextLine();

            System.out.println("Insira o texto do botao: ");
            botao.setTexto(input.nextLine());

            System.out.println("Insira o formato do botao: ");
            botao.setFormato(input.nextInt());

            System.out.println("--------------------------------");
            return botao;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}