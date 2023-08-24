import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CapituloImagem extends Capitulo{
    private String imagem;

    public CapituloImagem(HashMap<String, Personagem> personagens, Scanner scanCapitulo,
            HashMap<String, Capitulo> capitulos, Scanner scanArquivoCapitulos) {
                
        this.ler(personagens, scanCapitulo, capitulos, scanArquivoCapitulos);
        this.escolhas = new ArrayList<>();
    }
    @Override
    public void mostrar(){
        System.out.println();
        System.out.println(imagem);
        System.out.println();
        super.mostrar();
    }
    @Override
    protected void ler(HashMap<String, Personagem> personagens, Scanner scanCapitulo,
    HashMap<String, Capitulo> capitulos, Scanner scanArquivoCapitulos){
        
        String linha = scanArquivoCapitulos.nextLine();//imagem 
        linha = scanArquivoCapitulos.nextLine(); 
        this.imagem = linha;
        linha = scanArquivoCapitulos.nextLine();
         
        while(!linha.equals("FIM_DA_IMAGEM")){
            this.imagem = this.imagem + "\n" + linha;
            linha = scanArquivoCapitulos.nextLine();
        }
        super.ler(personagens, scanCapitulo, capitulos, scanArquivoCapitulos);
    }
}