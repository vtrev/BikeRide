package bicycles.models;
import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    int speed = 0;
    @Override
    public void accelerate(){
       this.speed += 11;
    }

    @Override
    public void brake(){
        if(this.speed >= 4){
        this.speed -=4;
        }else {
            stop();
        }
    }
    @Override
    public int currentSpeed(){
        return this.speed;
    }

    @Override
    public void stop(){
        this.speed = 0;
    }
}
