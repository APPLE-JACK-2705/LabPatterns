package FactoryMethod;

public class EconomTarifMaker implements TarifMaker{

    public Tarif createTarif() {
        return new EconomTarif();
    }
}
