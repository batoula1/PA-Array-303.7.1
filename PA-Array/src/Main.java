import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1: Write a program that creates an array of integers with a length of 3.
        //Assign the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;

        for(int i = 0; i < intArr.length; i++)
        {
            System.out.print(intArr[i] + " ");
        }

        System.out.println();

        //Task 2: Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2}
        // and produce the following output: 7

        int[] intArr2 = {13, 5, 7, 68, 2};

        if(intArr2.length % 2 == 0){
            System.out.println(intArr2[(intArr2.length /2) - 1]);
        }else{
            System.out.println(intArr2[intArr2.length /2]);
        }

        //Task 3: Write a program that creates an array of String type and
        // initializes it with the strings “red,” “green,” “blue,” and “yellow.”
        // Print out the array length. Make a copy using the clone( ) method.
        // Use the Arrays.toString( ) method on the new array to verify that the
        // original array was copied.

        String[] strArr = {"red", "green", "blue", "yellow"};
        System.out.printf("strArr length = %d", strArr.length);

        String[] strCopyArr = strArr.clone();
        System.out.printf("strCopy Arr = %s \n", Arrays.toString(strCopyArr));

        //Task 4: Write a program that creates an integer array with 5 elements
        // (i.e., numbers). The numbers can be any integers.  Print out the value
        // at the first index and the last index using length - 1 as the index.
        // Now try printing the value at index = length (e.g.,
        // myArray[myArray.length] ).  Notice the type of exception which is produced.
        // Now try to assign a value to the array index 5.
        // You should get the same type of exception.

        int[] intArray3 = {4,23,67,-89,101};
        System.out.printf("intArray3 First Index: %d \nLast Index: %d \n",
                intArray3[0],
                intArray3[intArray3.length - 1]);

        //System.out.println(intArray3[intArray3.length]);
        //System.out.println(intArray3[5]);

        //Task 5: Write a program where you create an integer array
        // with a length of 5. Loop through the array and assign the value of
        // the loop control variable (e.g., i) to the corresponding index in the array.

        int[] intArr4 = new int[5];

        for(int i = 0; i < intArr4.length; i++){
            intArr4[i] = i;
        }

        System.out.println(Arrays.toString(intArr4));

        //Task 6: Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable
        // multiplied by 2 to the corresponding index in the array.

        int[] intArr5 = new int[5];

        for(int i = 0; i < intArr4.length; i++){
            intArr5[i] = i * 2;
        }

        System.out.println(Arrays.toString(intArr5));

        //Task 7: Write a program where you create an array of 5 elements.
        // Loop through the array and print the value of each element,
        // except for the middle (index 2) element.
        String[] strArr2 = {"Hello", "There", "Skip", "My", "Friend"};
        for(int i =0; i < strArr2.length; i++){
            if( i != 2){
                System.out.println(strArr2[i]);
            }
        }

        //Task 8: Write a program that creates a String array of 5 elements and swaps
        // the first element with the middle element without creating a new array.

        String[] strArr3 = {"One", "Two", "Three", "Four", "Five"};
        String temp = strArr3[0];
        strArr3[0] = strArr3[2];
        strArr3[2] = temp;

        System.out.println(Arrays.toString(strArr3));

        //Task 9:
        //Write a program to sort the following int array in ascending order:
        // {4, 2, 9, 13, 1, 0}. Print the array in ascending order,
        // and print the smallest and the largest element of the array.
        // The output will look like the following:
        //Array in ascending order: 0, 1, 2, 4, 9, 13
        //The smallest number is 0
        //The biggest number is 13


        int[] intArr7 = {4, 2, 9, 13, 1, 0};

        Arrays.sort(intArr7);
        System.out.println(Arrays.toString(intArr7));
        System.out.printf("The smallest number is %d\n", intArr7[0]);
        System.out.printf("The biggest number is %d\n",
                intArr7[intArr7.length -1]);

        //Task 10: Create an array that includes an integer,
        // 3 strings, and 1 double. Print the array.

        String[] strArr4 = {"1", "Two", "Three", "Four", "5.0"};
        System.out.println(Arrays.toString(strArr4));

        //Task 11: Write some Java code that asks the user how many favorite
        // things they have. Based on their answer, you should create a String
        // array of the correct size. Then ask the user to enter the things and
        // store them in the array you created. Finally, print out the contents
        // of the array.

        System.out.println("How many favorite things do you have?");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] favArr = new String[length];

        for(int i = 0; i < favArr.length; i++){
            System.out.println("Enter your thing: ");
            favArr[i] = scanner.nextLine();
        }

        for (int i = 0; i< favArr.length; i++){
            System.out.print(favArr[i] + " ");
        }

    }

}}
