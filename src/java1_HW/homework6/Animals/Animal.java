package java1_HW.homework6.Animals;

public class Animal {
     protected String name;
     protected String color;
     protected int age;
     protected int run;
     protected float jump;
     protected boolean swim;

    public Animal(String name, String color, int age , int run,float jump,boolean swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.jump =  jump;
        this.swim = swim;
    }

    public void info(){
        System.out.println(name + " " + color + " " + age );
    }

    public void run(){
        System.out.println(name + " run " + run);
    }

    public void jump(){
        System.out.println(name + " jump " + jump);
    }
    public void Swim (){
        System.out.println(" swim : " + swim);
    }

    public String getName() {
        return name;

    }

    public int getRun() {
        return run;

    }

    public float getJump() {
        return jump;
    }

    public boolean isSwim() {
        return swim;
    }
}
