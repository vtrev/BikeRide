//package bicycles.models;
//
//import bicycles.Bicycle;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class TandemTest {
//
//    @Test
//    void currentSpeed() {
//        Bicycle tandem = new Tandem();
//        assertEquals(tandem.currentSpeed(),0);
//    }
//
//    @Test
//    void shouldAccelerate() {
//        Bicycle tandem = new Tandem();
//        for(int i=0;i<4;i++){
//            tandem.accelerate();
//        }
//        assertEquals(tandem.currentSpeed(),48);
//    }
//
//    @Test
//    void shouldBrake() {
//        Bicycle tandem = new Tandem();
//        for(int i=0;i<3;i++){
//            tandem.accelerate();
//        }
//        tandem.brake();
//        assertEquals(tandem.currentSpeed(),29);
//    }
//    @Test
//    void shouldNotBrakeIntoNegatives(){
//        Bicycle tandem = new Tandem();
//        tandem.accelerate();
//        for(int i=0;i<3;i++){
//            tandem.brake();
//        }
//        assertEquals(tandem.currentSpeed(),0);
//
//    }
//
//    @Test
//    void stop() {
//        Bicycle tandem = new Tandem();
//        tandem.accelerate();
//        tandem.stop();
//        assertEquals(tandem.currentSpeed(),0);
//    }
//}