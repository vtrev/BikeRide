import bicycles.Bicycle;
import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.rides.SlowRide;
import static java.lang.System.out;

public class BikeApp {

    public static void main(String[] args){

        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle RoadBicycle = new BicycleFromSpec(roadBikeSpec);
        SlowRide bikeRide = new SlowRide(RoadBicycle);
        bikeRide.ride();
        out.print("Bike current speed : "+bikeRide.currentSpeed());



    }
}
