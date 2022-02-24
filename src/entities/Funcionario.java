package entities;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Float salario;
    private Integer matricula;
    private Character sexo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
            
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public Float getSalario(){
        return salario;
    }
    
    public void setSalario(Float salario){
        this.salario = salario;
    }
    
    public Integer getMatricula(){
        return matricula;
    }
    
    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    
    public Character getSexo(){
        return sexo;
    }
    
    public void setSexo(Character sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nidade: " + idade + "\nsalario: " + salario + "\nmatricula: " + matricula + "\nsexo: " + sexo;
    }
    
    
    
}
