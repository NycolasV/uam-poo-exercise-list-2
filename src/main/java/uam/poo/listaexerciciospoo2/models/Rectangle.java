package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class Rectangle {
    
    private int id;
    
    private String color;
    
    private float posX;
    
    private float posY;
    
    private float width;
    
    private float height;

    private float area;
    
    private float perimeter;
    
    public Rectangle() {
    }

    public Rectangle(int id, String color, float posX, float posY, float width, float height) {
        this.id = id;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.area = (width * height);
        this.perimeter = ((width * 2) + (height * 2));
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

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
    
}
