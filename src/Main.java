import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instanciando os personagens
        Personagem leitor = new Personagem("inicial", 1000);
        Personagem sem = new Personagem("referente não existir no ataque", 0);
        Personagem troll = new Personagem("Troll das Sombras", -970);
        Personagem dragao20C = new Personagem("Dragão de 20 Cabeças", 200);
        Personagem fada = new Personagem("Fada Vermelha", -950);
        Personagem mostroP = new Personagem("Mostro do Pântano", 590);
        Personagem montanha = new Personagem("você ter seguido pelas Montanhas da Perdição", 150);
        Personagem floresta = new Personagem("você ter seguido pela Floresta Proibida", 200);

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

        String capituloRetorno = ("Você se depara com uma máquina do tempo e você pode entrar nela,\n"
                + "mas fique ciente que essa máquina pode te levar para o passado ou para o futuro.\n"
                + "\n"
                + "Iae, você topa essa aventura?");

        String final1 = ("Você encontra um cachorro que te mata retirando todos os seus orgãos para fora.\n"
                + "Sendo assim você morre desesperadamente e não cumpre sua missão.\nTHE END...");

        String final2 = ("Ops! Péssima escolha, você acaba de perder a batalha, porém continua bem\n"
                + "mas infelismente não vai poder voltar para casa, pois quando chegar sua família\n"
                + "já estará morta.\nTHE END...");

        String final3 = ("Você recusou o pedido da fada que era uma entidade satânica, bom trabalho.\n"
                + "Ao recusar esse pedido, foi lhe concedido por um bruxo que passava no local a\n"
                + "lendária Pedra Encantada. E agora você cumpiu sua missãao. Parabéns\nTHE END...");

        String final4 = ("Na tentativa de lutar com o mostro você descobre que ele na verdade é \n"
                + "é um gato que realisa desejos vestido de papai noel em cima de uma pedra, então ao fim de sua\n"
                + "transformação, você pede para obter a lendária Pedra Encantada, ele concede esse desejo\n"
                + "portanto, agora você cumpiu sua missão e a pode voltar para casa e salvar sua família.\n"
                + "Parabéns\nTHE END...");

        Scanner scan = new Scanner(System.in);


        // Instanciando os capítulos
        Capitulo cap1 = new Capitulo("Capítulo 1", capitulo1,
                leitor, sem, scan);

        Capitulo cap2 = new Capitulo("Capítulo 2", capitulo2,
                leitor, floresta, scan);

        Capitulo cap3 = new Capitulo("Capítulo 3", capitulo3,
                leitor, montanha, scan);

        Capitulo cap4 = new Capitulo("Capítulo 4", capitulo4,
                leitor, troll, scan);

        Capitulo cap5 = new Capitulo("Capítulo 5", capitulo5,
                leitor, dragao20C, scan);

        Capitulo cap6 = new Capitulo("Capítulo 6", capitulo6,
                leitor, fada, scan);

        Capitulo cap7 = new Capitulo("Capítulo 7", capitulo7,
                leitor, mostroP, scan);
        
        Capitulo capRetorno = new Capitulo("Capítulo RETORNO", capituloRetorno,
                 leitor, mostroP, scan);

        Capitulo fim1 = new Capitulo("FINAL:", final1,
                 leitor, sem, scan);

        Capitulo fim2 = new Capitulo("FINAL:", final2,
                 leitor, sem, scan);

        Capitulo fim3 = new Capitulo("FINAL:", final3,
                 leitor, sem, scan);

        Capitulo fim4 = new Capitulo("FINAL:", final4,
                 leitor, sem, scan);


        //Inserindo as escolhas no capítulo
        cap1.escolhas = new Escolha[]{ new Escolha("Atravessar a densa Floresta Proibida.", cap2),
        new Escolha("Seguir a trilha das Montanhas da Perdição.", cap3)};

        cap2.escolhas = new Escolha[]{new Escolha("Corre o máximo que puder.", cap7),
        new Escolha("Luta com o dragão, mesmo sabendo que pode ou não perder suas energias.", cap5)};

        cap3.escolhas = new Escolha[]{new Escolha ("Tomar a poção.",cap6),
        new Escolha("Recusar e agradecer o mago.", capRetorno)};

        cap4.escolhas = new Escolha[]{new Escolha("Lutar contra Grunthor, usando todas as suas habilidades de combate.",cap7),
        new Escolha("Tentar escapar furtivamente, desviando-se silenciosamente e continuando", fim2)};

        cap5.escolhas = new Escolha[]{new Escolha("Matar o feroz dragão.", fim2 ),
        new Escolha("Correr da situação", fim1)};

        cap6.escolhas = new Escolha[]{new Escolha("Recusar proposta da fada e expulsar ela.", fim3), 
        new Escolha("Não se arriscar", cap4)};

        cap7.escolhas = new Escolha[]{new Escolha("Lutar contra esse mostro e ter a possibilidade e "
        +"melhorar suas energias.",fim1), new Escolha("Não se arriscar.", fim4 )};

        capRetorno.escolhas = new Escolha[]{new Escolha("Entrar na máquina do tempo.", cap1),
        new Escolha("Optar por não entrar.", fim4)};

        fim1.escolhas = new Escolha[]{null,null,null};
        fim2.escolhas = new Escolha[]{null,null,null};
        fim3.escolhas = new Escolha[]{null,null,null};
        fim4.escolhas = new Escolha[]{null,null,null};

        Capitulo raiz = cap1;
        System.out.println(introducao);
        raiz.executar();
}
}