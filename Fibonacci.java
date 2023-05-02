import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int soma = 0;

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        while (soma < numero) {
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }

        if (soma == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci");
        }

        sc.close();
    }
}
