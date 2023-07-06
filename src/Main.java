import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciando os personagens
        Personagem leitor = new Personagem("inicial", 1000);
        Personagem dragaoAlce = new Personagem("Dragão dos Alces", 200);
        Personagem mago = new Personagem("Mago", -800);
        Personagem troll = new Personagem("Troll das Sombras", -970);
        Personagem dragao20C = new Personagem("Dragão de 20 Cabeças", 200);
        Personagem fada = new Personagem("Fada Vermelha", -950);
        Personagem mostroP = new Personagem("Mostro do Pântano", 590);

        // História
        String introducao = ("\nBem-vindo ao incrível mundo interativo de -O Despertar do Aventureiro:\n"
                + "Em Busca da Pedra Encantada. Prepare-se para embarcar em uma jornada\n"
                + "emocionante, repleta de mistérios e desafios, onde você será o \n"
                + "protagonista dessa incrível aventura.\n"
                + "Neste livro, você assumirá o papel de um destemido aventureiro, cuja\n"
                + "coragem e determinação serão postas à prova. Sua missão é desbravar\n"
                + "terras desconhecidas, enfrentar criaturas místicas em busca da\n"
                + "lendária Pedra Encantada. A pedra é a úninica esperança para salvar\n"
                + "sua família de uma terrível ameaça que paira sobre eles.");

        String capitulo1 = ("\nVocê acorda em sua pequena cabana, localizada em uma vila isolada. O \n"
                + "o vento sussurra sobre uma antiga profecia que paira sobre sua família.\n"
                + "Intrigado, decide investigar e descobre que uma pedra mística,\n"
                + "conhecida como a Pedra Encantada, possui o poder de salvar sua família de\n"
                + "uma terrível ameaça. Animado e decidido a enfrentar qualquer desafio, você\n"
                + "parte em uma jornada em busca dessa pedra lendária.\n"
                + "\n"
                + "Qual caminho você escolhe para começar sua busca?");

        String capitulo2 = ("Você decide aventurar-se pela Floresta Proibida, um local sombrio e\n"
                + "misterioso, cheio de criaturas perigosas e enigmas ocultos. Enquanto\n"
                + "caminha pelas trilhas sinuosas, um terrível dragão dos Alces paira bem\n"
                + "na sua frente.\n"
                + "\n"
                + "O que você faz agora?");

        String capitulo3 = ("Você opta por enfrentar os desafios das Montanhas da Perdição, um local\n"
                + "inóspito e traiçoeiro, com picos cobertos de neve e abismos profundos.\n"
                + "Enquanto escala as íngremes encostas, se depara com um mago assustador que\n"
                + "te chama e te dá uma poção.\n"
                + "\n"
                + "Você não sabe o efeito da poção. O que você faz?");

        String capitulo4 = ("Seu coração bate acelerado enquanto você segue o caminho iluminado pelo\n"
                + "sol. No entanto, ao longo do trajeto, você escuta um rugido assustador e\n"
                + "um monstro emerge dos arbustos à sua frente. O monstro é um temível Troll\n"
                + "das Sombras chamado Grunthor, um ser enorme com presas afiadas e olhos \n"
                + "faiscantes.\n"
                + "\n"
                + "O que você decide fazer?");

        String capitulo5 = ("Você segue com o seu mapa subindo pela Montanha da Sucuri. Ao chegar no topo\n"
                + "encontra um dragão de 20 cabeças.\n"
                + "\n"
                + "Assustado o que você vai fazer?");

        String capitulo6 = ("Você dorme depois de um dia agitado. Mas ao acordar percebe que não está só.\n"
                + "Existe uma fada vermelha dentro da sua mochila. Assustado você tem uma \n"
                + "conversa com ela. Até que ela oferece ficar ao seu lado e te oferecer apoio\n"
                + "durante sua jornada.\n"
                + "\n"
                + "Agora, o que você vai fazer?");

        String capitulo7 = ("Sua jornada continua, e dessa vez você quase cai dentro de um pântano. Ao\n"
                + "olhar para os lados, percebe que está em um ambiente escuro e sombrio. Surge\n"
                + "forte e imponente um mostro, ele está completamente coberto por uma gosma \n"
                + "verde e tem dentes assustadores.\n"
                + "\n"
                + "O que você vai fazer agora?");
        Scanner scan = new Scanner(System.in);

        // Instanciando os capítulos
        Capítulo cap1 = new Capítulo("Capítulo 1", capitulo1,
                new String[] { "Atravessar a densa Floresta Proibida.\n",
                        "Seguir a trilha das Montanhas da Perdição.\n" },
                leitor, leitor.energia, scan);

        Capítulo cap2 = new Capítulo("Capítulo 2", capitulo2,
                new String[] { "Corre o máximo que puder.\n",
                        "Luta com o dragão, mesmo sabendo que pode ou não perder suas energias.\n" },
                dragaoAlce, dragaoAlce.energia, scan);

        Capítulo cap3 = new Capítulo("Capítulo 3", capitulo3, new String[] { "Tomar a poção.\n",
                "Recusar e agradecer o mago.\n" },
                mago, mago.energia, scan);

        Capítulo cap4 = new Capítulo("Capítulo 4", capitulo4,
                new String[] { "Lutar contra Grunthor, usando todas as suas habilidades de combate.\n",
                        "Tentar escapar furtivamente, desviando-se silenciosamente e continuando\n"
                                + "seu percurso.\n" },
                troll, troll.energia, scan);

        Capítulo cap5 = new Capítulo("Capítulo 5", capitulo5, new String[] { "Matar o feroz dragão.\n",
                "Correr da situação\n" }, dragao20C, dragao20C.energia, scan);

        Capítulo cap6 = new Capítulo("Capítulo 6", capitulo6,
                new String[] { "Recusar proposta da fada e expulsar ela.\n",
                        "Não se arriscar\n" },
                fada, fada.energia, scan);

        Capítulo cap7 = new Capítulo("Capítulo 7", capitulo7,
                new String[] { "Lutar contra esse mostro e ter a possibilidade e melhorar suas energias.\n",
                        "Não se arriscar\n" },
                mostroP, mostroP.energia, scan);

        // Lógica da história
        System.out.println(introducao);
        cap1.mostrar();
        int c1 = cap1.escolher();

        if (c1 == 0) {
            cap2.mostrar();
            leitor.energiaMudar(dragaoAlce.energia);
            int c2 = cap2.escolher();

            if (c2 == 0) {
                cap4.mostrar();
                leitor.energiaMudar(troll.energia);
            } else if (c2 == 1) {
                cap4.mostrar();
                leitor.energiaMudar(156);
            }
        } else if (c1 == 1) {
            cap3.mostrar();
            leitor.energiaMudar(mago.energia);
            int c3 = cap3.escolher();

            if (c3 == 0) {
                cap5.mostrar();
                leitor.energiaMudar(dragao20C.energia);
                int c4 = cap5.escolher();

                if (c4 == 0 || c4 == 1) {
                    cap7.mostrar();
                    cap7.escolher();
                    leitor.energiaMudar(-180);
                } else if (c3 == 1) {
                    cap6.mostrar();
                    leitor.energiaMudar(fada.energia);
                    int c5 = cap6.escolher();

                    if (c5 == 0 || c5 == 1) {
                        cap7.mostrar();
                        cap7.escolher();
                        leitor.energiaMudar(mostroP.energia);
                    }
                }
            }
        }

        // Finais
        if (leitor.energia <= 0) {

            System.out.print("\n(Sua energia final é ");
            System.out.print(leitor.energia);
            System.out.print(" XP)\n");
            System.out.println("Com base na presença de energia negativa, você foi levado a\n"
                    + "óbito em decorrência de uma condição de fraqueza exacerbada.");
        } else if (leitor.energia > 0 && leitor.energia < 1500) {
            System.out.print("\n(Sua energia final é ");
            System.out.print(leitor.energia);
            System.out.print(" XP)\n");
            System.out.println("Embora você tenha sobrevivido, infelizmente não obteve sucesso \n"
                    + "na obtenção da Pedra Encantada.");
        } else {
            System.out.print("\n(Sua energia final é ");
            System.out.print(leitor.energia);
            System.out.print(" XP)\n");
            System.out.println("Parabéns pela conquista da Pedra Encantada!\n" +
                    "Com esse êxito, você agora pode salvar sua família.");
        }
    }
}
