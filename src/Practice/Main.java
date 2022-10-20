package Practice;

import Practice.GenerateRashod.GeneralRashodMaker;
import Practice.GenerateRashod.IRashod;
import Practice.GenerateRashod.IRashodMaker;
import Practice.GenerateRashod.UltraRashodMaker;
import Practice.SerializationData.JsonAdapter;
import Practice.SerializationData.JsonSerialize;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        float[] generalCosts = {60000, 50000, 15000};
        float[] ultraCosts = {100000, 600000, 250000};

        ArrayList<Shop> shopList = new ArrayList<>();
        shopList.add(new Shop("Adal", generalCosts));
        shopList.add(new Shop("Magnum", ultraCosts));

        JsonAdapter jsonAdapter = JsonAdapter.getInstance(new JsonSerialize());
        Iterator<Shop> iterator = shopList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }

        IRashodMaker maker1 = getMakerByName("Adal");
        IRashodMaker maker2 = getMakerByName("Magnum");
        IRashod rashod1 = maker1.createRashod();
        IRashod rashod2 = maker2.createRashod();

        System.out.println("Общее количество расходов наших магазинов: ");
        System.out.println("Adal: " + rashod1.calculateRashod(generalCosts));
        System.out.println("Magnum: " + rashod2.calculateRashod(ultraCosts));

        System.out.println("Среднее количество расходов: ");
        System.out.println("Adal: " + rashod1.calculateAvgRashod(generalCosts));
        System.out.println("Magnum: " + rashod2.calculateAvgRashod(ultraCosts));
        jsonAdapter.XmlSerialization(rashod1.calculateRashod(generalCosts));
    }
    public static IRashodMaker getMakerByName(String maker){
        if(maker.equals("Adal")){
            return new GeneralRashodMaker();
        }else if(maker.equals("Magnum")){
            return new UltraRashodMaker();
        }
        throw new RuntimeException("Этого магазина нету в базе " + maker);
    }
}
