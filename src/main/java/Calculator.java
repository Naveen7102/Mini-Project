import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    
    private static final Logger logUtility = LogManager.getLogger(Calculator.class);

    public static void main(String[] args)
    {
        calculator();
    }
    
    public static void calculator(){
        Calculator obj = new Calculator();
        Scanner scanner  = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a option from the following menu");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            System.out.print("Your Option is - ");
            int option  = scanner.nextInt();
            if(option == 5)
            {
                break;
            }
            switch (option){
                case 1:
    //                square root
                    System.out.println("Enter a number");
                    double n = scanner.nextInt();
                    Double sr_res = obj.square_root(n);
                    System.out.println("Square root of " + n + " is " + sr_res);
                    break;
                case 2:
    //                factorial
                    System.out.println("Enter a number");
                    int factn = scanner.nextInt();
                    Integer f_res = obj.factorial(factn);
                    System.out.println("Factorial of " + factn + " is " + f_res);
                    break;
                case 3:
    //                natural log
                    System.out.println("Enter a number");
                    Double logn = scanner.nextDouble();
                    Double nl_res = obj.natural_log(logn);
                    System.out.println("Factorial of " + logn + " is " + nl_res);
                    break;
                case 4:
    //                power
                    System.out.println("Enter the base number");
                    double a = scanner.nextInt();
                    System.out.println("Enter the exponent number");
                    double b = scanner.nextInt();
                    Double p_res = obj.power(a,b);
                    System.out.println("Power function of " + a + " rise to " + b + " is " + p_res);
                    break;
                default:
                    System.out.println("Select a valid option");
                    break;

            }
        
        }
        scanner.close();
    }

    public Double natural_log(double n){
        if(n<0)
        {
            logUtility.error("Square root of negative number is not defined");
            return null;
        }
        return Math.log(n);
    }

    public Double square_root(double n){
        if(n<0)
        {
            logUtility.error("Square root of negative number is not defined");
            return null;
        }
        return Math.sqrt(n);
    }

    public Integer factorial(int n){
        if(n < 0) {
            logUtility.error("Factorial of negative number is not defined");
            return null;
        }
        if(n < 0) {
            logUtility.error("Natural Logarithm of negative numbers is not defined");
            return null;
        }
        else
        {
            int ans = 1;
            for(int i=1;i<=n;i++)
            {
                ans = ans*i;
            }            
            return ans;
        }
        
    }

    public Double power(double a, double b){
        if(a == 0 & b == 0)
        {
            logUtility.info("0 power 0 is not defined");
            return null;
        }
        return Math.pow(a,b);
    }

}
