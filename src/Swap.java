import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNumbers = new int[5];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 3;
        arrayOfNumbers[2] = 5;
        arrayOfNumbers[3] = 7;
        arrayOfNumbers[4] = 9;

        int i = 0;
        for (i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }
        System.out.println("");


        // Alternatively, you can print each index as such:
        // Integer index acts as arrayOfNumbers[i]

        for (Integer numbers : arrayOfNumbers) {
            System.out.println(numbers);
        }

        System.out.println("Which two numbers do you want to swap?");
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        int[] helperList = new int[1];

        for (i = 0; i < arrayOfNumbers.length; i++) {
            if (firstInput == arrayOfNumbers[i]) {
                arrayOfNumbers[i] = secondInput;
                if (secondInput == arrayOfNumbers[i]) {

                }
            }
        }
    }
}
