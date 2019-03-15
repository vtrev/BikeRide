package bicycles.rides;

import bicycles.BicycleType;
import bicycles.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlowRideTest {

    //Testing the ride method makes use of the currentSpeed method,hence no tests for the currentSpeed method.

    @Test
    void shouldRideMountainBike() {
        Bike mountainBike = new Bike(BicycleType.MountainBike);
        SlowRide slowMountainRide = new SlowRide(mountainBike);
        slowMountainRide.ride();
        assertEquals(slowMountainRide.currentSpeed(),10);
    }

    @Test
    void shouldRideRoadBike() {
        Bike roadBike = new Bike(BicycleType.RoadBike);
        SlowRide slowRoadRide = new SlowRide(roadBike);
        slowRoadRide.ride();
        assertEquals(slowRoadRide.currentSpeed(),35);
    }

    @Test
    void shouldRideTandem(){
        Bike tandem = new Bike(BicycleType.Tandem);
        SlowRide slowTandemRide = new SlowRide(tandem);
        slowTandemRide.ride();
        assertEquals(slowTandemRide.currentSpeed(),25);

    }

}