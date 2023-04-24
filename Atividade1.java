package ExerciciosQueuePILHA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade1 {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<>();

		Scanner ler = new Scanner(System.in);

		int op = 1;
		do {

			System.out.println("""
					Menu faça sua Escolha
					1 - Adicionar clientes na Fila
					2 - Listar todos clientes
					3 - Retirar cliente da fila
					0 - sair
					""");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite nome do cliente que Deseja adicionar: ");
				String adiconarCliente = ler.nextLine();
				clientes.add(adiconarCliente);
				System.out.printf("Cliente %S adicionado com sucesso!\n", adiconarCliente);
				System.out.println("Aperte Enter para voltar ao Menu");
				ler.nextLine();
				break;

			case 2:
				ler.nextLine();
				System.out.println("Lista dos cliente:" + clientes);
				System.out.println("Aperte Enter para voltar ao Menu");
				ler.nextLine();
				break;

			case 3:
				ler.nextLine();
				System.out.println("Qual Cliente deseja retirar da lista?");
				String removerCliente = ler.nextLine();

				if (clientes.contains(removerCliente)) {
					clientes.remove(removerCliente);
					System.out.printf("Cliente %S removido!\n", removerCliente);
					System.out.println("Aperte Enter para voltar ao Menu");
					ler.nextLine();
				} else {
					System.out.println("Esse Cliente não consta na lista para ser removido!");
					System.out.println("Aperte Enter para voltar ao Menu");
					ler.nextLine();
				}

			default:
				System.out.println("Programa encerrado, volte sempre!!!");
			}

		} while (op != 0);
	}
}