import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    protected ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private int alterarEnergia;
    private Scanner escaneador;

     public Capitulo(String nome,
            String texto,
            Personagem personagem,
            int alterarEnergia,
            Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<Escolha>();
        this.personagem = personagem;
        this.alterarEnergia = alterarEnergia;
        this.escaneador = escaneador;
            }

         protected Capitulo() {
        this.texto = "";
        this.escolhas = new ArrayList<Escolha>();
              }

    public void adicionarEscolha(Escolha escolha) {
        escolhas.add(escolha);
      }
    
    private void mostrar() {
        this.personagem.energiaMudar(this.alterarEnergia);
        if (personagem.getEnergia()<0){
        System.out.println("Você perdeu muita energia e por isso morreu!\r\nTHE END...");
        System.exit(0);
        }
        System.out.println(nome);
        System.out.println(texto);
        System.out.println("\n");
        System.out.println("(ENERGIA ATUAL: " + personagem.getEnergia() + " XPS)");
       try{
        int validarTamanhoArray = (this.escolhas.size()-1);
        if (validarTamanhoArray !=2){
        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + "- " + escolhas.get(i).getTexto());
        }
        
        }
        else {
            System.exit(0);
        }
    } catch (NullPointerException e) {

    } 
   
        }
    private String escolher() {
        int escolha;
        do {
            System.out.print("(Digite o número da escolha): ");
            String input = escaneador.nextLine();

            try {
                escolha = Integer.parseInt(input) - 1;
                if (escolha >= 0 && escolha < escolhas.size()) {
                    String escolhaS = escolha + "";
                    return escolhaS;
                } else {
                    System.out.println("\nEscolha inválida! Digite novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEntrada inválida! Digite novamente.");
            }
        } while (true);
    }

    public void executar(HashMap<String, Capitulo> capitulos){
        mostrar();

        String capProx = escolher();
        capitulos.get(capProx).executar(capitulos);
        
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public ArrayList<Escolha> getEscolhas() {
        return escolhas;
    }
    public void setEscolhas(ArrayList<Escolha> escolhas) {
        this.escolhas = escolhas;
    }
    public Personagem getPersonagem() {
        return personagem;
    }
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

}