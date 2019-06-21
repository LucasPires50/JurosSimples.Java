package Operaçoes;

public class Formulas {

    public double montante(double capital, double periodoAnalisado, double TaxaJuros) {

        double porcentagem = 0;
        if (TaxaJuros > 1) {
            porcentagem = TaxaJuros / 100;
        } else {
            porcentagem = TaxaJuros;
        }
        double montante = capital * (1 + porcentagem * periodoAnalisado);
        return montante;
    }

    public double tempo(double montante, double capital, double TaxaJuros) {

        double porcentagem = 0;
        if (TaxaJuros > 1) {
            porcentagem = TaxaJuros / 100;
        } else {
            porcentagem = TaxaJuros;
        }
        double periodoAnalisado = ((montante - capital) / (capital * porcentagem));
        return periodoAnalisado;
    }

    public double TaxaDeJuros(double montante, double capital, double periodoAnalisado) {

        double TaxaDeJuros = ((montante - capital) / (capital * periodoAnalisado) * 100);
        return TaxaDeJuros;

    }

    public double Capital(double montante, double periodoAnalisado, double TaxaJuros) {

        double porcentagem = TaxaJuros / 100;

        double Capital = montante / (1 + porcentagem * periodoAnalisado);
        return Capital;

    }

    public double Juros(double TaxaJuros, double capital, double periodoAnalisado) {

        double porcentagem = TaxaJuros / 100;

        Double Juros = capital * porcentagem * periodoAnalisado;
        return Juros;

    }

}
