package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Calculator calc= new Calculator();
        int a;
        int b;
        int result;

        System.out.print("Select an operation option: add(+) sub(-) mul(*) div(/): ");
        String operation=sc.nextLine();

        switch(operation){

            case "+":
                //Creating an instance of Calculator Addition

                System.out.println("Enter first number: ");
                a=sc.nextInt();
                System.out.println("Enter a second number: ");
                b=sc.nextInt();

                result=calc.add(a,b);
                System.out.println("Result: "+ result);

                break;
            case "-":
                //Creating an instance of Calculator Subtracting

                System.out.println("Enter first number: ");
                a=sc.nextInt();
                System.out.println("Enter a second number: ");
                b=sc.nextInt();

                result=calc.sub(a,b);
                System.out.println("Result: "+ result);
                break;
             case "*":
                //Creating an instance of Calculator Multiplying

                System.out.println("Enter first number: ");
                a=sc.nextInt();
                System.out.println("Enter a second number: ");
                b=sc.nextInt();

                result=calc.mul(a,b);
                System.out.println("Result: "+ result);
                break;
            case "/":
                //Creating an instance of Calculator Division

                System.out.println("Enter first number: ");
                a=sc.nextInt();
                System.out.println("Enter a second number: ");
                b=sc.nextInt();

                float sum=calc.div(a,b);
                System.out.println("Result: "+ sum);
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}