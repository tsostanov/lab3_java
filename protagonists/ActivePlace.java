package edu.lab3100.protagonists;

import edu.lab3100.support.Place;

public class ActivePlace extends Place {

    public ActivePlace(String name) {
        super(name);
    }
    public void sunrise(Protagonist protagonist, Background background){
        System.out.println("Солнце светит очень ярко");
        Rays rays = new Rays();
        rays.getplace(background);
        rays.shine(protagonist, background);
    }
    public void compare(){
        Rays rays = new Rays();
        rays.compare();
    }
}
