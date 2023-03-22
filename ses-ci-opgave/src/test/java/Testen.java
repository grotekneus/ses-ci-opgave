import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testen {
    @Test
    public void testplus(){
        Main main = new Main();
        main.Plus(3,4);
        Assertions.assertEquals(7,main.Plus(3,4));
    }
    @Test
    public void testPlusAgain(){
        Main main = new Main();
        main.Plus(0,0);
        Assertions.assertEquals(0,main.Plus(0,0));
    }
}
