//package bicycles.specifications;
//
//import bicycles.BicycleBase;
//import bicycles.BicycleType;
//
//public class BicycleFromSpec extends BicycleBase {
//
//    private BicycleSpecification bikeSpecs;
//    public BicycleFromSpec(BicycleSpecification bikeSpecs){
//        this.bikeSpecs = bikeSpecs;
//    }
//    @Override
//    public void accelerate() {
//
//    this.changeSpeed(bikeSpecs.getAccelerationSpeed());
//    }
//    @Override
//    public void brake(){
//    this.changeSpeed(bikeSpecs.getBrakeSpeed());
//    }
//
//
//    @Override
//    public BicycleType getBicycleType(){
//        return bikeSpecs.getBicycleType();
//    }
//}
