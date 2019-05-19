import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero heroOne = new Hero("Superman");
        assertEquals(true, heroOne instanceof Hero);
    }
}