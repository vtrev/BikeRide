import bicycles.Bicycle;

public class BikeApp {

    public static void main(String[] args){
        Bicycle b = new Bicycle();
        BikeRide br = new BikeRide(b);
        br.ride();
        br.brake();
        System.out.println("The bike's current speed is : "+br.getCurrentSpeed());

    }
}
