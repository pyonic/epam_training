import java.lang.Math;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Basics of software code development
    // Aliyev Murodil
    static void findZ(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.println("Z = " + z);
    };
    static void secondTask(double a, double b, double c) {
        double D = Math.pow(( b * b + 4 * a * c ),0.5);
        double calc = Math.floor(((b + D)/2*a)-Math.pow(a,3)*c+1/b*b);
        System.out.println("Second task: "+calc);
    };
    static void thirdTask(double x, double y) {
        double calc = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("Third task: "+calc);
    };
    static void reverseDouble(double x) {
        int intPart = (int) x;
        int afterPoint = (int) ((x  - intPart) * 1000);
        double reversed = afterPoint + (double) intPart / 1000;
        System.out.println(reversed);
    };
    static void getTimestamp(int Seconds) {
        Integer minutes = (Seconds/60) % 60;
        Integer seconds = Seconds % 60;
        Integer hours = Seconds / 3600;
        String HH = hours >= 10 ? hours.toString() : "0"+hours;
        String MM = minutes >= 10 ? minutes.toString() : "0"+minutes;
        String SS = seconds >= 10 ? seconds.toString() : "0"+seconds;
        System.out.printf("%sh %smin %ss", HH , MM , SS);
    };
    static void checkCoordinates (double x, double y) {
        int FIRST_Y_MAX = 4, FIRST_X_MAX = 4;
        int SECOND_Y_MAX = 3, SECOND_X_MAX = 6;
        if ((x > -1 * FIRST_X_MAX & x < FIRST_X_MAX) & (y < FIRST_Y_MAX & y > -1 * FIRST_Y_MAX) | (x > -1 * SECOND_X_MAX & x < SECOND_X_MAX) & (y < 0 & y > SECOND_Y_MAX)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    };
    static void triangleExist(double angle1, double angle2) {
        if ((angle1 + angle2 < 180) & angle1 > 0 & angle2 > 0) {
            boolean isRight = false;
            if (angle1 == 90 || angle2 == 90 || 180 - (angle1 + angle2) == 90) isRight = true;
            String typeInfo = isRight ? " is right" : " is not right ";
            System.out.println("Triangle exists, and "+typeInfo);
        } else {
            System.out.println("Triangle not exist");
        }
    };
    static void findMaxOfMins(double a, double b, double c, double d) {
        double max = Math.max(Math.min(a,b), Math.min(c,d));
        System.out.println(max);
    };
    static void onSameLine(double x1, double y1,double x2,double y2,double x3,double y3) {
        if ((y1 == y2 & y3 == y2) || (x1 == x2 & x3 == x2)) {
            System.out.println("On the one axe");
        } else {
            System.out.println("On different axes");
        }
    };
    static void willPass(double A, double B, double x, double y, double z) {
        if ((x < A && y < B) || (y < A && x < B)) {
            System.out.println("Will pass");
        } else {
            System.out.println("Will not pass");
        }
    }
    static void F(double x) {
        double answer = x <= 3 ? x*x - 3*x + 9 : 1/(Math.pow(x,3)+6);
        System.out.println("Answer: "+answer);
    }
    static void sums() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a numbe: ");
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i<=num;i++) {
            summ += i;
        }
        System.out.printf("Sum of numbers from 1 to %d id %d", num, summ);
    }
    static void cycleSecondTask(double a ,double b, double h) {
        List<Double> nums = new ArrayList<>();
        for (double i=a;i<=b;i+=h) {
            double num = i > 2 ? i : -1 * i;
            nums.add(num);
        }
        System.out.println("Answer "+ nums.toString());
    }
    static void cycleThirdTask() {
        int sum = 0;
        for (int i = 0;i <= 100;i++) {
            sum += i*i;
        }
        System.out.println("Answet is: " + sum);
    }
    static void cycleFourthTask() {
        BigInteger sum = new BigInteger("1");
        for (int i = 1;i <= 200;i++) {
            BigInteger num = new BigInteger(String.valueOf(i*i));
            sum = sum.multiply(num);
        }
        System.out.println("Answer is: " + sum);
    }
    static void getModule(int numsLength, double e) {
        int sum = 0;
        for (int i = 0; i <= numsLength; i++) {
            double n = (1/Math.pow(2,i)) + (1/Math.pow(3,i));
            if (Math.abs(n) >= e) sum += n;
        }
        System.out.println("Sum is: "+sum);
    }
    static void alphabetUnicodes() {
        char[] symbols = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < symbols.length; i++) {
            System.out.println(symbols[i] + " -- " + (byte) symbols[i]);
        }
    }
    static void findDevidors() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input m: ");
        double m = scanner.nextDouble();
        System.out.print("Input n: ");
        double n = scanner.nextDouble();
        for(double i = n; i >= m;i--) {
            System.out.print(i+" - ");
            for (double j=i; j>=1; j--) {
                if (i%j == 0 & i!=j & j!=1) System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    static void findCommon(int a, int b) {
        char[] aNums = String.valueOf(a).toCharArray();
        char[] bNums = String.valueOf(b).toCharArray();
        for(int i = 0; i< aNums.length; i++) {
            for (char c : bNums) {
                if (c == aNums[i]) {
                    System.out.print(aNums[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
//        findZ(1.2,2.3,5.6);
//        secondTask(1.2,2.3,5.6);
//        thirdTask(2.5,3.6);
//        reverseDouble(132.585);
//        getTimestamp(7000);
//        checkCoordinates(2,-2);
//        triangleExist(90,30);
//        findMaxOfMins(1,2,3,4);
//        onSameLine(5,0,5,1,5,0);
//        willPass(5,5,7,4,999);
//        F(5);
//        sums();
//        cycleSecondTask(1,2,1);
//        cycleThirdTask();
//        cycleFourthTask(); // 62198123175637948999999750170003....
//        getModule(50,0.3); // 2
//        alphabetUnicodes();
//        findDevidors();
        findCommon(150,573);

    };
}