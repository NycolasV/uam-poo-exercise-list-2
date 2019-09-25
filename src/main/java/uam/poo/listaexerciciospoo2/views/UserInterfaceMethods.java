package uam.poo.listaexerciciospoo2.views;

import java.util.ArrayList;
import java.util.Scanner;
import uam.poo.listaexerciciospoo2.controllers.*;
import uam.poo.listaexerciciospoo2.models.*;

/**
 * @author NycolasVieira
 */
public class UserInterfaceMethods {

    public CircleController circleController;
    public RectangleController rectangleController;

    public UserInterfaceMethods() {
        circleController = new CircleController();
        rectangleController = new RectangleController();
    }

    public void showCircleList(ArrayList<Circle> circles) {
        if (circles == null || circles.isEmpty()) {
            System.out.println("\nLISTA DE CÍRCULOS ESTÁ VAZIA\n");
            return;
        }

        System.out.println("\n------- LISTA DE CÍRCULOS -------\n");
        System.out.println("Quantidade de círculos: " + circles.size());

        circles.forEach((circle) -> {
            System.out.println("Id: " + circle.getId() + "; Raio: " + circle.getRadius());
        });
    }

    public void showRectangleList(ArrayList<Rectangle> rectangles) {
        if (rectangles == null || rectangles.isEmpty()) {
            System.out.println("\nLISTA DE RETÃNGULOS ESTÁ VAZIA\n");
            return;
        }

        System.out.println("\n------- LISTA DE RETÂNGULOS -------\n");
        System.out.println("Quantidade de retângulos: " + rectangles.size());

        rectangles.forEach((rectangle) -> {
            System.out.println("Id: " + rectangle.getId() + "; "
                    + "Largura: " + rectangle.getWidth() + "; Altura: " + rectangle.getHeight());
        });
    }

    public Circle createCircle(Scanner scanner) {
        System.out.println("\n------- CÍRCULO -------\n");

        System.out.println("Insira o id: ");
        int id = Integer.parseInt(scanner.next());

        System.out.println("Insira a cor: ");
        String color = scanner.next();

        System.out.println("Insira o raio: ");
        float radius = Float.parseFloat(scanner.next());
        scanner.nextLine();

        System.out.println("Insira a posição X: ");
        float posX = Float.parseFloat(scanner.next());
        scanner.nextLine();

        System.out.println("Insira a posição Y: ");
        float posY = Float.parseFloat(scanner.next());

        return circleController.createCircle(id, color, radius, posX, posY, scanner);
    }

    public Rectangle createRectangle(Scanner scanner) {
        System.out.println("\n------- RETÂNGULO -------\n");

        System.out.println("Insira o id: ");
        int id = Integer.parseInt(scanner.next());

        System.out.println("Insira a cor: ");
        String color = scanner.next();

        System.out.println("Insira a posição X: ");
        float posX = Float.parseFloat(scanner.next());

        System.out.println("Insira a posição Y: ");
        float posY = Float.parseFloat(scanner.next());

        System.out.println("Insira a largura: ");
        float width = Float.parseFloat(scanner.next());

        System.out.println("Insira a altura: ");
        float height = Float.parseFloat(scanner.next());

        return rectangleController.createRectangle(id, color, posX, posY, width, height, scanner);
    }
}
