public class StepTracker {

    private MonthData[] months = new MonthData[12];
    private int targetStepNumber = 10000;

    public StepTracker() {
        for (int i = 0; i < months.length; i++) {
            months[i] = new MonthData();
        }
    }

    public void setMonthDayStepNumber(int monthNumber, int dayNumber, int stepNumber) {
        dayNumber--;
        if (monthNumber<0 || monthNumber>11 || dayNumber<0 || dayNumber>29 || stepNumber<0) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }
        months[monthNumber].setDayStepNumber(dayNumber,stepNumber);
        System.out.println("Данные успешно сохранены.");
        System.out.println();
    }

    public void setTargetStepNumber(int newTargetStepNumber){
        if (newTargetStepNumber<0){
            System.out.println("Целевое количество шагов не может быть отрицательным числом.");
            return;
        }
        targetStepNumber = newTargetStepNumber;
        System.out.println("Целевое количество шагов изменено на " +targetStepNumber);
    }
    public void monthStatistics(int monthNumber){
        if (monthNumber<0 || monthNumber>11) {
            System.out.println("Вы ввели неверное значение.");
            return;
        }
        MonthData month = months[monthNumber];
        month.statistics();
        System.out.println();
        System.out.println("Ваша текущая цель на день: "+targetStepNumber);
        System.out.println("Общее количество шагов за месяц: "+month.getAllSteps());
        System.out.println("Максимальное количество шагов за месяц: "+month.getMaxStepsFromMonth());
        System.out.println("Среднее количество шагов: "+month.getAverageSteps());
        System.out.println("Пройденно растояние (в км): "+Converter.getDistanceBySteps(month.getAllSteps()));
        System.out.println("Количество сожженных килокалорий: "+Converter.getCaloriesBySteps(month.getAllSteps()));
        System.out.println("Лучшая серия:"+ month.getBestStreak(targetStepNumber));
    }

}