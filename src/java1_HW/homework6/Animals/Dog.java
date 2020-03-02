package java1_HW.homework6.Animals;

public class Dog extends Animal{

    boolean swim = true;
    int swimlong = 10;

    public Dog(String name, String color, int age, int run , int jump , boolean swim ){
        super(name , color , age , run , jump , swim );

    }

    @Override
    public void Swim() {
        System.out.println(name + " swim : " + swim + " " + swimlong+ " M ");
    }
}
