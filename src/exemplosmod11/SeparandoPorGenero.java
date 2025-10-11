package exemplosmod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparandoPorGenero {

	public static void main (String[] args ) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Digite nome e sexo separados por traço e vírgula.");
		        System.out.print("\nEntrada: ");

		        String entrada = sc.nextLine();

		        // Quebrar cada pessoa usando a vírgula
		        String[] pessoas = entrada.split(",");

		        // Listas separadas por gênero
		        List<String> masculinos = new ArrayList<>();
		        List<String> femininos = new ArrayList<>();

		        // Percorrer cada item
		        for (String pessoa : pessoas) {
		            // Quebrar em nome e sexo
		            String[] partes = pessoa.trim().split("-");

		            if (partes.length == 2) {
		                String nome = partes[0].trim();
		                String sexo = partes[1].trim().toUpperCase();

		                if (sexo.equals("N") || sexo.equals("M")) {
		                    masculinos.add(nome);
		                } else if (sexo.equals("F")) {
		                    femininos.add(nome);
		                }
		            }
		        }

		        // Exibir resultados
		        System.out.println("\n--- Grupo Masculino ---");
		        for (String nome : masculinos) {
		            System.out.println(nome);
		        }

		        System.out.println("\n--- Grupo Feminino ---");
		        for (String nome : femininos) {
		            System.out.println(nome);
		        }

		        sc.close();
		    }
	}
