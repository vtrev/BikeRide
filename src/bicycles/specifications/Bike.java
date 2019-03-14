package bicycles.specifications;

import bicycles.BicycleType;

public class Bike {
    private int accelerationSpeed;
    private int brakeSpeed;
    private BicycleType bicycleType;

    public Bike(BicycleType bicycleType){
        this.bicycleType = bicycleType;
        this.accelerationSpeed = bicycleType.getAccelerationSpeed();
        this.brakeSpeed = bicycleType.getBrakeSpeed();
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
