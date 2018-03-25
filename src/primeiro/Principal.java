package primeiro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome = "";
		int idade = 0;
		String op = "";
		Scanner ler = new Scanner(System.in);

		while (op != "0") {
			System.out.println("\n--- Sistema de Panificadora ---");
			System.out.println("1- Cadastrar pessoa");
			System.out.println("2- Mostrar pessoa");
			System.out.println("3- Atualizar pessoa");
			System.out.println("4- Excluir pessoa");
			System.out.println("0- Sair");
			op = ler.next();

			switch (op) {
			case "1":
				//Create.Salvar(nome);
				break;

			case "2":
				//Read.Mostrar(nome);
				break;

			case "3":
				//Update.Atualizar(nome);
				break;

			case "4":
				//Delete.Excluir(nome);
				break;

			case "0":
				System.exit(0);
				break;

			default:
				System.out.println("opção inválida, tente novamente");
				break;

			}
		}
	}
}
