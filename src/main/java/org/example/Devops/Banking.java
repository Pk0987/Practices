package org.example.Devops;

import java.util.*;

class Banking {
        private int Ac_no;
        private String name;
        private long number;
        private float balance;
        Scanner sc = new Scanner(System.in);
        static List<Banking> Userlist = new ArrayList<>();
   public void openAcc(){
       System.out.println("Enter Account Number");
       Ac_no = sc.nextInt();
       System.out.println("Enter User Name");
       name = sc.next();
       System.out.println("Enter Mobile Number");
       number = sc.nextLong();
       System.out.println("Enter Bank Balance");
       balance = sc.nextFloat();
    }
    public boolean search(int acc){
        if(acc == Ac_no){
            displayAc();
            return true;
        }
       return false;
    }
    public void deposit(){
       float amt;
        System.out.println("Enter the deposit amount: ");
        amt =sc.nextFloat();
        balance = balance+amt;
        System.out.printf("After deposit the balance is:%s%n", balance);
    }
    public void withDrawl(){
        float amt;
        System.out.println("Enter the withdrawl amount: ");
        amt =sc.nextFloat();
        if(balance >=amt){
            balance = balance-amt;
            System.out.printf("Balance after withdrawl: %s%n", balance);
        }else {
            System.out.printf("Your Balance is less than your amount %s\tTransaction failed..!%n", amt);
        }

    }

    public void displayAc(){
        System.out.printf("Account No: \t%d%n", Ac_no);
        System.out.printf("Holder Name: \t%s%n", name);
        System.out.printf("Mobile Number: \t%d%n", number);
        System.out.printf("Balance: \t\t₹%s%n", balance);
    }
    public void mainMenu(){
        System.out.println("Hello There Welcome to Our Bank..!\n1.New User\n2.Already exist");
        int val = sc.nextInt();
        Banking bank = new Banking();
        if(val==1){
            bank.openAcc();
            Userlist.add(bank);
            function();
        }else if(val==2){
            bank.function();
        }else {
            System.out.println("Please Enter a valid answer..!(1 or 2)");
        }
    }

    public void function() {
        System.out.println("1. Display all account details \n2. Search by Account number \n3. Deposit the amount \n4. Withdraw the amount \n5. Exit \n6. Main menu");
        int ch = sc.nextInt();
        int acc;
        boolean found;
        switch (ch) {
            case 1:
                for (Banking banking : Userlist) {
                    banking.displayAc();
                }
                break;
            case 2:
                System.out.println("Enter Ac no what you want to search");
                acc = sc.nextInt();
                found = false;
                for (Banking banking : Userlist) {
                    found = banking.search(acc);
                    if (found) {
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed!, Account doesn't exist");
                }
                break;
            case 3:
                System.out.println("Enter acc no:");
                acc = sc.nextInt();
                found = false;
                for (Banking banking : Userlist) {
                    found = banking.search(acc);
                    if (found) {
                        banking.deposit();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed!, Account doesn't exist");

                }
                break;
            case 4:
                System.out.println("Enter acc no:");
                acc = sc.nextInt();
                found = false;
                for (Banking banking : Userlist) {
                    found = banking.search(acc);
                    if (found) {
                        banking.withDrawl();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed!, Account doesn't exist");
                }
                break;
            case 5:
                System.out.println("See you soon..!");
                break;
            case 6:
                mainMenu();
                break;

        }
    }
    public static void main() {
        Banking bank = new Banking();
        bank.mainMenu();
        System.out.println(Userlist.size());
    }
}
