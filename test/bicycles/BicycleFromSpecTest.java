package bicycles;

import bicycles.rides.CrazyRide;
import bicycles.rides.SlowRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BicycleFromSpecTest {

    @Test
    void shouldTakeBikeOnCrazyRide() {
    BicycleSpecification bikeSpecs = new BicycleSpecification(2,1,BicycleType.MountainBike);
    Bicycle crazyBike = new BicycleFromSpec(bikeSpecs);
    CrazyRide crazyRide =  new CrazyRide(crazyBike);
    crazyRide.ride();
    assertEquals(crazyRide.currentSpeed(),49);

    }

    @Test
    void shouldTakeBikeOnSlowRide(){
        BicycleSpecification bikeSpecs = new BicycleSpecification(8,6,BicycleType.RoadBike);
        Bicycle slowBike = new BicycleFromSpec(bikeSpecs);
        SlowRide slowRide = new SlowRide(slowBike);
        slowRide.ride();
        assertEquals(slowRide.currentSpeed(),10);
    }
}