package shrutika.test.test;

import org.junit.jupiter.api.Test;
import shrutika.test.test.App;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	assertEquals( 7,App.sample(7) );
    }
}
