package org.example.practices;

class FizzBuzz {

    public static void main(String[] args) {
        int n = 16;
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 ==0;
            boolean buzz = i % 5 ==0;
            if(fizz){
                System.out.print("Fizz ");
                if(buzz)
                    System.out.print("FizzBuzz ");
            } else if (buzz) {
                System.out.print("Buzz ");
                if(fizz)
                    System.out.print("FizzBuzz");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
