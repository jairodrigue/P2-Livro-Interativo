import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    Escolha[] escolhas;
    Personagem personagem;
    Personagem personagensArbitrarios;
    Scanner escaneador;

    public Capitulo(String nome,
            String texto,
            Personagem personagem,
            Personagem personagensArbitrarios,
            Scanner escanerador) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.personagensArbitrarios = personagensArbitrarios;
        this.escaneador = escanerador;
    }
    void mostrar() {

        System.out.println("\n-");
        System.out.print("\n\n(Sua energia foi alterada com ");
        System.out.print(this.personagensArbitrarios.energia);
        System.out.println(" XPS, devido ao personagem " + personagensArbitrarios.nome + ")\n");
        this.personagem.energiaMudar(personagensArbitrarios.energia);


        if (personagem.energia<0){
        System.out.println("Você perdeu muita energia e por isso morreu!\r\nTHE END...");
        System.exit(0);
        }
        System.out.println(nome);
        System.out.println(texto);
        System.out.println("\n");
        System.out.println("(ENERGIA ATUAL: " + personagem.energia + " XPS)");
       
        int validarTamanhoArray = (escolhas.length-1);
        if (validarTamanhoArray !=2){
        for (int i = 0; i < escolhas.length; i++) {
            System.out.println((i + 1) + "- " + escolhas[i].texto);
        }
        
        int capEscolhido = escolher();
        escolhas[capEscolhido].proximo.mostrar();
        }
        else {
            System.exit(0);
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
    void executar(){
        mostrar();
    }
    
}