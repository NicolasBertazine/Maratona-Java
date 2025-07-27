package academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio;

public class ImpressoraEstudante {
    public void imprimi(Estudante estudante) {
        System.out.println("----------------");
        estudante.nome = "Nícolas";
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
