package org.example.practices;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

    public static int[] removeElement(int[] array,int element ) {  // Remove Method
        int[] newArray = new int[array.length - 1];
        int index = 0;                                  // Index to store the new array
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=element){
                newArray[index]=array[i];
                index++;
            }
        }return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length: ");     //Enter the array length
        int l = sc.nextInt();

        int[] originalArray =  new int[l];
        System.out.println("Enter the array: ");            // Enter the array

        for (int i = 0; i < l; i++) {
            originalArray[i] = sc.nextInt();                // Store the array from user input
        }


        System.out.println("Enter the removed element");
        int removedElement = sc.nextInt();


        int[] newArray = removeElement(originalArray, removedElement);   // Call the method

        System.out.println("Original Array :" + Arrays.toString(originalArray));   //Print the old array
        System.out.println("New array : "+ Arrays.toString(newArray));              // print the new array
    }

}
