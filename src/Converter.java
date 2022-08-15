public class Converter {
    private Converter(){
    }

    public static double getDistanceBySteps(int steps){
        return steps*0.075;
    }
    public static double getCaloriesBySteps(int steps){
        return steps*0.05;
    }
}
