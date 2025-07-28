package academy.devdojo.maratonajava.javacore.Bintroducaometados.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometados.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Goku");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprimirOsDados();
        System.out.println("Média " + funcionario.getMedia());
    }
}
