
package calculadora;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 *
 * @author jonaranjo
 */
public class TestRunner {

 
    public static void main(String[] args) {
       Result result = JUnitCore.runClasses(SumRestTest.class);
       result.getFailures().stream().forEach((failure) -> {
           System.out.println(failure.toString());
        });
       
    }
    
}
