package bicycles.rides;

import bicycles.Bicycle;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunRideTest {

    @Test
    void shouldAcceptBikes() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        FunRide funRide = new FunRide(1);

        assertEquals(funRide.accept(roadBike),"Bike Accepted");
    }
    @Test
    void shouldNotAcceptOverLimitNumberOfBikes(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(BicycleType.MountainBike);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        FunRide funRide = new FunRide(1);

        assertEquals(funRide.accept(roadBike),"Bike Accepted");
        assertEquals(funRide.accept(mountainBike),"Bike Rejected");
    }

    @Test
    void shouldGetCorrectCountForType() {

        BicycleSpecification roadBike1Specs = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpecs = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification mountainBike1Specs = new BicycleSpecification(BicycleType.MountainBike);

        BicycleFromSpec roadBike = new BicycleFromSpec(roadBike1Specs);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpecs);
        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike1Specs);

        FunRide funride = new FunRide(3);

        funride.accept(roadBike);
        funride.accept(mountainBike);
        funride.accept(mountainBike1);
        assertEquals(funride.getCountForType(BicycleType.RoadBike),1);
        assertEquals(funride.getCountForType(BicycleType.MountainBike),2);

    }

    @Test
    void shouldGetTotalNumberOfBikesEntered() {
        BicycleSpecification roadBike1Specs = new BicycleSpecification(BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpecs = new BicycleSpecification(BicycleType.MountainBike);
        BicycleSpecification mountainBike1Specs = new BicycleSpecification(BicycleType.MountainBike);

        BicycleFromSpec roadBike = new BicycleFromSpec(roadBike1Specs);
        BicycleFromSpec mountainBike = new BicycleFromSpec(mountainBikeSpecs);
        BicycleFromSpec mountainBike1 = new BicycleFromSpec(mountainBike1Specs);

        FunRide funride = new FunRide(3);

        funride.accept(roadBike);
        funride.accept(mountainBike);
        funride.accept(mountainBike1);
        assertEquals(funride.getEnteredCount(),3);
    }
}