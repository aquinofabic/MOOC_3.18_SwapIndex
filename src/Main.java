import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNumbers = new int[5];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 3;
        arrayOfNumbers[2] = 5;
        arrayOfNumbers[3] = 7;
        arrayOfNumbers[4] = 9;
        System.out.println(arrayOfNumbers);

        int i = 0;
        while (i < arrayOfNumbers.length) {
            System.out.println(arrayOfNumbers[i]);
            i++;
        }

        System.out.println("Give two indices to swap:");
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();
        int helper = arrayOfNumbers[firstIndex];
        arrayOfNumbers[firstIndex] = arrayOfNumbers[secondIndex];
        arrayOfNumbers[secondIndex] = helper;

        System.out.println("");
        i = 0;
        while (i < arrayOfNumbers.length) {
            System.out.println(arrayOfNumbers[i]);
            i++;
        }
    }
}

/*
Arrays can only contain a limited number of values whereas ArrayLists have unlimited size.
Therefore, the number of ELEMENTS in an array need to be specified as such:
String[] stringArray = new String[5];

You can access and add values to an index as such:
stringArray[0] = "First Index";
 */