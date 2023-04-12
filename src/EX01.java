import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int y = scanner.nextInt();
        System.out.println("A soma entre " +x+ " e " +y+ " é : " + (x+y));


        scanner.close();

    }
}
