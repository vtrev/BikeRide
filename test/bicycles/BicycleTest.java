package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {



    @Test
    void shouldAccelerate(){
        Bicycle b = new Bicycle();
        b.setSpeed(1);
        b.accelerate();
        assertEquals(b.currentSpeed(),6);
    }

    @Test
    void shouldBrake() {

        Bicycle b1 = new Bicycle();
        b1.setSpeed(10);
        b1.brake();
        assertEquals(b1.currentSpeed(),7);
    }


    @Test
    void shouldStop() {
        Bicycle b2 = new Bicycle();
        b2.setSpeed(44);
        b2.stop();
        assertEquals(b2.currentSpeed(),0);
    }
}