import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{

    @After
    public void teardown(){
        Squad.clear();
    }

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

    @Test
    public void all_returnsAllInstancesOfSquad_true(){
        Squad firstSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        Squad secondSquad = new Squad("Marvel", 20, "make 3 billion");
        assertEquals(true, Squad.all().contains(firstSquad));
        assertEquals(true, Squad.all().contains(secondSquad));

    }
    @Test
    public void getId_squadInstantiatesWithId_1(){
        Squad testSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        assertEquals(1, testSquad.getmId());
    }
}