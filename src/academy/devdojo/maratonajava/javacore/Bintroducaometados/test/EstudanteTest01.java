package academy.devdojo.maratonajava.javacore.Bintroducaometados.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Leni";
        estudante01.idade = 50;
        estudante01.sexo = 'F';

        estudante02.nome = "Pamela";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        impressora.imprimi(estudante01);

        impressora.imprimi(estudante02);
    }
}
