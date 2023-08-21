import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LeitorDeDados leitorD = new LeitorDeDados();

        HashMap<String, Personagem> personagens = leitorD.lendoPersonagens("rsc//Personagens.txt");
        personagens.get("leitor");

        HashMap<String, Capitulo> capitulos = leitorD.lendoCapitulos("rsc//Capitulo.txt", personagens, scan);
       Capitulo raiz = capitulos.get("CAPITULO 1");

        raiz.executar();
	}
}