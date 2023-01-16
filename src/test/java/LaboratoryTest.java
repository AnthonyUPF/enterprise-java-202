import LabPart3.Player;
import LabPart3.Warrior;
import org.Lab.Laboratory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LaboratoryTest {

    @Test
    public void integer_ToArrayList(){
        List<Integer> arrayTest=List.of(1, 3, 5, 7, 9);
        assertArrayEquals(arrayTest.toArray(), Laboratory.odd(10).toArray());

    }

    @Test
    public void string_ToBoolean(){
        assertTrue(Laboratory.keywords("Don't break my heart"));
        assertFalse(Laboratory.keywords("I love to breakdance"));
    }

    @Test
    public void TestMethodDecreaseLives(){
        Player player=new Player(100,10,5);
        player.decreaseLives();
        assertEquals(4,player.getLives());
    };


}
