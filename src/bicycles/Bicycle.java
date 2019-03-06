package bicycles;

public class Bicycle {

    private int speed;

    public void setSpeed(int s){
        this.speed = s;
    }

    public void accelerate(){
        this.speed = this.speed+5;
    }

    public void brake(){
        this.speed = this.speed - 3;
    }

    public int currentSpeed(){
        return this.speed;
    }

    public void stop(){
        this.speed = 0;
    }

}
