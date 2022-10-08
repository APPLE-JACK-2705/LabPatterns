package FactoryMethod;

public class BusinessTarif implements Tarif {
    public int calculateEnergy(int CountOfSpentEnergy) {
        return CountOfSpentEnergy * 30;
    }
}