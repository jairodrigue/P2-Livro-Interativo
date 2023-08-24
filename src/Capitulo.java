import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem personagem;
    private Scanner scanner;
    private int alterarEnergia;

    public Capitulo(String nome, String texto, Personagem personagem,int alterarEnergia, Scanner scanner) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = new ArrayList<>();
        this.personagem = personagem;
        this.scanner = scanner;
        this.alterarEnergia = alterarEnergia;
    }

    public void executar(HashMap<String, Capitulo> capitulos) {
        mostrar();
        if(escolhas.isEmpty()){
            return;
        }
        String proximoCapitulo = escolher();
        capitulos.get(proximoCapitulo).executar(capitulos);

    }

    public static void tituloDecorado(String titulo) {
        int tituloLength = titulo.length();
        String decorator = new String(new char[tituloLength + 34]).replace('\0', '*');
    
        System.out.println(decorator);
        System.out.println("***********     " + titulo + "      ************");
        System.out.println(decorator);
    }
    private void mostrar() {
        
        this.personagem.energiaMudar(this.alterarEnergia);
        if (personagem.getEnergia()<0){
        System.out.println("Você perdeu muita energia e por isso morreu!\r\nTHE END...");
        System.exit(0);
        }
        tituloDecorado(nome);;
        System.out.println(texto);
        System.out.println("\n");
        System.out.println("(ENERGIA ATUAL: " + personagem.getEnergia() + " XPS)");
       try{
        int validarTamanhoArray = (this.escolhas.size()-1);
        if (validarTamanhoArray!=0){
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
    public void adicionarEscolha(Escolha escolha) {
        escolhas.add(escolha);
    }

    public String escolher() {
        int resposta = 0;
        boolean escolhaValida = false;
        
        do{
            System.out.print("Digite sua escolha: ");
            String input = scanner.nextLine();
    
            for (int i = 0; i < escolhas.size(); i++) {
                Escolha escolha = escolhas.get(i);
                if (escolha != null && compareStrings(escolha.getTexto(), input)) {
                    resposta = i + 1;
                    escolhaValida = true;
                    break;
                }
            }
            if (!escolhaValida) {
                System.out.println("Escolha inválida. Digite uma opção válida.");
            }
        }while (!escolhaValida);
         
        String proxEscolha = escolhas.get(resposta - 1).getProximo();
        return proxEscolha;

    }
    public static boolean compareStrings(String str1, String str2) {
        String normalizedStr1 = normalizeString(str1);
        String normalizedStr2 = normalizeString(str2);

        int maxLength = Math.max(normalizedStr1.length(), normalizedStr2.length());
        int maxErrors = (int) Math.ceil(maxLength * 0.2);

        int errors = levenshteinDistance(normalizedStr1, normalizedStr2);
        return errors <= maxErrors;
    }

    public static String normalizeString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        normalized = normalized.replaceAll("[^\\p{ASCII}]", "");
        return normalized.toLowerCase();
    }

    public static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    int cost = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}