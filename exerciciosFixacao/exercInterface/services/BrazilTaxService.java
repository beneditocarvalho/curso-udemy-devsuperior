package cursoUdemyNelio.exerciciosFixacao.exercInterface.services;

public class BrazilTaxService implements TaxService {

    @Override
    public double tax(double amount) {
        if (amount <= 100) {
            return amount * 0.2;
        }
        return amount * 0.15;
    }

}