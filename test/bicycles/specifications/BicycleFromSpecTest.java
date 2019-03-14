package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.rides.CrazyRide;
import bicycles.rides.SlowRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BicycleFromSpecTest {

    @Test
    void shouldTakeBikeOnCrazyRide() {
    BicycleSpecification bikeSpecs = new BicycleSpecification(BicycleType.MountainBike);
    Bicycle crazyBike = new BicycleFromSpec(bikeSpecs);
    CrazyRide crazyRide =  new CrazyRide(crazyBike);
    crazyRide.ride();
    assertEquals(crazyRide.currentSpeed(),122);

    }

    @Test
    void shouldTakeBikeOnSlowRide(){
        BicycleSpecification bikeSpecs = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle slowBike = new BicycleFromSpec(bikeSpecs);
        SlowRide slowRide = new SlowRide(slowBike);
        slowRide.ride();
        assertEquals(slowRide.currentSpeed(),35);
    }
}