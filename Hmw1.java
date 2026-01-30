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
        //part a of the assignment
        public static int [] createRandomArray (int size){
    
            Random random = new Random();
            int [] a = new int [size];
            for (int i = 0; i < size; i++){
                a [i] = random.nextInt(101);
         }
         return a;
        }
    
        public static void printArray(){
            for( int i = 0; i < array.length; i ++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        //part c of the assignment
        public static void findMinMax(){
    
            int min = array[0];
            int max = array[0];
    
            for (int i = 0; i< array.length; i ++){
                if (array[i] < min){
                    min = array [i];
                }
                if( array [i] > max){
                    max = array [i];
                }
            }
    
            System.out.println("Min is " + min);
            System.out.println("Max is " + max);
        }
    }
    //part d of the assignment
    public static void averageAndDifferences(){
        double sum = 0;

        for (int i = 0; i< array.length; i++){
            sum+=array[i];
        }

        double average = sum/array.length;

        System.out.println("Average is " + average);
        System.out.println("Differences are ");

        for(int i = 0; i< array.length; i ++){
            System.out.print((array[i] - average));
        }
        System.out.println();
    }
  //part e of the assignment
    public static void sumOddEvenIndexes(){
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i<array.length; i ++){
            if(i%2 == 0){
                evenSum+=array[i];
            }else {
                oddSum += array[i];
            }
        }
        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);
    }
  //part b of the assignment
    public static void showMenu(){
        System.out.println("--------MENU---------");
        System.out.println("1. Print Array");
        System.out.println("2. Print Min and Max");
        System.out.println("3. Print Average and Differences");
        System.out.println("4. Print Odd and Even Index Sums");
        System.out.println("0. Exist");
        System.out.print("Choice: ");
    }



}


