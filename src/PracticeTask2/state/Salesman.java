package PracticeTask2.state;

public class Salesman {
    private Activity activity;

    public void setActivity(Activity active){
        this.activity = active;
    }

    public void nextActivity(){
        if (activity instanceof Work){
            setActivity(new Relax());
        }else if(activity instanceof Relax){
            setActivity(new Work());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
