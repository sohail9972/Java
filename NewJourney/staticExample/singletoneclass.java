package NewJourney.staticExample;

public class singletoneclass {
    private singletoneclass(){

    }
    private static singletoneclass instance;
    public static singletoneclass getInstance() {
        if (instance==null){
            instance=new singletoneclass();
        }
        return instance;
    }
}
