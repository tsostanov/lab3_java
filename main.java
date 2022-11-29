package edu.lab3100;

import edu.lab3100.protagonists.*;
import edu.lab3100.support.Condition;
import edu.lab3100.support.EnumRays;

public class main {
    public static void main(String[] args) {
        Background moon = new Background("Луна");
        TargetPlace pyramid = new TargetPlace("Пирамида");
        pyramid.getplace(moon);
        MinorPersons road = new MinorPersons("Дорога", moon);
        road.description("кажется близкой, но это не так");
        MinorPersons air = new MinorPersons("Воздух", moon);
        air.description("почти полностью отсутствует");
        Protagonist Neznaika = new Protagonist("Незнайка");
        Neznaika.getplace(moon);
        Protagonist Ponsik = new Protagonist("Пончик");
        Ponsik.getplace(moon);
        Neznaika.MoveAction(pyramid);
        Ponsik.MoveAction(pyramid, Neznaika);
        ActivePlace sun = new ActivePlace("Солнце");
        sun.sunrise(Neznaika, moon);
        sun.sunrise(Ponsik, moon);
        sun.compare();
        Neznaika.condition(Condition.Hot);
        Ponsik.condition(Condition.Hot);
        MinorPersons sidepersons = new MinorPersons("Фуксия и Селодочка");
        sidepersons.description("рассказывали Незнайке о опасности космических лучей");
        Neznaika.GuessAction(EnumRays.Cosmic + " лучи");
    }
}
