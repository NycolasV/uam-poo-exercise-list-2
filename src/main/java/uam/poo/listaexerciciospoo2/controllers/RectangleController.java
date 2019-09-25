package uam.poo.listaexerciciospoo2.controllers;

import java.util.ArrayList;
import java.util.Scanner;
import uam.poo.listaexerciciospoo2.models.*;

/**
 * @author NycolasVieira
 */
public class RectangleController {

    public Rectangle createRectangle(int id, String color, float posX, float posY, float width, float height, Scanner scanner) {
        while (id <= 0) {
            System.err.println("Id inválido, insira novamente: ");
            id = Integer.parseInt(scanner.next());
        }

        while (posX <= 0) {
            System.err.println("Posição X inválida, insira novamente: ");
            posX = Float.parseFloat(scanner.next());
        }

        while (posY <= 0) {
            System.err.println("Posição Y inválida, insira novamente: ");
            posY = Float.parseFloat(scanner.next());
        }

        while (width <= 0) {
            System.err.println("Largura inválida, insira novamente: ");
            width = Float.parseFloat(scanner.next());
        }

        while (height <= 0) {
            System.err.println("Altura inválida, insira novamente: ");
            height = Float.parseFloat(scanner.next());
        }

        return new Rectangle(id, color, posX, posY, width, height);
    }

    public double getArea(int id, ArrayList<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            if (id == rectangle.getId()) {
                return rectangle.getArea();
            }
        }

        return 0;
    }

    public Rectangle setArea(int id, ArrayList<Rectangle> rectangles, float width, float height) {
        if (id > 0) {
            System.err.println("Id inválido");
            return null;
        }

        for (Rectangle rectangle : rectangles) {
            if (id == rectangle.getId()) {
                if (width <= 0 && height <= 0) {
                    System.err.println("Altura e largura inválidos");
                    return null;
                }

                rectangle.setWidth(width);
                rectangle.setHeight(height);
                rectangle.setArea(width * height);
                return rectangle;
            }
        }

        System.err.println("Id informado não existe");
        return null;
    }

    public double getPerimeter(int id, ArrayList<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            if (id == rectangle.getId()) {
                return rectangle.getPerimeter();
            }
        }

        return 0;
    }

    public Rectangle setPerimeter(int id, ArrayList<Rectangle> rectangles, float width, float height) {
        if (id > 0) {
            System.err.println("Id inválido");
            return null;
        }

        for (Rectangle rectangle : rectangles) {
            if (id == rectangle.getId()) {
                if (width <= 0 && height <= 0) {
                    System.err.println("Altura e largura inválidos");
                    return null;
                }

                rectangle.setWidth(width);
                rectangle.setHeight(height);
                rectangle.setPerimeter((width * 2) + (height * 2));
                return rectangle;
            }
        }

        System.err.println("Id informado não existe");
        return null;
    }
}
