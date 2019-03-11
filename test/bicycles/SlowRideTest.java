package bicycles;

import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.rides.SlowRide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SlowRideTest {

    //@Test
//    void shouldRideMountainBike() {
//        Bicycle mountainBike = new MountainBike();
//        SlowRide slowMountain = new SlowRide(mountainBike);
//        slowMountain.ride();
//        assertEquals(slowMountain.currentSpeed(),10);
//    }

    @Test
    void shouldRideRoadBike() {
        Bicycle roadBike = new RoadBike();
        SlowRide slowRoad = new SlowRide(roadBike);
        slowRoad.ride();
        assertEquals(slowRoad.currentSpeed(),35);
    }

    @Test
    void shouldRideTandem(){
        Bicycle tandem = new Tandem();
        SlowRide slowTandem = new SlowRide(tandem);
        slowTandem.ride();
        assertEquals(slowTandem.currentSpeed(),25);

    }

    @Test
    void currentSpeed() {
    }
}