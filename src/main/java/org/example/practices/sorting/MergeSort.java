package org.example.practices.sorting;

import java.util.Random;

public class MergeSort {

    private static void printArray(int[] numbers){
        for(int x: numbers) System.out.printf("%d ", x);
    }
    private static void mergeSort(int[] inputArray){

        int inputLength = inputArray.length;

        if(inputLength < 2){
            return;
        }
        int midValue = inputLength / 2;
        int[] leftHalf = new int[midValue];
        int[] rightHalf = new int[inputLength-midValue];

        for (int i = 0; i < midValue; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midValue; i < inputLength; i++) {
            rightHalf[i - midValue] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        mergeSort(inputArray,leftHalf,rightHalf);

    }

    static void mergeSort(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int righSize = rightHalf.length;
        int i=0, j=0, k=0;
        while (i< leftSize && j< righSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while (j < righSize) {
            inputArray[k]=rightHalf[j];
            j++;
            k++;
        }
    }


    public static void main() {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
            System.out.println("Before Merge Sorting...");
            printArray(numbers);

            mergeSort(numbers);

            System.out.println("\nAfter Merge Sorting...");
            printArray(numbers);

    }
}
