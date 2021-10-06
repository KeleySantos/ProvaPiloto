package modelo;

public class Piloto {

    private String nome;
    private int cpf;
    private int habilitacao;

    public Piloto(){
    }
            
    public Piloto (String nome, int cpf, int habilitacao){
        this.nome = nome;
        this.cpf = cpf;
        this.habilitacao = habilitacao;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getHabilitacao(){
        return habilitacao;
    }
    public void setHabilitacao(int habilitacao){
        this.habilitacao = habilitacao;
    }
        
    
}
