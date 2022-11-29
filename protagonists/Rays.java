package edu.lab3100.protagonists;

import edu.lab3100.support.EnumRays;
import edu.lab3100.support.IntRays;



public class Rays implements IntRays{

    private Background back;

    public void getplace(Background place) {
        this.back = place;
        System.out.println(EnumRays.Cosmic + " лучи достигают поверхности объекта " + place.toString());
    }
    @Override
    public void shine(Protagonist protagonist, Background background) {
        if (this.back.toString().equals(background.toString())) {
            System.out.println("Крайне жаркие " + EnumRays.Cosmic.toString()
                    + " лучи светят на персонажа " + protagonist.getname());
        }
        else {System.out.println("Неочень жаркие " + EnumRays.Normal.toString()
                    + " лучи светят на персонажа " + protagonist.getname());
        }
    }

    @Override
    public void compare() {
        System.out.println(EnumRays.Cosmic+ " лучи намного опаснее и жарче, чем " + EnumRays.Normal + " лучи");
    }
}
