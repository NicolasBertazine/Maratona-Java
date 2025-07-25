package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como Domingo
        byte dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        /*switch (dia) {
            case 1:
                System.out.println("Domingo.");
                System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("Segunda.");
                System.out.println("É dia útil!");
                break;
            case 3:
                System.out.println("Terça.");
                System.out.println("É dia útil!");
                break;
            case 4:
                System.out.println("Quarta.");
                System.out.println("É dia útil!");
                break;
            case 5:
                System.out.println("Quinta.");
                System.out.println("É dia útil!");
                break;
            case 6:
                System.out.println("Sexta.");
                System.out.println("É dia útil!");
                break;
            case 7:
                System.out.println("Sabado.");
                System.out.println("Não é dia útil!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }*/
    }
}
