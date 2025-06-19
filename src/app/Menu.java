package app;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ConversorMoeda conversor = new ConversorMoeda();

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n==== CONVERSOR DE MOEDAS ====");
            System.out.println("1) Dólar => Euro Europeu");
            System.out.println("2) Euro Europeu => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Kwanza Angolano");
            System.out.println("6) Kwanza Angolano => Dólar");
            System.out.println("7) Real brasileiro => Kwanza Angolano");
            System.out.println("8) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Util.lerInt(scanner);
            if (opcao >= 1 && opcao <= 7) {
                System.out.print("Digite o valor a converter: ");
                double valor = Util.lerDouble(scanner);
                conversor.converter(opcao, valor);
            }
        } while (opcao != 8);
        System.out.println("Programa encerrado.");
    }
}
