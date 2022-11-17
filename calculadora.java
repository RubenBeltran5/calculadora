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
            default:
                System.out.println("No es un operador válido");
            break;
        }

        teclado.close();
    }
}
