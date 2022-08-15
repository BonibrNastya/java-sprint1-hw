import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("За какой месяц хотите ввести количество шагов: 0 - январь, 1 - февраль, 2 - март, 3 - апрель, 4 - май, 5 - июнь, 6 - июль, 7 - август, 8 - сентябрь, 9 - октябрь, 10 - ноябрь, 11 - декабрь?");
                int monthNumber = scanner.nextInt();
                System.out.println("За какой день хотите ввести количество шагов (с 1 по 30 включительно)?");
                int dayNumber = scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int stepNumber = scanner.nextInt();

                stepTracker.setMonthDayStepNumber(monthNumber, dayNumber, stepNumber);

            } else if (userInput == 2) {
                System.out.println("За какой месяц хотите ввести количество шагов: 0 - январь, 1 - февраль, 2 - март, 3 - апрель, 4 - май, 5 - июнь, 6 - июль, 7 - август, 8 - сентябрь, 9 - октябрь, 10 - ноябрь, 11 - декабрь?");
                int monthForStatistic = scanner.nextInt();
                stepTracker.monthStatistics(monthForStatistic);

            } else if (userInput == 3) {
                System.out.println("Задайте новую цель по кол-ву шагов: ");
                int newTargetSteps = scanner.nextInt();
                stepTracker.setTargetStepNumber(newTargetSteps);

            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");

    }


    public static void printMenu(){
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход");
    }
}