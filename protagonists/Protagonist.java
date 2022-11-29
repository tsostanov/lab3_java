package edu.lab3100.protagonists;
import edu.lab3100.support.Condition;
import edu.lab3100.support.EnumRays;
import edu.lab3100.support.IntProtagonists;
import edu.lab3100.support.Place;

public class Protagonist implements IntProtagonists {
    private final String name;
    private Place back;

    public Protagonist (String name){
        this.name = name;
        System.out.println("Герой по имени " + name  + " вводится в повествование");
    }

    public void getplace(Place place){
        this.back = place;
        System.out.println(this.name + " находится на объекте " + place.toString());
    }

    public String getname(){
        return this.name;
    }

    @Override
    public void MoveAction(TargetPlace target) {
        if (back.equals(target.getback())){
        System.out.println(this.name + " идет в сторону " + target.toString() +
                " по поверхности объекта " + back.toString());}
        else{
            System.out.println(this.name + " отдыхает и никуда не идет");
        }
    }

    @Override
    public void MoveAction(TargetPlace target, Protagonist person) {
        if (this.back.equals(target.getback()) & this.back.equals(person.back)) {
            System.out.println(this.name + " идет в сторону " + target.toString() +
                    " по поверхности объекта " + this.back.toString() + " вместе с героем по имени " + person.name);
        }
        else {
            System.out.println("Крайне интересная ситуация...");
        }
    }

    @Override
    public void GuessAction(String thing) {
        System.out.println(this.name + " ничего не знает о " + thing);

    }

    @Override
    public void condition(Condition condition) {
        System.out.println(this.name + " испытывает " + condition.toString());
    }
}

