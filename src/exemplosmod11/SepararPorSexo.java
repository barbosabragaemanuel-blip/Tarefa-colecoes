package exemplosmod11;


import java.util.*;

public class SepararPorSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        System.out.println("Digite nome e sexo (ex: João-M, Maria-F):");
        String entrada = sc.nextLine();

        // Separa os pares
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            // Separa nome e sexo
            String[] dados = pessoa.trim().split("-");

            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            if (sexo.equalsIgnoreCase("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                grupoFeminino.add(nome);
            }
        }

        System.out.println("\n👨 Grupo Masculino:");
        System.out.println(grupoMasculino);

        System.out.println("\n👩 Grupo Feminino:");
        System.out.println(grupoFeminino);

        sc.close();
    }
}
