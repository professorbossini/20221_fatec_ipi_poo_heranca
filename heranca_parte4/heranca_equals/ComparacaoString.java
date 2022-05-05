package heranca_parte4.heranca_equals;

import javax.swing.JOptionPane;

public class ComparacaoString {
    public static void main(String[] args) {
        //não compare strings com ==
        String s1 = "abc";

        String s2 = "abc";

        String s3 = JOptionPane.showInputDialog("Digite uma string");

        if (s1.equals(s3)){
            System.out.println ("Sim, são iguais");
        }
        else{
            System.out.println ("Não, não são iguais");
        }


        // if (s1 == s2){
        //     System.out.println ("Sim, são iguais");
        // }
        // else{
        //     System.out.println("Não, não são iguais");
        // }
    }
}
