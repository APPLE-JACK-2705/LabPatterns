package PracticeTask2.calculate;

import java.util.List;

public class Calculator {
    // Сумма расходов
    public double costSum(List<Double> costList){
        double sum = 0;
        for (double num : costList){
            sum = sum + num;
        }
        return sum;
    }

    // Среднее значение расходов
    public double costAvg(List<Double> costList){
        return costSum(costList)/costList.size();
    }
}
