package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class Empregado {
   
    public int id;
    
    public String primeiroNome;
    
    public String sobreNome;
    
    public float salario;

    public Empregado() {
    }
    
    public Empregado(int id, String primeiroNome, String sobreNome, float salario) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }
}
