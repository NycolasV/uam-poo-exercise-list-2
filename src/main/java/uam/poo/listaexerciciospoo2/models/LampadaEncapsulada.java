package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class LampadaEncapsulada {
    private float preco;
    
    private boolean estaAcessa;

    public LampadaEncapsulada() {
    }

    public LampadaEncapsulada(float preco, boolean estaAcessa) {
        this.preco = preco;
        this.estaAcessa = estaAcessa;
    }
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if(preco < 0){
            return;
        }
        
        this.preco = preco;
    }

    public boolean isAcessa() {
        return estaAcessa;
    }

    public void setEstaAcessa(boolean estaAcessa) {
        this.estaAcessa = estaAcessa;
    }
}
