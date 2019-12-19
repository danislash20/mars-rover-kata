import com.example.Position;
import com.example.Rover;
import org.junit.jupiter.api.Test;

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

    @Test
    public void rover_turns_left_from_NORTH(){
        int x=0,y=0;
        Position position = Position.NORTH;
        Rover rover = new Rover(x,y,position);
        Rover roverInExpectedPosition = new Rover(x,y,Position.WEST);

        rover = rover.accept("l");

        assertEquals(roverInExpectedPosition, rover);

    }

    @Test
    public void rover_turns_left_from_WEST(){
        int x=0,y=0;
        Position position = Position.WEST;
        Rover rover = new Rover(x,y,position);
        Rover roverInExpectedPosition = new Rover(x,y,Position.SOUTH);

        rover = rover.accept("l");

        assertEquals(roverInExpectedPosition, rover);
    }

    @Test
    public void rover_turns_left_from_SOUTH(){
        int x=0,y=0;
        Rover rover = new Rover(x,y, Position.SOUTH);

        rover = rover.accept("l");

        assertEquals(new Rover(x,y,Position.EAST), rover);
    }
    @Test
    public void rover_turns_left_from_EAST(){
        int x=0,y=0;
        Rover rover = new Rover(x,y, Position.EAST);

        rover = rover.accept("l");

        assertEquals(new Rover(x,y,Position.NORTH), rover);
    }

    @Test
    public void rover_turns_right_from_NORTH(){
        int x=0,y=0;
        Rover rover = new Rover(x,y, Position.NORTH);

        rover = rover.accept("r");

        assertEquals(new Rover(x,y,Position.EAST), rover);
    }

    @Test
    public void rover_turns_right_from_EAST(){
        int x=0,y=0;
        Rover rover = new Rover(x,y, Position.EAST);

        rover = rover.accept("r");

        assertEquals(new Rover(x,y,Position.SOUTH), rover);
    }



}
