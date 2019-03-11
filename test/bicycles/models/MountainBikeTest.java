package bicycles.models;
import bicycles.Bicycle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainBikeTest {

    @Test
    void currentSpeed() {
        Bicycle mountainBike = new MountainBike();
        assertEquals(mountainBike.currentSpeed(),0);
    }

    @Test
    void shouldAccelerate() {
        Bicycle mountainBike = new MountainBike();
        for(int i=0;i<4;i++){
        mountainBike.accelerate();
        }
        assertEquals(mountainBike.currentSpeed(),20);
    }

    @Test
    void shouldBrake() {
        Bicycle mountainBike = new MountainBike();
        for(int i=0;i<3;i++){
            mountainBike.accelerate();
        }
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(),12);
    }
    @Test
    void shouldNotBrakeIntoNegatives(){
        Bicycle mountainBike = new MountainBike();
        mountainBike.accelerate();
        for(int i=0;i<4;i++){
            mountainBike.brake();
        }
        assertEquals(mountainBike.currentSpeed(),0);

    }

    @Test
    void stop() {
        Bicycle mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(),0);
    }
}