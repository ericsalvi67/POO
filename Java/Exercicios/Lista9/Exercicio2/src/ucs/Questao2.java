package ucs;

import java.util.Scanner;

public class Questao2 {

    static class ZeroDivisorException extends Exception {
        public ZeroDivisorException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Eu sei dividir!");

        while (true) {
            try {
                x = insereValor(teclado, false);
                break;
            } catch (Exception e) {
                System.out.println("Erro: Você deve digitar um número inteiro.");
                teclado.nextLine();
            }
        }

        while (true) {
            try {
                y = insereValor(teclado, true);
                break;
            } catch (ZeroDivisorException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Você deve digitar um número inteiro.");
                teclado.nextLine(); // limpa o buffer
            }
        }

        double r = (double) x / y;
        System.out.println("O resultado da divisão é " + r);
    }

    public static int insereValor(Scanner sc, boolean naoPodeSerZero) throws ZeroDivisorException {
        System.out.print("Informe o valor: ");
        int valor = sc.nextInt();

        if (naoPodeSerZero && valor == 0) {
            throw new ZeroDivisorException("Divisão por zero não é permitida.");
        }

        return valor;
    }
}
