package bicycles;

public class Bike extends BicycleBase {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public Bike(BicycleType bicycleType){
        this.bicycleType = bicycleType;
        this.accelerationSpeed = bicycleType.getAccelerationSpeed();
        this.brakeSpeed = bicycleType.getBrakeSpeed();
    }

    @Override
    public void accelerate(){
     this.changeSpeed(this.accelerationSpeed);
    }

    @Override
    public void brake(){
        this.changeSpeed(this.brakeSpeed);
    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }
    public int getBrakeSpeed(){
        return  this.brakeSpeed;
    }
    public BicycleType getBicycleType() {
        return this.bicycleType;
    }
}
