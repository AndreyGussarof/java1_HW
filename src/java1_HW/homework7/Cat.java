package java1_HW.homework7;

public class Cat {

    private String name;
    private int amountoffoodconsumed ;
    private int satiety;



    public Cat(String name,int amountoffoodconsumed ,int satiety){
        this.name = name;
        this.amountoffoodconsumed = amountoffoodconsumed;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println(" Cat " + name + " eat ");
        plate.decreasFood(amountoffoodconsumed);
    }

}
