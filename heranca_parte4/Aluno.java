package heranca_parte4;

public class Aluno extends Pessoa{
    
    int matricula;
    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }  


    public Aluno (int matricula){
        this(null, 0, matricula);
    }
}
