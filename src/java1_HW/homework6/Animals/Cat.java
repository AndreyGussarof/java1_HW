package java1_HW.homework6.Animals;

public class Cat extends Animal{

   boolean swim = false;

    public Cat(String name, String color, int age, int run , float jump,boolean swim) {
    super(name,color,age,run,jump,swim);

    }

    @Override
    public void Swim() {
        System.out.println(name + "swim : " + swim);
    }
}
