package bicycles.rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import java.util.ArrayList;
import java.util.HashMap;

public class FunRide {

    private ArrayList<Bicycle> bikeList= new ArrayList<Bicycle>();
    HashMap<String,Integer> bikeTypeMap = new HashMap<String,Integer>();
    private int currentBikeCount = 0;
    private int maxBikeIntake = 0;

    public FunRide(int maxBikeIn){
        this.maxBikeIntake = maxBikeIn;
    }
    public String accept(Bicycle bikeIn){
        boolean canAdd = ((currentBikeCount+1) <= maxBikeIntake);
        if(canAdd){
            bikeList.add(bikeIn);
            currentBikeCount++;
            String bikeTypeString = bikeIn.getBicycleType().toString();
            if(bikeTypeMap.containsKey(bikeTypeString)){
                int currentBikeCountForType = bikeTypeMap.get(bikeTypeString);
                bikeTypeMap.put(bikeTypeString,currentBikeCountForType+1);
            }else {
                bikeTypeMap.put(bikeTypeString,1);
            }
            return "Bike Accepted";
        }
        return "Bike Rejected";
    }

    public int getCountForType(BicycleType bikeTypeIn){
        return bikeTypeMap.get(bikeTypeIn.toString());
    }

    public int getEnteredCount(){
        return this.currentBikeCount;
    }

}
