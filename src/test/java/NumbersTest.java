import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    private Numbers numbers;

    @Before
    public void before(){
        this.numbers = new Numbers(10,1);
    }

    @Test
    public void getSum(){
        assertEquals(11,this.numbers.getSum() );
    }
    @Test
    public void getSubtraction() {
        assertEquals(9,this.numbers.getSubtraction());
    }
    @Test
    public void getMultiplication() {
        assertEquals(10,this.numbers.getMultiplication());
    }
}