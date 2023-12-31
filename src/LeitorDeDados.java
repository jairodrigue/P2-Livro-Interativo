import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorDeDados {
    

    HashMap <String, Personagem> lendoPersonagens (String caminhoDoArquivo) {
        File arquivoPersonagens = new File(caminhoDoArquivo);
        HashMap <String, Personagem> personagens = new HashMap<String, Personagem>();

        try {
             Scanner scanArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");
            
            String nomePersonagem = "";
            int energiaPersonagem = 0;

            String linha = "";
            while (!linha.equalsIgnoreCase("PERSONAGEM")) {
                linha = scanArquivoPersonagens.nextLine();
            }
            linha = scanArquivoPersonagens.nextLine(); //nome
            nomePersonagem = scanArquivoPersonagens.nextLine();
            linha = scanArquivoPersonagens.nextLine(); //energia
            energiaPersonagem = Integer.parseInt(scanArquivoPersonagens.nextLine());
            personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));
        

            scanArquivoPersonagens.close();
        } 
        catch (FileNotFoundException e) {

            e.printStackTrace();
        }
         return personagens;
    }
        public HashMap <String, Capitulo> lendoCapitulos (String caminhoDoArquivoCapitulo,
        HashMap<String, Personagem> personagens,
        Scanner scanCapitulo) {
        HashMap <String, Capitulo> capitulos = new HashMap<String, Capitulo>();
        File arquivoCapitulos = new File(caminhoDoArquivoCapitulo);

        try {

            Scanner scanArquivoCapitulos = new Scanner(arquivoCapitulos, "UTF-8");

            
            String nomeCapitulo = "";
            String textoCapitulo = "";
            String nomePersonagem = "";
            int mudancaDeEnergia = 0;
            String linha = "";


            while (scanArquivoCapitulos.hasNextLine()) {
                linha = scanArquivoCapitulos.nextLine();
                if (!linha.equals("CAPITULO") && !linha.equals("ESCOLHA") && 
                !linha.equals("CAPITULO_COM_IMAGEM")) {
                    continue;
                }
                if (linha.equalsIgnoreCase("CAPITULO_COM_IMAGEM")){
                CapituloImagem capitulo = new CapituloImagem(personagens, scanCapitulo, capitulos, scanArquivoCapitulos);
                capitulos.put(capitulo.getNome(), capitulo);
            }
            else if (linha.equalsIgnoreCase("CAPITULO")){
                Capitulo capitulo = new Capitulo(personagens,scanCapitulo ,capitulos, scanArquivoCapitulos);
            capitulos.put(capitulo.getNome(), capitulo);
                 
            } else if (linha.equalsIgnoreCase("ESCOLHA")){
            lerEscolha(capitulos, scanArquivoCapitulos);
            
            }
        }
    }
        catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        return capitulos;
    

    }
        private void lerEscolha(HashMap<String, Capitulo> capitulos, Scanner scanArquivoCapitulos) {
            String capituloOrigem = scanArquivoCapitulos.nextLine();
            String textoEscolha = scanArquivoCapitulos.nextLine();
            String capituloDestino = scanArquivoCapitulos.nextLine();
            String textoEscolha2 = scanArquivoCapitulos.nextLine();
            String capituloDestino2 = scanArquivoCapitulos.nextLine();
            
            Escolha escolha1 = new Escolha(textoEscolha, capituloDestino);
            Escolha escolha2 = new Escolha(textoEscolha2, capituloDestino2);
            
            capitulos.get(capituloOrigem).adicionarEscolha(escolha1);
            capitulos.get(capituloOrigem).adicionarEscolha(escolha2);
        }
       
}