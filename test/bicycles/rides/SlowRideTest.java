package bicycles.rides;

import bicycles.BicycleType;
import bicycles.specifications.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlowRideTest {

    //Testing the ride method makes use of the currentSpeed method,hence no tests for the currentSpeed method.

    @Test
    void shouldRideMountainBike() {
        Bike mountainBike = new Bike(BicycleType.MountainBike);
        SlowRide slowMountain = new SlowRide(mountainBike);
        slowMountain.ride();
        assertEquals(slowMountain.currentSpeed(),10);
    }

    @Test
    void shouldRideRoadBike() {
        Bike roadBike = new Bike(BicycleType.RoadBike);
        SlowRide slowRoad = new SlowRide(roadBike);
        slowRoad.ride();
        assertEquals(slowRoad.currentSpeed(),35);
    }

    @Test
    void shouldRideTandem(){
        Bike tandem = new Bike(BicycleType.Tandem);
        SlowRide slowTandem = new SlowRide(tandem);
        slowTandem.ride();
        assertEquals(slowTandem.currentSpeed(),25);

    }

}