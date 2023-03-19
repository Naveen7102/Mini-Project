import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator obj = new Calculator();
    static double diff = 0.00001;
    @Test
    public void factorialTruePositive(){

        assertEquals("Finding factorial of a number for True positive",120,obj.factorial(5), diff);
        assertEquals("Finding factorial of a number for True positive",24,obj.factorial(4), diff);
        assertEquals("Finding factorial of a number for True positive",720,obj.factorial(6), diff);
        assertEquals("Finding factorial of a number for True positive",1,obj.factorial(0), diff);

    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive",5,obj.factorial(5),diff);
        assertNotEquals("Finding factorial of a number for False positive",5,obj.factorial(5), diff);
        assertNotEquals("Finding factorial of a number for False positive",250,obj.factorial(3), diff);   
        assertNotEquals("Finding factorial of a number for False positive",2,obj.factorial(1), diff);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding Square Root of a number for True positive",2,obj.square_root(4), diff);
        assertEquals("Finding Square Root of a number for True positive",3,obj.square_root(9), diff);
        assertEquals("Finding Square Root of a number for True positive",11,obj.square_root(121), diff);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding Square Root of a number for False positive",4,obj.square_root(10), diff);
        assertNotEquals("Finding Square Root of a number for False positive",3,obj.square_root(225), diff);
        assertNotEquals("Finding Square Root of a number for False positive",2,obj.square_root(3), diff);   
        
    }


    @Test
    public void logarithmTruePositive(){
        assertEquals("Finding Logarithm Root of a number for True positive",Math.log(5),obj.natural_log(5), diff);
        assertEquals("Finding Logarithm Root of a number for True positive",Math.log(1.2),obj.natural_log(1.2), diff);
        assertEquals("Finding Logarithm Root of a number for True positive",0,obj.natural_log(1), diff);
    }

    @Test
    public void logarithmFalsePositive(){
        assertNotEquals("Finding Logarithm Root of a number for False positive",1,obj.natural_log(5), diff);
        assertNotEquals("Finding Logarithm Root of a number for False positive",0,obj.natural_log(1.2), diff);
        assertNotEquals("Finding Logarithm Root of a number for False positive",2,obj.natural_log(1), diff);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding factorial of a number for True positive",8,obj.power(2,3), diff);
        assertEquals("Finding factorial of a number for True positive",1.331,obj.power(1.1,3), diff);
        assertEquals("Finding factorial of a number for True positive",1,obj.power(1,11), diff);
        assertEquals("Finding factorial of a number for True positive",0,obj.power(0,11), diff);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding factorial of a number for False positive",32,obj.power(4,3), diff);
        assertNotEquals("Finding factorial of a number for False positive",0,obj.power(1.1,3), diff);
    }

}
