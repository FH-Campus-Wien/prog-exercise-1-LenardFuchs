package at.ac.fhcampuswien;

import java.lang.*;
import java.util.Scanner;


public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");

    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here

        System.out.println("0123456789012345678901");
        System.lineSeparator();
        System.lineSeparator();
        System.out.println("         __");
        System.lineSeparator();
        System.out.println(" _(\\    |@@|");
        System.lineSeparator();
        System.out.println("(__/\\__ \\--/ __");
        System.lineSeparator();
        System.out.println("   \\___|----|  |   __");
        System.lineSeparator();
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.lineSeparator();
        System.out.println("       /\\__/\\ \\__O (__");
        System.lineSeparator();
        System.out.println("      (--/\\--)    \\__/");
        System.lineSeparator();
        System.out.println("      _)(  )(_");
        System.lineSeparator();
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here

        //declare char Value:
        char a = 'Z';

        //declare Hexadecimal Value:
        int b = 0xface;

        //declare octal Value:
        int c = 012;

        //declare long Value:
        int d = (int) 80L;

        //declare float Value:
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int h = (int) 99.9;

        //declare double Value:
        int g = (int) 8.88e1;


        //Summe
        int sum1;
        sum1 = a + b + c + d + e + f + h + g;

        System.out.println(sum1);

    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int twonumbers = a + b;
        System.out.println(twonumbers);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        System.out.println("Before Swap:");
        System.lineSeparator();
        System.out.print("x: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.lineSeparator();
        System.out.print("y: ");
        int b = scanner.nextInt();
        System.lineSeparator();
        System.out.println("After Swap:");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("x: " + a);
        System.lineSeparator();
        System.out.println("y: " + b);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if (n1 < n2)
            System.out.print("n2 > n1");
        if (n1 > n2)
            System.out.print("n1 > n2");
        if (n1 == n2)
            System.out.print("n1 == n2");
        System.out.println();
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a < 0 || a >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if (0 <= a && a < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if (20000 <= a && a < 50000) {
            System.out.println("Average Sales Revenue");
        }
        if (50000 <= a && a < 80000) {
            System.out.println("Good Sales Revenue");
        }
        if (80000 <= a && a < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here

        System.out.print("Enter CommissionClass: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 1 || a > 4) {
            System.out.println("Your Commission Rate was set to 0.0");
        }
        switch (a) {

            case 1:
                System.out.println("Your Commission Rate was set to " + (a * 0.01));
                break;
            case 2:
                System.out.println("Your Commission Rate was set to " + (a * 0.01));
                break;
            case 3:
                System.out.println("Your Commission Rate was set to " + (a * 0.01));
                break;
            case 4:
                System.out.println("Your Commission Rate was set to " + (a * 0.01));
                break;
        }

    }

    //todo Task 9
    public void leapyear() {
        // input your solution here

        System.out.print("Year: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a % 4 == 0) ;
        if (a % 400 == 0) {
            System.out.println("Leapyear");
        } else if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("Not a Leapyear");
        } else System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here

        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);

        int e = scanner.nextInt();

        //Einerstelle
        int a = (e % 10);


        //Hunderterstelle
        double b = (e / 100);
        int b1 = (int) b * 1;


        //Zehnerstelle
        int c = e - a;
        int c2 = (int) ((b * 100) - e);
        int c3 = c2 + a;
        int c4 = Math.abs(c3);
        int c5 = c4 / 10;


        //System.out.print("Number: ");
        System.out.print(a);
        System.out.print(c5);
        System.out.print(b1);

        System.out.println();

    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
