package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo o arquivo");
            throw new RuntimeException();
//            System.out.println("Escrevendo dados no arquivo");
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liderado pelo SO");
        }
    }
}
