package uam.poo.listaexerciciospoo2.models;

/**
 * @author NycolasVieira
 */
public class EmpregadoEncapsulado {
    
    private int id;
    
    private String primeiroNome;
    
    private String sobreNome;
    
    private float salario;

    public EmpregadoEncapsulado() {
    }
    
    public EmpregadoEncapsulado(int id, String primeiroNome, String sobreNome, float salario) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            return;
        }
        
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario <= 0){
            return;
        }
        
        this.salario = salario;
    }
}
