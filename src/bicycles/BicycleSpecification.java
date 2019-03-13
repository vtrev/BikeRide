package bicycles;

public class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;


    public BicycleSpecification(int accelerationSpeed,int brakeSpeed, BicycleType bicycleType){
        this.bicycleType = bicycleType;
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
    }

    public int getAccelerationSpeed(){
        return this.accelerationSpeed;
    }

    public int getBrakeSpeed(){
        return  -this.brakeSpeed;
    }
    public BicycleType getBicycleType() {
        return this.bicycleType;
    }
}
