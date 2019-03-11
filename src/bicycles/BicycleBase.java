package bicycles;

public abstract class BicycleBase  implements Bicycle {

    private int speed = 0;

    protected void changeSpeed(int deltaSpeed){
        if(this.speed + deltaSpeed >= 0){
        this.speed += deltaSpeed;
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
