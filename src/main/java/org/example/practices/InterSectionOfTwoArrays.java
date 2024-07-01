package org.example.practices;

import java.util.ArrayList;

public class InterSectionOfTwoArrays {

    public static ArrayList<Integer> interSection(int[] a, int[] b) {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {

                    if (a[i] == b[j]){
                        result.add(a[i]);
                    i++;
                    j++;
                    }
                    else if(a[i]<b[j]){
                        i++;}
                    else
                    {
                        j++;
                    }
                }
        return result;
            }

    public static void main(String[] args) {
        int[] arr1= {2,4,7,9,6};
        int[] arr2= {3,5,1,4,7};
        ArrayList<Integer> intersection = interSection(arr1,arr2);
        System.out.println(intersection);


    }
}
