package exam1;

import java.util.Scanner;

public class FinancialCalculator {
    static int[] Expenses = new int[30];
    static int ExpensesDay;
    static int Day;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Меню:\n" +
                        "1 - Ввести расходы за определенный день\n" +
                        "2 - Траты за месяц\n" +
                        "3 - Самая большая сумма расхода за месяц\n" +
                        "4 - Конвертер валют\n"+
                        "0 – Выход");
        System.out.print("Введите номер пункта меню: ");
        int Choice = scanner.nextInt();

        switch (Choice){
            case 1:
                Function1();
                break;
            case 2:
                Function2();
                break;
            case 3:
                Function3();
                break;
            case 4:
                Converter();

            case 0:
                System.out.println("Выход из программы...");
                System.exit(0);
                break;
        }
    }

    public static void enterExpenses() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день (от 1 до 30)");
        Day = scanner.nextInt();

        if (Day < 1 || Day > 30) {
            System.out.println("Неверный день. Пожалуйста, введите число от 1 до 30.");
            enterExpenses();
            return;
        }

        if (Expenses[Day - 1] > 0) {
            System.out.println("Сумма уже указана\n" +
                    "1. Перезаписать сумму\n" +
                    "2. Оставить предыдущую");
            System.out.print("Введите номер пункта:");
            int Choice = scanner.nextInt();
            switch (Choice){
                case 1:
                    setExpenses();
                case 2:
                    Function1();
            }
        } else {
            setExpenses();
        }
    }

    public static void setExpenses(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите траты");
        int expensesDay = scanner.nextInt();
        Expenses[Day - 1] = expensesDay;
        System.out.println("1. Ввести трату за другой день");
        System.out.println("2. Вернуться в меню");
        System.out.print("Введите номер пункта:");
        int Choice = scanner.nextInt();
        switch (Choice) {
            case 1:
                enterExpenses();
            case 2:
                main(new String[]{});
        }
    }

    public static void Function1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ввести трату за день");
        System.out.println("2. Вернуться в меню");
        System.out.print("Введите номер пункта:");
        int Choice = scanner.nextInt();

        switch (Choice){
            case 1:
                enterExpenses();
                break;
            case 2:
                main(new String[]{});
                break;
        }
    }

    public static void Function2(){
        for (int i = 1; i < 31; i++){
            System.out.println(i + " День - " + Expenses[i-1]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ввести траты за месяц");
        System.out.println("2. Вернуться в меню");
        System.out.print("Введите номер пункта:");
        int Choice = scanner.nextInt();
        switch (Choice){
            case 1:
                Function2();
                break;
            case 2:
                main(new String[]{});
                break;
        }
    }

    public static void Function3(){
        int maxIndex = 0;
        int maxExpense = Expenses[0];

        for (int i = 1; i < Expenses.length; i++) {
            if (Expenses[i] > maxExpense) {
                maxIndex = i;
                maxExpense = Expenses[i];
            }
        }
        System.out.println("Максимальная расход за месяц: " + maxExpense + " в день " + (maxIndex + 1));
    }
    public static void Converter(){
//        for (int i = 1; i < 31; i++){
//            System.out.println(i + " День - " + (Expenses[i-1] / 98.64));
//
//        }
        double sum = 0;
        for (double num : Expenses) {
            sum += num;
        }
        double total = sum;
        double Euro = (sum / 98.64);
        double USD = (sum / 90.66);
        double CNY = (sum / 12.6);
        System.out.println("Сумма всех затрат: " + total + " В евро = " + Euro + " В долларах = " + USD + " В Юанях = " + CNY);
    }
}