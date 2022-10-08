package FactoryMethod;

public class BusinessTarifMaker implements TarifMaker {

    public Tarif createTarif() {
        return new BusinessTarif();
    }
}
