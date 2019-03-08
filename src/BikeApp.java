import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

public class BikeApp {

    public static void main(String[] args){
        MountainBike mountainBike = new MountainBike();
        BikeRide mountainRide = new BikeRide(mountainBike);
        mountainRide.ride();
        mountainRide.brake();

        RoadBike roadBike = new RoadBike();
        BikeRide roadRide = new BikeRide(roadBike);
        roadRide.ride();
        roadRide.brake();

        System.out.println("The Mountain bike's current speed is : "+mountainRide.getCurrentSpeed());
        System.out.println("The Road bike's current speed is : "+roadRide.getCurrentSpeed());

    }
}
