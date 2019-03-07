import bicycles.Bicycle;

public class BikeRide{
     Bicycle bike;
    public BikeRide(Bicycle bikeIn){
        this.bike = bikeIn;
    }

    public void ride(){
        for(int i=0;i<(Math.random()*20+1);i++){
            this.bike.accelerate();
        }
    }
    public void brake(){
        for(int i=0;i<(Math.random()*10+1);i++){
            this.bike.brake();
        }
    }
    public int getCurrentSpeed(){
        return bike.currentSpeed();
    }

}