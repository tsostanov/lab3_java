package edu.lab3100.protagonists;
import edu.lab3100.support.Place;

public class TargetPlace extends Place {

    private Place back;
    public TargetPlace(String s) {
        super(s);
    }

    public void getplace(Place place){
        this.back = place;
        System.out.println(this.toString() + " располагается на объекте " + place.toString());
    }
    public Place getback(){
        return this.back;
    }
}
