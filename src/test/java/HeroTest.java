import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero heroOne = new Hero("Superman",30,"Flight", "Kryptonite");
        assertEquals(true, heroOne instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithName_String(){
        Hero heroTest = new Hero("Superman",30, "Flight", "Kryptonite");
        assertEquals("Superman", heroTest.getName());
    }

    @Test
    public void Hero_instantiatesWithAge_Int(){
        Hero heroTest = new Hero("Superman", 30, "Flight", "Kryptonite");
        assertEquals(30, heroTest.getAge());
    }

    @Test
    public void Hero_instantiatesWithPower_String(){
        Hero heroTest = new Hero("Superman", 30, "Flight", "Kryptonite");
        assertEquals("Flight", heroTest.getPower());
    }

    @Test
    public void Hero_instantiatesWithWeakness_String(){
        Hero heroTest = new Hero("Supermane", 30, "Flight", "Kryptonite");
        assertEquals("Kryptonite", heroTest.getWeakeness());
    }
}