package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class Circle {
    
    private int id;
    
    private String color;
    
    private float radius;
    
    private float posX;
    
    private float posY;
    
    private double area;
    
    private double perimeter;

    public Circle() {
    }

    public Circle(int id, String color, float radius, float posX, float posY) {
        this.id = id;
        this.color = color;
        this.radius = radius;
        this.posX = posX;
        this.posY = posY;
        this.area = (Math.PI * Math.pow(radius, 2));
        this.perimeter = (Math.PI * radius * 2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
