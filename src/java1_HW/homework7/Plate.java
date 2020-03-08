package java1_HW.homework7;

import javax.naming.Name;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food : " + food);
    }

    public boolean decreasFood(int amountoffoodconsumed) {

        if (food >= amountoffoodconsumed) {
            food -= amountoffoodconsumed;
            return true;
        } else {
            return false;
        }
    }

    public boolean addFood(int amountoffoodconsumed){
        if( amountoffoodconsumed>=0){
            food+=amountoffoodconsumed;
            return true;
        } else return false;
    }
}
