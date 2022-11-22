import java.util.Scanner;

public class calculadora {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primer número > ");
        int n1 = teclado.nextInt();

        System.out.print("Segundo número > ");
        int n2 = teclado.nextInt();

        System.out.print("Operador > ");
        String operador = teclado.nextLine();

        switch (operador){
            // Resta
            case "-":
            int resultadoResta = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resultadoResta);
            break;
            // Suma
            case "+":
                int resultadoResta = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultadoResta);
                break;

            default:
                System.out.println("No es un operador válido");
            break;
        }

        teclado.close();
    }
}
