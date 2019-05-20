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

    @Test
    public void find_returnsSquadQithSameId_secondSquad(){
        Squad firstSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        Squad secondSquad = new Squad("Marvel", 20, "make 3 billion");
        assertEquals(Squad.find(secondSquad.getmId()),secondSquad);
    }

    @Test
    public void getHeros_initiallyReturnsEmptyList_ArrayList(){
        Squad testSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        assertEquals(0, testSquad.getmHeroes().size());
    }
    @Test
    public void addHero_addsHeroToList_true(){
        Squad testSquad = new Squad("Suicide Squad", 6, "escape Amanda");
        Hero testHero = new Hero("Superman",30,"Flight", "Kryptonite","Wabalabadubdub");
        testSquad.addHero(testHero);
        assertEquals(true, testSquad.getmHeroes().contains(testHero));
    }
}