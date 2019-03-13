//package bicycles;
//
//import bicycles.models.RoadBike;
//import bicycles.models.Tandem;
//import bicycles.rides.CrazyRide;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class CrazyRideTest {
//
//    @Test
//    void shouldRideRoadBike() {
//        Bicycle roadBike = new RoadBike();
//        CrazyRide crazyRoad = new CrazyRide(roadBike);
//        crazyRoad.ride();
//        assertEquals(crazyRoad.currentSpeed(),271);
//    }
//
////    @Test
////    void shouldRideMountainBike(){
////        Bicycle mountainBike = new MountainBike();
////        CrazyRide crazyMountain = new CrazyRide(mountainBike);
////        crazyMountain.ride();
////        assertEquals(crazyMountain.currentSpeed(),122);
////    }
//
//    @Test
//    void shouldRideTandem(){
//        Bicycle tandem = new Tandem();
//        CrazyRide crazyTandem = new CrazyRide(tandem);
//        crazyTandem.ride();
//        assertEquals(crazyTandem.currentSpeed(),293);
//
//    }
//}