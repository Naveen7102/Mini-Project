import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    Calculator obj = new Calculator();
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True positive",120,obj.factorial(5), 0.00001);
        assertEquals("Finding factorial of a number for True positive",24,obj.factorial(4), 0.00001);

        assertEquals("Finding factorial of a number for True positive",2,obj.square_root(4), 0.00001);
        assertEquals("Finding factorial of a number for True positive",3,obj.square_root(9), 0.00001);
        assertEquals("Finding factorial of a number for True positive",Math.sqrt(2),obj.square_root(2), 0.00001);

        assertEquals("Finding factorial of a number for True positive",Math.pow(2,3),obj.power(2,3), 0.00001);
        assertEquals("Finding factorial of a number for True positive",Math.pow(1.1,3),obj.power(1.1,3), 0.00001);

        assertEquals("Finding factorial of a number for True positive",Math.log(5),obj.natural_log(5), 0.00001);
        assertEquals("Finding factorial of a number for True positive",Math.log(1.2),obj.natural_log(1.2), 0.00001);


    }
}
