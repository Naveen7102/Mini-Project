import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        Calculator obj = new Calculator();

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter a option from the following menu");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm");
        System.out.println("4. Power Function");
        System.out.print("Your Option is - ");
        int option  = scanner.nextInt();
        System.out.println(calculator(option));
    }
    public static double calculator(int option){
        Scanner scanner  = new Scanner(System.in);
        double res = -1;
        switch (option){
            case 1:
//                square root
                System.out.println("Enter a number");
                double n = scanner.nextInt();
                res = square_root(n);
                break;
            case 2:
//                factorial
                System.out.println("Enter a number");
                int factn = scanner.nextInt();
                res = factorial(factn);
                break;
            case 3:
//                natural log
                System.out.println("Enter a number");
                double logn = scanner.nextInt();
                res = natural_log(logn);
                break;
            case 4:
//                power
                System.out.println("Enter the base number");
                double a = scanner.nextInt();
                System.out.println("Enter the exponent number");
                double b = scanner.nextInt();
                res = power(a,b);
                break;
            default:
                System.out.println("Select a valid option");

        }
        return res;
    }

    public static double natural_log(double n){
        return Math.log(n);
    }

    public static double square_root(double n){
        return Math.sqrt(n);
    }

    public static double factorial(int n){
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static double power(double a, double b){
        return Math.pow(a,b);
    }

}
