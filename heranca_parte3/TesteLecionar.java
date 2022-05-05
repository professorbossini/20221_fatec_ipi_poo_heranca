package heranca_parte3;
public class TesteLecionar {

    public static void main(String[] args) {
        //todas são abstratas e, por isso, não podem ser instanciadas
        // Pessoa p = new Pessoa();
        // Professor prof = new Professor();
        // Aluno a = new Aluno();

        ProfessorHorista horista = new ProfessorHorista();
        horista.setNome("Pedro");

        horista.lecionar();

        ProfessorPesquisador pesquisador = new ProfessorPesquisador();

        pesquisador.setNome("João");

        pesquisador.lecionar();

    }
    
}
