package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Nícolas";
        String endereco = "Rua Ivai N106";
        double salario = 2000.00;
        String dataRecebimentoSalario = "07/07/2025" ;
        //String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de R$" + salario + ", na data " + dataRecebimentoSalario + ".";
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de R$" + salario + ", na data " + dataRecebimentoSalario + ".");
    }
}
