package uam.poo.listaexerciciospoo2.controllers;

import java.util.ArrayList;
import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.*;

/**
 * @author NycolasVieira
 */
public class CircleController {

    public Circle createCircle(int id, String color, float radius, float posX, float posY, Scanner scanner) {
        while (id <= 0) {
            System.err.println("Id inválido, insira novamente: ");
            id = Integer.parseInt(scanner.next());
        }

        while (radius <= 0) {
            System.err.println("Raio inválido, insira novamente");
            radius = Float.parseFloat(scanner.next());
        }

        while (posX <= 0) {
            System.err.println("Posição X inválida, insira novamente: ");
            posX = Float.parseFloat(scanner.next());
        }

        while (posY <= 0) {
            System.err.println("Posição Y inválida, insira novamente: ");
            posY = Float.parseFloat(scanner.next());
        }

        return new Circle(id, color, radius, posX, posY);
    }

    public double getCircumference(int id, ArrayList<Circle> circles) {
        for (Circle circle : circles) {
            if (id == circle.getId()) {
                return circle.getArea();
            }
        }

        return 0;
    }

    public double setCircumference(int id, ArrayList<Circle> circles, float radius) {
        for (Circle circle : circles) {
            if (id == circle.getId()) {
                if (radius > 0) {
                    return (Math.PI * Math.pow(radius, 2));
                }
            }
        }

        return 0;
    }

    public double getPerimeter(int id, ArrayList<Circle> circles) {
        for (Circle circle : circles) {
            if (id == circle.getId()) {
                return circle.getPerimeter();
            }
        }

        return 0;
    }

    public double setPerimeter(int id, ArrayList<Circle> circles, float radius) {
        for (Circle circle : circles) {
            if (id == circle.getId()) {
                if (radius > 0) {
                    return (Math.PI * radius * 2);
                }
            }
        }

        return 0;
    }
}
