package academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirOsDados() {
        System.out.println("----------------");
        System.out.println("FUNCIONARIO:");
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            return;
        }

        System.out.println("Salarios: ");

        for (double salario : salarios) {
            System.out.println(salario + " ");
        }

        tirarMediaDosSalarios();
    }

    public void tirarMediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia dos salarios: " + media);
    }
}
