import java.util.Scanner;

public class Capítulo {
    String nome;
    String texto;
    String[] escolhas;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capítulo(String nome,
            String texto,
            String[] escolhas,
            Personagem personagem,
            int alteracaoEnergia,
            Scanner escanerador) {

        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = escanerador;
    }

    void mostrar() {

        System.out.println("\n-");
        System.out.print("\n\n(Sua energia foi alterada com ");
        System.out.print(alteracaoEnergia);
        System.out.println(" XPS)\n");
        System.out.println(nome);
        System.out.println(texto);
        System.out.println("\n");

        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((i + 1) + "- " + escolhas[i]);
        }
    }

    public int escolher() {
        int escolha;

        do {
            System.out.print("(Digite o número da escolha): ");
            String input = escaneador.nextLine();

            try {
                escolha = Integer.parseInt(input) - 1;
                if (escolha >= 0 && escolha < escolhas.length) {
                    return escolha;
                } else {
                    System.out.println("\nEscolha inválida! Digite novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite novamente.");
            }
        } while (true);
    }
}