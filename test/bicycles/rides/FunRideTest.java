package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.Bike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunRideTest {

    @Test
    void shouldAcceptBikes() {
        Bike roadBike = new Bike(BicycleType.RoadBike);
        FunRide funRide = new FunRide(1);
        assertEquals(funRide.accept(roadBike),"Bike Accepted");
    }

    @Test
    void shouldNotAcceptOverLimitNumberOfBikes(){

        Bicycle roadBike = new Bike(BicycleType.RoadBike);
        Bicycle mountainBike = new Bike(BicycleType.MountainBike);
        FunRide funRide = new FunRide(1);
        assertEquals(funRide.accept(roadBike),"Bike Accepted");
        assertEquals(funRide.accept(mountainBike),"Bike Rejected");
    }

    @Test
    void shouldGetCorrectCountForType() {
        Bike roadBike = new Bike(BicycleType.RoadBike);
        Bike mountainBike = new Bike(BicycleType.MountainBike);
        Bike mountainBike1 = new Bike(BicycleType.MountainBike);

        FunRide funride = new FunRide(3);

        funride.accept(roadBike);
        funride.accept(mountainBike);
        funride.accept(mountainBike1);
        assertEquals(funride.getCountForType(BicycleType.RoadBike),1);
        assertEquals(funride.getCountForType(BicycleType.MountainBike),2);
    }

    @Test
    void shouldGetTotalNumberOfBikesEntered() {

        Bike roadBike = new Bike(BicycleType.RoadBike);
        Bike mountainBike = new Bike(BicycleType.RoadBike);
        Bike mountainBike1 = new Bike(BicycleType.MountainBike);

        FunRide funride = new FunRide(3);

        funride.accept(roadBike);
        funride.accept(mountainBike);
        funride.accept(mountainBike1);
        assertEquals(funride.getEnteredCount(),3);
    }
}