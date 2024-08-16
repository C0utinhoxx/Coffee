package Exercico;
import java.util.Scanner;

public class Cafeteria {
    // Definindo o enum com os três tamanhos de café e seus preços
    public enum CafeteriaSize {
        SMALL(2.50), 
        MEDIUM(3.50), 
        LARGE(4.50);

        private final double price;

        // Formação do enum para associar o preço ao tamanho
        CafeteriaSize(double price) {
            this.price = price;
        }

        // Dispositivo para retornar o preço do tamanho selecionado
        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para escolher um tamanho de café
        System.out.println("Escolha um tamanho de café:");
        System.out.println("SMALL, MEDIUM, LARGE");

        String escolha = scanner.nextLine().toUpperCase();
        try {
            CafeteriaSize tamanhoEscolhido = CafeteriaSize.valueOf(escolha);
            System.out.println("Você escolheu: " + tamanhoEscolhido);
            System.out.println("O preço é: $" + tamanhoEscolhido.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Tamanho inválido. Por favor, escolha um tamanho válido.");
        }

        scanner.close();
    }
}
