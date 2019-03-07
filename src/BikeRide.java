import bicycles.Bicycle;

public class BikeRide {

    BikeRide(Bicycle bike){
       public void ride(){
            //randomize the ride? :)
           for(int i=0;i<5;i++){
               bike.accelerate();

           }
            for(int i=0;i<5;i++){
                bike.brake();
            }
            for(int i=0;i<5;i++){
                bike.accelerate();
            }

           bike.brake();
        }
    }
}
