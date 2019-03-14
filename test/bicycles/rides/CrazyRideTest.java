package bicycles.rides;

import bicycles.BicycleType;
import bicycles.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CrazyRideTest {

    //Testing the ride method makes use of the currentSpeed method,hence no tests for the currentSpeed method.

    @Test
    void shouldRideRoadBike() {
        Bike roadBike = new Bike(BicycleType.RoadBike);
        CrazyRide crazyRoad = new CrazyRide(roadBike);
        crazyRoad.ride();
        assertEquals(crazyRoad.currentSpeed(),271);
    }

    @Test
    void shouldRideMountainBike(){
        Bike mountainBike = new Bike(BicycleType.MountainBike);
        CrazyRide crazyMountain = new CrazyRide(mountainBike);
        crazyMountain.ride();
        assertEquals(crazyMountain.currentSpeed(),122);
    }

    @Test
    void shouldRideTandem(){
        Bike tandem = new Bike(BicycleType.Tandem);
        CrazyRide crazyTandem = new CrazyRide(tandem);
        crazyTandem.ride();
        assertEquals(crazyTandem.currentSpeed(),293);
    }
}