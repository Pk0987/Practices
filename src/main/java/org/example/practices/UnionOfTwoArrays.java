package org.example.practices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class UnionOfTwoArrays {

    static void treeSet(int[] a, int[] b, int m, int n){

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < m; i++) {
            set.add(a[i]);
        }
        for (int j = 0; j < n; j++) {
            set.add(b[j]);
        }

        System.out.println("TreeSet Union Array size is : "+ set.size());
        System.out.print("TreeSet Union Array is : ");
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }

    static void hashSet(int[] a, int[] b, int m, int n){
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < m; i++) {
            s.add(a[i]);
        }
        for (int j = 0; j < n; j++) {
            s.add(b[j]);
        }
        System.out.println("\n\nNumber of Union Array Size is: " + s.size());
        System.out.println("Union Array is: "+ s.toString());
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 5, 7, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 8, 8, 10};
        int m=arr1.length;
        int n = arr2.length;

        treeSet(arr1,arr2,m,n);

        hashSet(arr1,arr2,m,n);

    }
}
