package Practice.GenerateRashod;

public class GeneralRashod implements IRashod{
    @Override
    public float calculateRashod(float[] costs) {
        float sum = 0;
        for(float num : costs){
            sum = sum + num;
        }
        return sum;
    }

    @Override
    public float calculateAvgRashod(float[] costs) {
        return calculateRashod(costs)/costs.length;
    }
}
