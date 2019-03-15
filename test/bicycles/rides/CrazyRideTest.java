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
        CrazyRide carzyRoadRide = new CrazyRide(roadBike);
        carzyRoadRide.ride();
        assertEquals(carzyRoadRide.currentSpeed(),271);
    }

    @Test
    void shouldRideMountainBike(){
        Bike mountainBike = new Bike(BicycleType.MountainBike);
        CrazyRide carzyMountainRide = new CrazyRide(mountainBike);
        carzyMountainRide.ride();
        assertEquals(carzyMountainRide.currentSpeed(),122);
    }

    @Test
    void shouldRideTandem(){
        Bike tandem = new Bike(BicycleType.Tandem);
        CrazyRide crazyTandemRide = new CrazyRide(tandem);
        crazyTandemRide.ride();
        assertEquals(crazyTandemRide.currentSpeed(),293);
    }
}