package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Nícolas"; //String constant pool
        String nome2 = "Nícolas";

        nome.concat("Suane");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Nícolas"); // 1 variavel de referência, 2 objetos do tipo String, 3 uma string no pool de String
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
