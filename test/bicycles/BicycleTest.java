package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {



    @Test
    void shouldAccelerate(){
        Bicycle b = new Bicycle();
        for(int i=0;i<5;i++){
            b.accelerate();
        }
        assertEquals(b.currentSpeed(),25);
    }

    @Test
    void shouldBrake() {
        Bicycle b1 = new Bicycle();
        for(int i = 0 ;i < 3; i++){
            b1.accelerate();
        }
        b1.brake();
        assertEquals(b1.currentSpeed(),12);
    }


    @Test
    void shouldStop() {
        Bicycle b2 = new Bicycle();
        b2.accelerate();
        b2.stop();
        assertEquals(b2.currentSpeed(),0);
    }
}