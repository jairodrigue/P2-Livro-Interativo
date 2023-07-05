import java.util.Scanner;

public class Capítulo {
    String nome;
    String texto;
    String escolhaA;
    String escolhaB;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capítulo(String nome,
            String texto,
            String escolhaA,
            String escolhaB,
            Personagem personagem,
            int alteracaoEnergia,
            Scanner escanerador) {

        this.nome = nome;
        this.texto = texto;
        this.escolhaA = escolhaA;
        this.escolhaB = escolhaB;
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
        System.out.println(escolhaA);
        System.out.println(escolhaB);
        System.out.print("ESCOLHA-");
    }

    public static int escolher() {
        Scanner scan = new Scanner(System.in);
        int escolha;

        do {
            System.out.print("(Digite 1 para a escolha 1 ou 2 para a escolha 2): ");
            String input = scan.nextLine();

            try {
                escolha = Integer.parseInt(input);
                if (escolha == 1 || escolha == 2) {
                    return escolha;
                } else {
                    System.out.println("\nEscolha inválida. Digite novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida. Digite novamente.");
            }
        } while (true);
    }

}