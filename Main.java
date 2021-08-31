//Dark Knight Versão 0.1
//Lingua portuguesa 

import java.awt.Component;
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args) {
        String nome = "Player";
        int s = 0;
        int hp = 30;
        int ataque = 1;
        int defesa = 2;
        int pocao = 5;
        int bomba = 0;
        int coin = 100;
        JOptionPane.showMessageDialog(null, "                  Aperte\n                    -OK-\n              Para começar\n       0===||///////////////////////////>\n                    <0.1>\n_______________________", "Dark Knight", 1);
        JOptionPane.showMessageDialog(null, "Ola", "Dark Knight", 1);
        do {
            nome = JOptionPane.showInputDialog(null, "Me diga qual é seu nome ?", "Dark Knight", 3);
            if (nome == null) {
                System.exit(0);
            }
        } while (nome == null || nome == " " || nome == "");
        JOptionPane.showMessageDialog(null, "Bem-vindo a Vila ", "Vila", 1);
        String selecao;
        do {
            selecao = JOptionPane.showInputDialog(null, "==============X============\n= 1- Explorar\n= 2- " + nome + "\n= 3- Loja" + "\n= 4- Sair", "Menu - Vila", 3);
            if (selecao.equals("1")) {
                hp -= 10;
                ataque += 3;
                JOptionPane.showMessageDialog(null, "Lutando", "Dark Knight  hp=" + hp, 1);
            }
            else if (selecao.equals("2")) {
                do {
                    final String iventario = JOptionPane.showInputDialog(null, " HP = " + hp + "\n Ataque = " + ataque + "\n Defesa =" + defesa + "\n Poção = " + pocao + "\n Bomba = " + bomba + "\n Coin = " + coin + "\n 1) Usar poção         2) Voltar a Vila", nome, 1);
                    if (iventario.equals("1")) {
                        if (pocao > 0) {
                            hp += 10;
                            --pocao;
                            JOptionPane.showMessageDialog(null, "+ 10 de HP ", nome, 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Poção  insuficiente", nome, 1);
                        }
                    }
                    else {
                        if (!iventario.equals("2")) {
                            continue;
                        }
                        s = 25;
                    }
                } while (s != 25);
                s = 0;
            }
            else if (selecao.equals("3")) {
                do {
                    final String loja = JOptionPane.showInputDialog(null, "==============L============\n Coin = " + coin + "c" + "\n= 1) Poção de vida                   -- 5c" + "\n= 2) Espada +5 de Ataque      -- 10c " + "\n= 3) Escudo +2 de Defesa      -- 15c" + "\n= 4) Bomba de fumaça           -- 20c " + "\n= 5) Voltar a Vila", "Loja", 1);
                    if (loja.equals("1")) {
                        if (coin >= 5) {
                            ++pocao;
                            coin -= 5;
                            JOptionPane.showMessageDialog(null, "+1 po\u00e7\u00e3o \n Suas po\u00e7\u00f5es = " + pocao, "Loja", 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Coin insuficiente", "Loja", 1);
                        }
                    }
                    else if (loja.equals("2")) {
                        if (coin >= 10) {
                            ataque += 5;
                            coin -= 10;
                            JOptionPane.showMessageDialog(null, "+5 Ataque \n Seus pontos de Ataque = " + ataque, "Loja", 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Coin insuficiente", "Loja", 1);
                        }
                    }
                    else if (loja.equals("3")) {
                        if (coin >= 15) {
                            defesa += 2;
                            coin -= 15;
                            JOptionPane.showMessageDialog(null, "+2 Defesa \n Seus pontos de Defesa = " + defesa, "Loja", 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Coin insuficiente", "Loja", 1);
                        }
                    }
                    else if (loja.equals("4")) {
                        if (coin >= 20) {
                            ++bomba;
                            coin -= 20;
                            JOptionPane.showMessageDialog(null, "+1 Bomba de Fumaça \n Suas Bombas = " + bomba, "Loja", 1);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Coin insuficiente", "Loja", 1);
                        }
                    }
                    else {
                        if (!loja.equals("5")) {
                            continue;
                        }
                        s = 9;
                    }
                } while (s != 9);
                s = 0;
            }
            else {
                if (!selecao.equals("4")) {
                    continue;
                }
                hp = -1;
            }
        } while (hp > 0 || selecao == null || selecao == " " || selecao == "null" || selecao.equals(null));
        JOptionPane.showMessageDialog(null, "Fim de Jogo", "Dark Knight", 1);
        s = 0;
        s = JOptionPane.showConfirmDialog(null, "Gostaria de Jogar de novo ?");
        if (s == 0) {
            main(args);
        }
        else if (s == 1) {
            System.exit(0);
        }
        System.exit(0);
    }
}

//Lucas Fujarra