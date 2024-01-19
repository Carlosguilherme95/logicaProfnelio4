import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Preço do produto que você vai comprar:");
        Float precoProduto = Float.valueOf(scanner.nextLine());
        System.out.println("Quantos produtos você pegou?");
        Float quantidadeProduto = Float.valueOf((scanner.nextLine()));
        System.out.println("Quanto você deu em dinheiro?");
        Float quantiaEmDinheiro = Float.valueOf(scanner.nextLine());
        calculadoraDoTroco(precoProduto, quantidadeProduto, quantiaEmDinheiro);
    }

    private static void calculadoraDoTroco(Float precoProduto, Float quantidadeProduto, Float quantiaEmDinheiro) {
            Float trocoCalculado = (quantiaEmDinheiro - (precoProduto * quantidadeProduto));
            System.out.println("O seu troco é R$:" + trocoCalculado);
    }
}

/**
 * Problema "troco"
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
 * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
 * e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
 * mostrar o valor do troco a ser devolvido ao cliente
 * Preço unitário do produto: 8.00
 * Quantidade comprada: 2
 * Dinheiro recebido: 20.00
 * TROCO = 4.00
 * Preço unitário do produto: 30.00
 * Quantidade comprada: 3
 * Dinheiro recebido: 100.00
 * TROCO = 10.00
 */