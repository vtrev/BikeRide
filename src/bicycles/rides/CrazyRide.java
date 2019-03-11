package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class CrazyRide implements BikeRide {
    private Bicycle bicycle;

    public  CrazyRide(Bicycle bikeIn){

        this.bicycle = bikeIn;
    }

    @Override
    public void ride() {
    for(int i=0;i<25;i++){
        if(i == 15){
            this.bicycle.brake();
        }
        this.bicycle.accelerate();
    }

    }
    @Override
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
