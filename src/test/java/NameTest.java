import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    private Name name;

    @Before
    public void before(){
        this.name = new Name("adrian");
    }
    @Test
    public void getCharacte(){
        assertEquals(6,this.name.getCharacte());
    }
    @Test
    public void getReturnCharacte() {
        assertEquals("nairda",this.name.getReturnCharacte());
    }
    @Test
    public void getLetter() {
        assertEquals("ADRIAN",this.name.getLetters());
    }

}