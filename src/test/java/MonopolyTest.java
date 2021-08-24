import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyTest {

    Monopoly player = new Monopoly(0);

    @Test
    public void when_die_rolls_are_1_and_2_current_position_should_advance_to_3(){

        Monopoly monopoly = Mockito.spy(player);
        Mockito.when(monopoly.throwDie()).thenReturn(1,2);
        assertEquals(3, monopoly.advance());
    }
    @Test
    public void when_die_rolls_are_3_and_3_advance_should_be_called_again_and_when_1_and_3_are_rolled_current_position_should_be_updated_to_10(){

        Monopoly monopoly = Mockito.spy(player);
        Mockito.when(monopoly.throwDie()).thenReturn(3, 3, 1, 3);
        assertEquals(10, monopoly.advance());
    }

}