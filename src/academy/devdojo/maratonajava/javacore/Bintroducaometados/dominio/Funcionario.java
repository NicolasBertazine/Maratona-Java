package academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMedia dos salarios: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
