import java.util.Scanner;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class JavaMainTask {
    static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String username = scanner.nextLine();
        System.out.printf("Hello %s!", username);
    }
    static void showArgs(String[] args) {
        if (args.length == 0) System.out.println("No args passed");
        else {
            System.out.print("CMD Arguments: ");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.print(args[i] + " ");
            }
        }
    }
    static void showRandoms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count of numbers: ");
        int count = scanner.nextInt();
        String noNewLined = "";
        String newLined = "";
        for (int i = 0; i <= count; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(100, 500 + 1);
            noNewLined += randomNum;
            newLined += randomNum + "\n";
        }
        System.out.println(noNewLined);
        System.out.println(newLined);
    }
    static void argCalc(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            double argVal = Double.parseDouble(args[i]);
            sum += argVal;
        }
        System.out.println("Summ of args = " + sum);
    }
    static void int2Month() {
        HashMap < Integer, String > monthsMap = new HashMap < Integer, String > ();
        String[] monthsList = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        for (int i = 0; i <= 11; i++) {
            monthsMap.put(i + 1, monthsList[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month number: ");
        int monthInt = scanner.nextInt();
        String month = monthsMap.get(monthInt) != null ? monthsMap.get(monthInt) : "No such month";
        System.out.println(month);
    }
    public static void main(String[] args) {
        System.out.println("TASK 1: ");
        greeting();
        System.out.println("TASK 2: ");
        showArgs(args);
        System.out.println("TASK 3: ");
        showRandoms();
        System.out.println("TASK 4: ");
        argCalc(args);
        System.out.println("TASK 5: ");
        int2Month();
    }
}