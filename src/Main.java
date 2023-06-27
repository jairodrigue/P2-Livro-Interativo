import java.util.Scanner;

public class Main {

    Personagem leitor = new Personagem("inicial", 1000);
    Personagem dragaoAlce = new Personagem("Dragão dos Alces", 200);
    Personagem mago = new Personagem("Mago", -800);
    Personagem troll = new Personagem("Troll das Sombras", -970);
    Personagem dragao20C = new Personagem("Dragão de 20 Cabeças", 200);
    Personagem fada = new Personagem("Fada Vermelha", -950);
    Personagem mostroP = new Personagem("Mostro do Pântano", 590);

    public static void main(String[] args) {
        Main livroI = new Main();
        livroI.iniciarLivro();
        livroI.finais();
        livroI.movimentacoes();
        System.exit(0);

    }

    public void iniciarLivro() {

        Livro livro = new Livro();

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        leitor.nome = scan.nextLine();

        print(livro.introducao);
        String opcaoDoUsuario;

        boolean escolhaValida = true;
        while (escolhaValida) {

            opcaoDoUsuario = scan.nextLine();

            if (loop(opcaoDoUsuario, "a) atravessar a densa floresta proibida.", "a", "a)")) {

                leitor.addEnergia(200);

                print("((Você conseguiu mais energia, totalizando " + (leitor.energia) + " XP))");
                print(livro.florestaP);
                String correrOuLutar = scan.nextLine();

                if (loop(correrOuLutar, "a) Corre o máximo que puder.", "a)", "a")) {
                    leitor.addEnergia(-50);
                    print("((Você perde energia, ficando com " + (leitor.energia) + " XP))");
                    historia();
                } else if (loop(correrOuLutar,
                        "b) Luta com o dragão, mesmo sabendo que pode ou não perder suas energias.", "b", "b)"))
                    ;
                leitor.addEnergia(dragaoAlce.energia);
                print("((Você ganha mais energia, ficando com " + (leitor.energia) + " XP))");
                historia();
                break;
            } else if (loop(opcaoDoUsuario, "b) Seguir a trilha das Montanhas da Perdição.", "b", "b)")) {
                leitor.addEnergia(100);
                print("((Você conseguiu mais energia, totalizando " + (leitor.energia) + " XP))");
                print(livro.montanhaP);
                String aPocao = scan.nextLine();

                if (loop(aPocao, "a) Tomar a poção.", "a)", "a")) {
                    leitor.addEnergia(mago.energia);
                    print("((A poção tira sua energia ficando com " + (leitor.energia) + " XP))");
                    historia();
                } else if (loop(aPocao, "b) Recusar e agradecer o mago.", "b", "b)")) {
                    leitor.addEnergia(300);
                    print("((Você se livra da poção e fica com " + (leitor.energia) + " XP))");
                    historia();
                }
            } else {
                System.err.println("Entrada inválida!");
                print("Tente novamente\n");
                print(livro.menu());
                escolhaValida = true;
            }
        }
        scan.close();
    }

    public void historia() {
        Scanner scan = new Scanner(System.in);
        Livro livro = new Livro();

        print(livro.troll);
        String troll1 = scan.nextLine();
        boolean validacao = true;
        while (validacao) {

            if (loop(troll1, "a) Lutar contra Grunthor, usando todas as suas habilidades de combate.", "a)", "a")) {
                leitor.addEnergia(troll.energia);
                print("((Você lutou, mas acabou perdendo, portanto a sua energia é " + (leitor.energia) + " XP))");
                break;
            } else if (loop(troll1,
                    "b) Tentar escapar furtivamente, desviando-se silenciosamente e continuando seu percurso.",
                    "b", "b)")) {
                leitor.addEnergia(275);
                print("((Você conseguiu escapar e ainda elevou sua energia que agora é " + (leitor.energia + 275)
                        + " XP))");
                break;
            } else {
                System.err.println("Digite novamente!");
                validacao = true;
            }
        }
        print(livro.dragao20C);
        String dragao20C1 = scan.nextLine();

        boolean validacao2 = true;
        while (validacao2) {

            if (loop(dragao20C1, "a) Matar o feroz dragão.", "a)", "a")) {
                leitor.addEnergia(dragao20C.energia);
                print("((Você conseguiu derrotar o dragão, agora tem " + leitor.energia + " XP))");
                break;
            } else if (loop(dragao20C1, "b)  Correr da situação", "b", "b)")) {
                leitor.addEnergia(-500);
                print("((Você corre do dragão, mas acaba sendo atacado e perde energias. Agora você tem "
                        + leitor.energia + " XP))");
                break;
            } else {
                System.err.println("Digite novamente!");
                validacao2 = true;
            }
        }
        print(livro.fada);
        String fada1 = scan.nextLine();
        boolean validacao3 = true;
        while (validacao3) {
            if (loop(fada1, "a) Recusar proposta da fada e expulsar ela.", "a)", "a")) {
                leitor.addEnergia(+500);
                print("((Você se livrou de uma enrascada e por isso sua pontuação é " + leitor.energia + " XP))");
                break;
            } else if (loop(fada1, "b) Aceitar a fada.", "b", "b)")) {
                leitor.addEnergia(fada.energia);
                print("((A fada é um demônio satânico e faz você perder pontos, ficando com " + leitor.energia
                        + " XP))");
                break;
            } else {
                System.err.println("Digite novamente!");
                validacao3 = true;
            }
        }
        print(livro.mostroP);
        String mostro1 = scan.nextLine();
        boolean validacao4 = true;
        while (validacao4) {

            if (loop(mostro1, "a) Lutar contra esse mostro e ter a possibilidade de melhorar suas energias.", "a)",
                    "a")) {
                leitor.addEnergia(mostroP.energia);
                print("((Você consegue derrotar o mostro e ganha energia, ficando com " + leitor.energia + " XP))");
                break;
            } else if (loop(mostro1, "b) Não se arriscar", "b", "b)")) {
                leitor.addEnergia(-700);
                print("((Na tentaviva de fugir, você é atacado, e tem sua energia de " + leitor.energia + " XP))");
                break;
            } else {
                System.err.println("Digite novamente!");
                validacao4 = true;
            }
        }
        scan.close();
    }

    public void movimentacoes() {
        Scanner scan = new Scanner(System.in);
        print("Você gostaria de ver o histórico das suas jogadas? ");
        String movi = scan.nextLine();

        if (movi.toLowerCase().equals("sim")) {

            leitor.historico();
        } else {
            System.exit(0);
        }
        scan.close();
    }

    public void finais() {

        if (leitor.energia <= 0) {
            print("\n" + leitor.nome + " morreu!\nSua pontuação final foi " + leitor.energia + " XP");
        } else if (leitor.energia > 0 && leitor.energia < 1000) {

            print("\n" + leitor.nome
                    + " está vivo!\nPorém não conseguiu a Pedra Encantada e, portanto, sua família permanece na ameaça.\n"
                    + "Sua pontuação final foi " + leitor.energia + " XP");
        } else if (leitor.energia > 1000) {
            print("\n" + leitor.nome + " Conseguiu a Pedra Encantada!\n"
                    + "Você salvou sua família\nSua pontuação final foi " + leitor.energia + " XP");
        }
    }

    public boolean loop(String parametroP, String opcaoEscrita, String n, String m) {

        boolean loop = parametroP.toLowerCase().equals(opcaoEscrita) ||
                parametroP.toLowerCase().equals(n) || parametroP.toLowerCase().equals(m);
        return loop;
    }

    public void print(String p) {
        System.out.println(p);
    }
}