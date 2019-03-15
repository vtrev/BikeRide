package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private List<Bicycle> bikeList = new ArrayList<Bicycle>();
    private int maxBikeIntake;

    public FunRide(int maxBikeIn){
        this.maxBikeIntake = maxBikeIn;
    }
    public String accept(Bicycle bikeIn){

        boolean canAdd = ((bikeList.size()+1) <= maxBikeIntake);
        if(canAdd){
            bikeList.add(bikeIn);
            return "Bike Accepted";
        }
        return "Bike Rejected";
    }

    public int getCountForType(BicycleType bikeTypeIn){
        int countForTypeHold = 0;
        for(Bicycle bike : bikeList){
            if (bike.getBicycleType() == bikeTypeIn){
                countForTypeHold++;
            }
        }
        return countForTypeHold;
    }
    public int getEnteredCount(){
        return this.bikeList.size();
    }
}
