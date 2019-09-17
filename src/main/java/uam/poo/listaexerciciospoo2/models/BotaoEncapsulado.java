package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class BotaoEncapsulado {
    
    private float posX;
    
    private float posY;
    
    private float largura;
    
    private float altura;
    
    private String texto;
    
    private int formato;

    public BotaoEncapsulado() {
    }
    
    public BotaoEncapsulado(float posX, float posY, float largura, float altura, String texto, int formato) {
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
        this.formato = formato;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        if(posX <= 0){
            return;
        }
        
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if(posY <= 0){
            return;
        }
        
        this.posY = posY;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }
}
