package br.com;

import br.com.modelo.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        
        System.out.println("\nSeja bem-vindo(a) ao Banco FIAP");
        System.out.println("-----------------------------\n");

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        conta.setTitular(titular);
        
        System.out.println("Olá " + conta.getTitular()+ "!\n Seu saldo é de: " + conta.consultarSaldo());
        System.out.println("-----------------------------\n");
        
        System.out.print("Digite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("-----------------------------\n");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.consultarSaldo() + "\n");

        scanner.close();
    }
}

