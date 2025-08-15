package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Nícolas Bertazine";
        nome.concat(" Bertazine");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuffer sb = new StringBuffer("Nícolas Bertazine");
        sb.append(" Bertazine").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
