package com.up.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.up.model.Cliente;

public class Main { //utilizando hibernate

	public static void main(String[] args) {
		
		Cliente fulano = new Cliente();
		fulano.setId(1);
		fulano.setNome("ana");
		fulano.setEmail("ana@gmail.com");
			//cria a fabrica de managers, e depois um manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("erp"); //a classe persistence representa o arquivo META-INF/persistence.xml, nesse arquivo está definindo o nome da unidade de persistencia
		EntityManager em = emf.createEntityManager();
			//salva as alteracoes na base
		em.getTransaction().begin();
		em.persist(fulano);
		em.getTransaction().commit();
			//fecha
		em.close();
		emf.close();
		
		
		
	}

	private static void Menu() {
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
				Create.Salvar(nome);
				break;

			case "2":
				Read.Mostrar(nome);
				break;

			case "3":
				Update.Atualizar(nome);
				break;

			case "4":
				Delete.Excluir(nome);
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
