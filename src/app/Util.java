package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
    public static int lerInt(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Entrada inválida. Digite um número inteiro.");
            return -1;
        }
    }

    public static double lerDouble(Scanner scanner) {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Entrada inválida. Digite um número válido.");
            return -1;
        }
    }
}
