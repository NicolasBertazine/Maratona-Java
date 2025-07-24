package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //€ 0       € 34,712    9.70%
    //€ 34,713  € 68,507    37.35%
    //€ 68,508              49.50%
    public static void main(String[] args) {
        double salarioAnual = 69000;
        double primeiraFaixa = 9.7 / 100;
        double SegundaFaixa = 37.35 / 100;
        double TerceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            System.out.println("Com um salário anul de €" + salarioAnual + " você deve pagar 9.70% de imposto.");
        } else if (salarioAnual <= 68507) {
            System.out.println("Com um salário anul de €" + salarioAnual + " você deve pagar 37.35% de imposto.");
        } else {
            System.out.println("Com um salário anul de €" + salarioAnual + " você deve pagar 49.50% de imposto.");
        }
    }
}
