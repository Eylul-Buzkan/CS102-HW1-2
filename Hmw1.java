import java.util.Random;
import java.util.Scanner;
public class hw {
    static int[] array;
    public static void main (String [] args){
        Scanner scn = new Scanner (System.in);

        System.out.print("Array size is: ");
        int arraySize = scn.nextInt();
        array = createRandomArray(arraySize);
        int userChoice;

        do{
            showMenu();
            userChoice = scn.nextInt();

            if (userChoice == 1){
                printArray();
            }
            else if (userChoice == 2 ){
                findMinMax();
            }
            else if (userChoice == 3){
                averageAndDifferences();
            }
            else if (userChoice == 4){
                sumOddEvenIndexes();
            }
            else if (userChoice == 0){
                System.out.println("Existing");
            }
            else {
                System.out.println("Invalid");
            }
        }while (userChoice != 0);
    
    }
