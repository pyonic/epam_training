import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
public class OptionalTask {
    public static void main(String[] args) {
        HashMap < Integer, Integer > numsHash = new HashMap < Integer, Integer > ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[] intList = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input a number: ");
            int num = scanner.nextInt();
            intList[i] = num;
        }
        int MIN_LENGTH = Integer.MAX_VALUE;
        int MAX_LENGTH = Integer.MIN_VALUE;
        int max_value = 0;
        int min_value = 0;

        // OPTIONAL TASK 1
        for (int i = 0; i < intList.length; i++) {
            char[] intChar = String.valueOf(intList[i]).toCharArray();
            numsHash.put(intList[i], intChar.length);
            if (intChar.length < MIN_LENGTH) {
                MIN_LENGTH = intChar.length;
                min_value = intList[i];
            }
            if (intChar.length > MAX_LENGTH) {
                MAX_LENGTH = intChar.length;
                max_value = intList[i];
            }
        }
        System.out.println("Max and Min length numbers: ");
        System.out.println(max_value + " - " + MAX_LENGTH + "\n" + min_value + " - " + MIN_LENGTH);

        // OPTIONAL TASK 2 -- Using Built In Libraries
        Arrays.sort(intList);
        System.out.println("Sorted by chars length: " + Arrays.toString(intList)); //Sorted by chars length: [1, 12, 123]

        // OPTIONAL TASK 3
        int sum = 0;
        for (int i = 0; i < intList.length; i++) {
            char[] intChar = String.valueOf(intList[i]).toCharArray();
            sum += intChar.length;
        }
        double avg = sum / intList.length;
        System.out.println("Average length is: " + avg);
        System.out.println("Numbers which length is less then Average");
        for (int i = 0; i < intList.length; i++) {
            char[] intChar = String.valueOf(intList[i]).toCharArray();
            if (intChar.length < avg) System.out.print(intList[i] + " ");
        }

    }
}