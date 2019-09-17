package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class Botao {
    
    public float posX;
    
    public float posY;
    
    public float largura;
    
    public float altura;
    
    public String texto;
    
    public int formato;

    public Botao() {
    }
    
    public Botao(float posX, float posY, float largura, float altura, String texto, int formato) {
        this.posX = posX;
        this.posY = posY;
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
        this.formato = formato;
    }
}
