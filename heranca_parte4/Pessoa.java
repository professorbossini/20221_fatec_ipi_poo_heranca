package heranca_parte4;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade){
        super();
        this.nome = nome;
        this.idade = idade;
        System.out.println ("Construindo pessoa...");
    }

    public String toString(){
        return String.format(
            "Nome: %s",
            nome,
            idade
        );
    }
}
