package bicycles.rides;


import bicycles.Bicycle;
import bicycles.BikeRide;

public class SlowRide implements BikeRide {

    private Bicycle bicycle;

    public  SlowRide(Bicycle bikeIn){
        this.bicycle = bikeIn;
    }
    @Override
    public void ride(){
        for(int i = 0;i<5;i++){
            this.bicycle.accelerate();
            this.bicycle.brake();
        }
}
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
}
}