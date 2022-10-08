package FactoryMethod;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Home> homeList = new ArrayList<>();
        homeList.add(new Home(300,"Econom"));
        homeList.add(new Home(100,"Business"));
        homeList.add(new Home(200,"General"));
        homeList.add(new Home(350,"General"));
        homeList.add(new Home(150,"Econom"));
        homeList.add(new Home(400,"Business"));

        TarifMaker tarifMaker;
        for(Home h : homeList){
            if(h.getKindOfTarif().equals("General")){
                tarifMaker = new GeneralTarifMaker();
            }else if (h.getKindOfTarif().equals("Business")){
                tarifMaker = new BusinessTarifMaker();
            }else if(h.getKindOfTarif().equals("Econom")){
                tarifMaker = new EconomTarifMaker();
            }else {
                throw new RuntimeException("Не поддерживаемый вид трафика");
            }

            Tarif tarif = tarifMaker.createTarif();
            System.out.println(tarif.calculateEnergy(h.getCountOfSpentEnergy()));
        }
    }

//    public static TarifMaker getMakerByName(String maker) throws IOException {
//        if(maker.equals("Econom")){
//            return new EconomTarifMaker();
//        }else if (maker.equals("General")){
//            return new GeneralTarifMaker();
//        }else if(maker.equals("Business")){
//            return new BusinessTarifMaker();
//        }
//        throw new IOException("Не поддерживаемый тариф по электроэнергии: " + maker);
//    }
}