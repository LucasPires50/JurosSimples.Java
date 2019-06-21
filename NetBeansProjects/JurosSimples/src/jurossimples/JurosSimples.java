package jurossimples;

import Operaçoes.Formulas;
import java.util.Scanner;

public class JurosSimples {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Formulas op = new Formulas();

        double capital = 0;
        double TaxaJuros;
        double periodoAnalisado;
        double montante;
        String aux = "";

        while (true) {
            System.out.println("JUROS SIMPLES");
            System.out.println("---------------------------------------------------");
            System.out.println(" m - Montante \n t - Período a ser Analisado \n i - Taxa de Juros \n c - Capital \n j - juros");
            System.out.println("Escolha a operação: ");
            char opção = leia.next().charAt(0);
            System.out.println("---------------------------------------------------");
            switch (opção) {
                case 'm': //MONTANTE
                    System.out.println("Escolheu a opção para calcular o montante.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe a Taxa de Juros: ");
                    TaxaJuros = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    double resultado = op.montante(capital, periodoAnalisado, TaxaJuros);
                    System.out.println("Montante: " + "R$" + resultado);
                    break;
                case 't': //TEMPO
                    System.out.println("Escolheu a opção para calcular o tempo.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe a Taxa de Juros: ");
                    TaxaJuros = leia.nextDouble();
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    double resultado1 = op.tempo(montante, capital, TaxaJuros);
                    System.out.println("Tempo necessário para investimento: " + resultado1 + " Meses.");
                    break;
                case 'i':  //TAXA DE JUROS
                    System.out.println("Escolheu a opção para calcular a taxa de juros.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    double resultado2 = op.TaxaDeJuros(montante, capital, periodoAnalisado);
                    System.out.println("Taxa de Juros : " + resultado2 + "%");
                    break;
                case 'c': //CAPITAL
                    System.out.println("Escolheu a opção para calcular o Capital.");
                    System.out.println("Informe o Valor do Montante: ");
                    montante = leia.nextDouble();
                    System.out.println("Informe a Taxa de Juros: ");
                    TaxaJuros = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    double reultado3 = op.Capital(montante, periodoAnalisado, TaxaJuros);
                    System.out.println("O valor necessário de capital: " + "R$" + reultado3);
                    break;
                case 'j': //JUROS
                    System.out.println("Escolheu a opção para calcular o Juros.");
                    System.out.println("Informe o Valor do Capital: ");
                    capital = leia.nextDouble();
                    System.out.println("Informe a Taxa de Juros: ");
                    TaxaJuros = leia.nextDouble();
                    System.out.println("Informe o Valor do Período a ser Analisado em meses: ");
                    periodoAnalisado = leia.nextDouble();
                    double resultado4 = op.Juros(TaxaJuros, capital, periodoAnalisado);
                    System.out.println("Juros: " + resultado4);
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
