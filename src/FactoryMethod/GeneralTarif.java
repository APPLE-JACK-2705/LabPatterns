package FactoryMethod;

public class GeneralTarif implements Tarif {

    public int calculateEnergy(int CountOfSpentEnergy) {
        return CountOfSpentEnergy * 20;
    }
}
