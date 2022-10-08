package FactoryMethod;

public class Home {
    private int CountOfSpentEnergy;
    private String KindOfTarif;

    public int getCountOfSpentEnergy() {
        return CountOfSpentEnergy;
    }

    public String getKindOfTarif(){
        return KindOfTarif;
    }

    Home(int countOfSpentEnergy, String kindOfTarif){
        this.CountOfSpentEnergy = countOfSpentEnergy;
        this.KindOfTarif = kindOfTarif;
    }
}
