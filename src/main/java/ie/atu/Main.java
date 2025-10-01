package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Create an instance of  Calculator
        Calculator calc= new Calculator();
;
        System.out.println("Simple Calculator -Add two numbers");
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter a second number: ");
        int b=sc.nextInt();

        int result=calc.add(a,b);
        System.out.println("Result: "+ result);
    }
}