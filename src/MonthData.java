import java.util.Arrays;
import java.util.OptionalInt;

public class MonthData {

    private int [] daysArray = new int[30];

    public MonthData(){
        Arrays.fill(daysArray,0);
    }


    public void setDayStepNumber(int dayNumber, int stepNumber){
        daysArray[dayNumber] = stepNumber;
    }
    public int getAllSteps(){
        return Arrays.stream(daysArray).sum();
    }
    public int getMaxStepsFromMonth(){
        OptionalInt max = Arrays.stream(daysArray).max();
        return max.getAsInt();
    }
    public int getAverageSteps(){
        return Arrays.stream(daysArray).sum() / 30;
    }

    public int getBestStreak(int targetDaysNumber) {
        int streak = 0;
        int tempCounter = 0;
        for (int i = 0; i < daysArray.length; i++) {
            if (daysArray[i] >= targetDaysNumber) {
                tempCounter++;
                if (tempCounter > streak) {
                    streak = tempCounter;
                }
            } else if (daysArray[i] < targetDaysNumber) {
                tempCounter = 0;
            }
        }
        return streak;

    }
    public void statistics(){
        for (int i = 1; i <= daysArray.length; i++) {
            System.out.printf("%s день: %s, ", i, daysArray[i-1]);

        }
    }
}
