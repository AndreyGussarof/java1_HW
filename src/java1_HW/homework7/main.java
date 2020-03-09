package java1_HW.homework7;

public class main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat(" Murzik1 "),
                new Cat(" Murzik2 "),
                new Cat(" Murzik3 "),
                new Cat(" Murzik4 "),
                new Cat(" Murzik5 "),
        }
        ;


        Plate plate = new Plate(35);

        for (Cat cat : cats) {
        cat.eat(plate);
        }
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
