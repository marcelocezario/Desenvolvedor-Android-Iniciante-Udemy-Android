import java.util.Scanner;

public class InformacoesUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");

        scanner.nextLine();

        // Tipos não primitivos (orientados a objeto)
        Double doubleValor = scanner.nextDouble();
        Float floatValor = scanner.nextFloat();
        Long longValor = scanner.nextLong();
        Integer intValor = scanner.nextInt();
        Byte byteValor = scanner.nextByte();
        Boolean bool = scanner.nextBoolean();
        String strValor = scanner.nextLine();

        /*
        * Tipos primitivos
        * Double    - double
        * Float     - float
        * Long      - long
        * Integer   - int
        * Short     - short
        * Byte      - byte
        * Boolean   - boolean
        * Character - char
        * */



    }
}
