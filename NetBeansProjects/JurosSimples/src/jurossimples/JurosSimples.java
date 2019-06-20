
package jurossimples;

import java.util.Scanner;

public class JurosSimples {

    public static void main(String[] args) {
          Scanner leia = new Scanner(System.in);

        double capital;
        double juros;
        double periodoAnalisado ;
        double montante;
        double porcentagem = 0;
        String aux = "";

        while (true) {
            System.out.println("JUROS SIMPLES");
            System.out.println("---------------------------------------------------");
            System.out.println("m - Montante");
            System.out.println("t - Período a ser Analisado");
            System.out.println("j - Juros");
            System.out.println("c - Capital");
            System.out.println("Quanto informação você deseja saber: ");
            char opção = leia.next().charAt(0);
            System.out.println("---------------------------------------------------");
            switch (opção) {
                case 'm': //MONTANTE
                    System.out.println("Escolheu a opção para calcular o montante.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe o Valor do Juros: ");
                    juros = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    if(juros > 1){
                        porcentagem = juros / 100;
                    }else{
                        porcentagem = juros;
                    }
                    montante = capital * (1 + porcentagem * periodoAnalisado );
                    System.out.println("Montante: " + "R$" + montante);
                    break;
                case 't': //TEMPO
                    System.out.println("Escolheu a opção para calcular o tempo.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe o Valor do Juros: ");
                    juros = leia.nextDouble();
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    if(juros > 1){
                        porcentagem = juros / 100;
                    }else{
                        porcentagem = juros;
                    }
                    periodoAnalisado = ((montante - capital) / (capital * porcentagem));
                    System.out.println("Tempo necessário para investimento: " + periodoAnalisado + " Meses.");
                    break;
                case 'j':  //JUROS
                    System.out.println("Escolheu a opção para calcular a taxa de juros.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    juros = ((montante - capital) / (capital * periodoAnalisado) );
                    System.out.println("Juros de : " + juros + "%");
                    break;
                case 'c': //CAPITAL
                    System.out.println("Escolheu a opção para calcular o capital.");
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    System.out.println("Informe o Valor do Juros: ");
                    juros = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();

                    porcentagem = juros / 100;

                    capital = montante / (1 + porcentagem * periodoAnalisado );
                    System.out.println("O valor necessário de capital: " + "R$" + capital);
                    break;
            }
            System.out.println("---------------------------------------------------");
            System.out.println("Realiza outra operação: s ou n");
            aux = leia.next();
            if (aux.equals("n")) {
                break;
            }
        }

    }
    
}
