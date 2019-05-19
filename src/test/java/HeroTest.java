import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{

    @After
    public void teardown(){
        Hero.clear();
    }

    @Test
    public void Hero_instantiatesCorrectly_true(){
        Hero heroOne = new Hero("Superman",30,"Flight", "Kryptonite","Wabalabadubdub");
        assertEquals(true, heroOne instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithName_String(){
        Hero heroTest = new Hero("Superman",30, "Flight", "Kryptonite","Wabalabadubdub");
        assertEquals("Superman", heroTest.getName());
    }

    @Test
    public void Hero_instantiatesWithAge_Int(){
        Hero heroTest = new Hero("Superman", 30, "Flight", "Kryptonite","Wabalabadubdub");
        assertEquals(30, heroTest.getAge());
    }

    @Test
    public void Hero_instantiatesWithPower_String(){
        Hero heroTest = new Hero("Superman", 30, "Flight", "Kryptonite","Wabalabadubdub");
        assertEquals("Flight", heroTest.getPower());
    }

    @Test
    public void Hero_instantiatesWithWeakness_String(){
        Hero heroTest = new Hero("Supermane", 30, "Flight", "Kryptonite","Wabalabadubdub");
        assertEquals("Kryptonite", heroTest.getWeakeness());
    }

    @Test
    public void Hero_instantiatesWithCatchPhrase_String(){
        Hero heroTest = new Hero("Superman", 30, "Flight", "Kryptonite", "Wabalabadubdub");
        assertEquals("Wabalabadubdub", heroTest.getCatchPhrase());
    }


}