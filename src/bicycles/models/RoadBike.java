package bicycles.models;

import bicycles.Bicycle;

public class RoadBike implements Bicycle {
    int speed =0;

    @Override
    public void accelerate(){
        this.speed += 5;
    }

    @Override
    public void brake(){
        if(this.speed >= 3){
            this.speed -=3;
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
