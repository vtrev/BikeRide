//package bicycles;
//
//import bicycles.models.MountainBike;
//import bicycles.models.RoadBike;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class BikeRideTest {
//
//    @Test
//    public void shouldRideMountainBike(){
//        MountainBike mb  = new MountainBike();
//        BikeRide mbr = new BikeRide(mb);
//        mbr.mountainRide();
//        assertEquals(mbr.currentSpeed(),14);
//
//    }
//    @Test
//    public void shouldAccelerate(){
//        RoadBike rb  = new RoadBike();
//        BikeRide rrb = new BikeRide(rb);
//        rrb.roadRide();
//        assertEquals(rrb.currentSpeed(),18);
//
//    }
//}