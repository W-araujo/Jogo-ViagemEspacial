package br.projeto.viagemEspacial;

import br.projeto.nave.NaveEspacial;
import java.util.Random;
import java.util.Scanner;
import br.projeto.planetas.Lactus;

public class ViagemEspacial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha;

        System.out.println("Informe o nome do Personagem: ");
        String nome = in.next();

        Personagem p1 = new Personagem(nome);
        NaveEspacial n1 = new NaveEspacial();
        
        System.out.println("Você esta pronto para iniciar sua aventura '"+p1.nome+"'");

        do {
            System.out.println("---------------------------------------------");
            System.out.println("Oque deseja fazer?");
            System.out.println("");
            System.out.println("1- Ver Inventário");
            System.out.println("2- Ver Nave");
            System.out.println("3- Viajar para o planeta Lactus");
            System.out.println("99- Sair do jogo e perder o progresso");
            System.out.println("---------------------------------------------");
            escolha = in.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println(p1.toString());
                    break;
                case 2:
                    System.out.println(n1.toString());
                    break;
                case 3:
                     Lactus l1 = new Lactus("LACTUS","Grande","30 horas","10 anos","Ganimedes e Equilácio");
                    if (n1.getCombustivel() >= 10) {
                        n1.viajarPlanetaCombustivel();

                        int lactusEscolha;
                        System.out.println("");
                        System.out.println("Bem Vindo! viajante ao Planeta \n ****" + l1.getNome() + "****");
                       
                        do {
                            System.out.println("----------------------------");                        
                            System.out.println("1- Abastecer a nave");
                            System.out.println("2- Explorar o planeta");
                            System.out.println("3- Missões de saque");
                            System.out.println("4- Caracteristicas do planeta");
                            System.out.println("0- Sair do planeta");
                            System.out.println("-----------------------------");
                            lactusEscolha = in.nextInt();
                            switch (lactusEscolha) {

                                case 1:
                                    System.out.println("Deseja encher o tanque? 7 moedas de ouro");
                                    
                                    if (p1.ouro >= 7) {
                                        n1.abastecerNave();
                                        p1.ouro -= 7;
                                    } else {
                                        System.out.println("Você não possui Ouro suficiente");
                                        System.out.println("Quantia em Ouro: " + p1.ouro);
                                    }
                                    break;
                                case 2:
                                    System.out.println("Deseja explorar o planeta? 5 moedas de ouro");
                                    if (p1.ouro >= 5) {
                                        System.out.println(Lactus.exploracao());                                     
                                        p1.ouro -= 5;
                                    } else {
                                        System.out.println("Você não possui Ouro suficiente");
                                        System.out.println("Quantia em Ouro: " + p1.ouro);
                                    }
                                    break;

                                case 3:

                                    if (p1.nivel >= 1) {

                                        Random geradorDeMonstros = new Random();
                                        int contador = 0;
                                        for (int i = 0; i < 1; i++) {
                                            contador = geradorDeMonstros.nextInt(11) + 1;
                                        }
                                        if (contador > 7) {
                                            System.out.println("!!!Você foi atacado!!!!");
                                            Saqueador s1 = new Saqueador("Saqueador lvl-1", 10, 5, 1, 3);
                                            System.out.println(s1);
                                            int escolhaAtaque;

                                            do {
                                                if (s1.vida == 0) {
                                                    break;
                                                }
                                                System.out.println("-------------------");
                                                System.out.println("Faça algo rapido!!!!");
                                                System.out.println("1- Atacar");
                                                System.out.println("2- Fugir");
                                                System.out.println("-------------------");
                                                escolhaAtaque = in.nextInt();

                                                switch (escolhaAtaque) {
                                                    case 1:
                                                        int danoPersonagem;
                                                        int danoSaqueador;

                                                        danoPersonagem = p1.ataque - s1.defesa;
                                                        s1.vida -= danoPersonagem;
                                                        System.out.println("Vida restante do Saqueador: " + s1.vida);

                                                        danoSaqueador = s1.ataque - p1.defesa;
                                                        p1.vida -= danoSaqueador;
                                                        System.out.println("Sua vida restante: " + p1.vida);
                                                        if (s1.vida <= 0) {
                                                            System.out.println("Parabéns! você o derrotou");
                                                            p1.ouro += s1.ouro;
                                                            p1.experiencia += 2;
                                                            System.out.println("Ganhou: " + s1.ouro + " moedas de ouro");
                                                            System.out.println("Exp Adquirida: 2");

                                                        } else if (p1.vida <= 0) {
                                                            System.out.println("VOCÊ MORREU!");
                                                            System.exit(0);
                                                        }

                                                        break;

                                                    case 2:
                                                        System.out.println("Impossivel fugir, lute ou morra!");
                                                        break;

                                                    case 5487956:
                                                        break;
                                                    default:
                                                        System.out.println("Ainda tentando fugir? LUTEEE!");
                                                }
                                            } while (escolhaAtaque != 5487956);

                                        } else {
                                            p1.experiencia += 2;

                                            if (p1.experiencia == 10) {
                                                p1.nivel++;
                                                p1.experiencia = 0;
                                            }
                                            System.out.println("Nenhum saqueador apareceu");
                                            System.out.println("Exp Total: " + p1.experiencia);

                                            if (p1.nivel > 1 && p1.nivel < 3) {
                                                System.out.println("Você esta no nivel: " + p1.nivel);
                                            } else if (p1.nivel > 2 && p1.nivel < 4) {
                                                System.out.println("Você esta no nivel: " + p1.nivel);
                                            } else if (p1.nivel > 3 && p1.nivel < 5) {
                                                System.out.println("Você esta no nivel: " + p1.nivel);
                                            } else if (p1.nivel > 4 && p1.nivel < 6) {
                                                System.out.println("Você esta no nivel: " + p1.nivel);
                                            }

                                        }
                                    }

                                    break;
                                    
                                case 4:
                                    System.out.println(l1.toString());
                                    
                                    break;

                                case 0:
                                    break;
                                default:
                                    System.out.println("Operação inválida");

                            }

                        } while (lactusEscolha != 0);
                    } else {
                        System.out.println("Você nao possui combustível suficiente para está viagem");
                        break;
                    }

                case 99:
                    break;
                default:
                    System.out.println("Número Inválido!");
            }

        } while (escolha != 99);

    }

}
