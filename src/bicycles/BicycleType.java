package bicycles;
public enum BicycleType {
        RoadBike(11,4),
        MountainBike(5,3),
        Tandem(12,7);

        private int accelerationSpeed;
        private int brakeSpeed;

        public int getAccelerationSpeed() {
                return this.accelerationSpeed;
        }

        public int getBrakeSpeed() {
                return this.brakeSpeed;
        }

        private BicycleType(int accelerationSpeed, int brakeSpeed){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        }



}



