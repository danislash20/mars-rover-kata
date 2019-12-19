import com.example.Position;
import com.example.Rover;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ThingTest {

    @Test
    public void rover_has_a_starting_point(){
        int x=0,y=0;
        Position position = Position.NORTH;
        Rover rover = new Rover(x,y,position);
        Rover rover2 = new Rover(x,y,position);

        assertEquals(rover2, rover);
    }

    @Test
    public void rover_moves_forward(){
        int x=0,y=0;
        Position position = Position.NORTH;
        Rover rover = new Rover(x,y,position);
        Rover roverInExpectedPosition = new Rover(x,1,position);

        rover = rover.accept("f");

        assertEquals(roverInExpectedPosition, rover);
    }

    @Test
    public void rover_moves_backward(){
        int x=0,y=0;
        Position position = Position.NORTH;
        Rover rover = new Rover(x,y,position);
        Rover roverInExpectedPosition = new Rover(x,-1,position);

        rover = rover.accept("b");

        assertEquals(roverInExpectedPosition, rover);
    }


    @ParameterizedTest(name = "Turns from {0} to {1}")
    @CsvSource({
            "WEST, SOUTH",
            "SOUTH, EAST",
            "EAST, NORTH",
            "NORTH, WEST",
    })
    public void rover_turns_left_from(Position from, Position to){
        int x=0,y=0;
        Rover rover = new Rover(x,y,from);
        Rover roverInExpectedPosition = new Rover(x,y,to);

        rover = rover.accept("l");

        assertEquals(roverInExpectedPosition, rover);
    }

    @ParameterizedTest(name = "Turns from {0} to {1}")
    @CsvSource({
            "NORTH, EAST",
            "EAST, SOUTH",
            "SOUTH, WEST",
            "WEST, NORTH"
    })
    public void rover_turns_right_from_NORTH(Position from, Position to){
        int x=0,y=0;
        Rover rover = new Rover(x,y, from);

        rover = rover.accept("r");

        assertEquals(new Rover(x,y,to), rover);
    }

    @Test
    public void rover_recieves_some_commands(){
        int x=0,y=0;
        Rover rover = new Rover(x,y, Position.NORTH);
        rover = rover.accept("rr");

        assertEquals(new Rover(x,y,Position.SOUTH), rover);

    }
}
