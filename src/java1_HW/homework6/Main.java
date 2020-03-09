package java1_HW.homework6;


import java1_HW.homework6.Animals.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 5
//CATS
        Animal[] catsArray = new Animal[3];

        catsArray[0] = new Animal("Barsik ", "white", 3, 200, 2, false);
        catsArray[1] = new Animal("Murzik", "red", 2, 300, 3, false);
        catsArray[2] = new Animal("Vasya", "grey", 1, 350, 0.2f, true);

        for (Animal animal : catsArray) {
            animal.info();
            if (animal.getRun() <= 200) {
                System.out.println(( " run : " + true));
            } else {
                System.out.println("run : " + false);
            }
            if (animal.getJump()>=2 ){
                System.out.println(( " jump : " + true));
            } else {
                System.out.println("jump : " + false);
            }
            animal.Swim();
        }

//        DOGS
                Animal[] dogsArray = new Animal[3];

        dogsArray[0] = new Animal("Tuzik ", "white", 3, 500, 5, false);
        dogsArray[1] = new Animal("Sharik", "red", 2, 600, 3, false);
        dogsArray[2] = new Animal("Juchka", "grey", 10, 200, 1f, true);

        for (Animal animal : dogsArray) {
            animal.info();
            if (animal.getRun() <= 500) {
                System.out.println(( " run : " + true));
            } else {
                System.out.println("run : " + false);
            }
            if (animal.getJump()>=1 ){
                System.out.println(( " jump : " + true));
            } else {
                System.out.println("jump : " + false);
            }
            animal.Swim();
        }



//  Задача 4
//        Cat cat = new Cat(  "Barsik " , "white" , 3 , 600,2,false);
//
//        cat.info();
//        cat.run();
//        cat.jump();
//        cat.Swim();
//
//        Dog dog = new Dog("Tuzik" , "black" , 2 , 500 ,1, true);
//        dog.info();
//        dog.run();
//        dog.jump();
//        dog.Swim();
//    }
    }
}
