package FactoryMethod;

public class GeneralTarifMaker implements TarifMaker{
    public Tarif createTarif() {
        return new GeneralTarif();
    }
}
