package FactoryMethod;

public class EconomTarif implements Tarif {

    public int calculateEnergy(int CountOfSpentEnergy) {
        return CountOfSpentEnergy * 10;
    }
}
