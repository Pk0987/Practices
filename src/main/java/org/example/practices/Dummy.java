package org.example.practices;

public class Dummy {
    public static void main() {
        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int ans = n-(n-i)+j;
                System.out.print(ans>n?ans-n:ans);
            }
            System.out.println();
        }
    }
}
