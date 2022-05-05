package heranca_parte3;

public abstract class Professor extends Pessoa{
    int matricula;

    public void lecionar(){
        System.out.println(getNome() + " lecionando...");
    }
}
