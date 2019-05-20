import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{
    @Test
    public void squad_instantiatesCorrectly_true(){
        Squad testSquad = new Squad("Suicide Squad",6, "escape Amanda");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    public void getName_SquadInstantiatesWithName_String(){
        Squad testSquad = new Squad("Suicide Squad",6, "escape Amanda");
        assertEquals("Suicide Squad", testSquad.getName());
    }

    @Test
    public void getSize_SquadInstantiatesWithMaxSize_Int(){
        Squad testSquad = new Squad("Suicide Squad", 6 , "escape Amanda");
        assertEquals(6, testSquad.getmSize());
    }

    @Test
    public void getCause_SquadInstantiatesWithCause_String(){
        Squad testSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        assertEquals("escape Amanda", testSquad.getmCause());
    }
}