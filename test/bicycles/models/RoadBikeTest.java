//package bicycles.models;
//
//import bicycles.Bicycle;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class RoadBikeTest {
//
//    @Test
//    void currentSpeed() {
//        Bicycle roadBike = new RoadBike();
//        assertEquals(roadBike.currentSpeed(),0);
//    }
//
//    @Test
//    void shouldAccelerate() {
//        Bicycle roadBike = new RoadBike();
//        for(int i=0;i<3;i++){
//            roadBike.accelerate();
//        }
//        assertEquals(roadBike.currentSpeed(),33);
//    }
//
//    @Test
//    void shouldBrake() {
//        Bicycle roadBike = new RoadBike();
//        for(int i=0;i<5;i++){
//            roadBike.accelerate();
//        }
//        roadBike.brake();
//        assertEquals(roadBike.currentSpeed(),51);
//    }
//    @Test
//    void shouldNotBrakeIntoNegatives(){
//        Bicycle roadBike = new RoadBike();
//        roadBike.accelerate();
//        for(int i=0;i<3;i++){
//            roadBike.brake();
//        }
//        assertEquals(roadBike.currentSpeed(),0);
//
//    }
//
//    @Test
//    void stop() {
//        Bicycle roadBike = new RoadBike();
//        roadBike.accelerate();
//        roadBike.stop();
//        assertEquals(roadBike.currentSpeed(),0);
//    }
//}