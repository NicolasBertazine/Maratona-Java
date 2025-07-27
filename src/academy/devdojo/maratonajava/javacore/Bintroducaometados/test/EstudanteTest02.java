package academy.devdojo.maratonajava.javacore.Bintroducaometados.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Hinata";
        estudante01.idade = 50;
        estudante01.sexo = 'F';

        estudante02.nome = "Sakura";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
