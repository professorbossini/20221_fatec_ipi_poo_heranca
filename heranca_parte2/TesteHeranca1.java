package heranca_parte2;

public class TesteHeranca1 {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno;
        aluno = new AlunoDeGraduacao();

        aluno.nome = "Ana";

        System.out.println("Nome: " + aluno.nome);
    }
}
