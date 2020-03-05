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
    public  void decreasFood(int amountoffoodconsumed){

            food -= amountoffoodconsumed;


    if (food < amountoffoodconsumed) {
        System.out.println("В тарелке недостаточно еды");
//        break;

} else  {
        System.out.println("В тарелке досаточно еды");
        System.out.println("satiety = " + true);
    }
    }
}
