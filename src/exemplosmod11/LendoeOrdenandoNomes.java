package exemplosmod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

	public class LendoeOrdenandoNomes{
	   

		
		

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite nomes separados por virgula");
		String entrada = sc.nextLine();
		
		// Criando lista a partir da entrada
		List<String> nomes = new ArrayList<>();
		for(String nome : entrada.split(",")) {nomes.add(nome.trim());
		}
		//Ordenando a lista
		Collections.sort(nomes);
		System.out.println("\nNomes em ordem alfabetica:");
		for(String nome : nomes) {System.out.println(nome);
			}
		sc.close();
		}
	}