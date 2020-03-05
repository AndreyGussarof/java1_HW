package java1_HW.homework7;

public class main {
    public static void main(String[] args) {

        Cat cat1 = new Cat(" Murzik1 ", 10 , 15 );
        Cat cat2 = new Cat(" Murzik2 ",  15, 20 );
        Cat cat3 = new Cat(" Murzik3 ",  15, 20 );
        Cat cat4 = new Cat(" Murzik4 ", 30 , 15 );
        Cat cat5 = new Cat(" Murzik5 ",  20, 20 );
        Cat cat6 = new Cat(" Murzik6 ",  25, 20 );

        Plate plate = new Plate(100);

        cat1.eat(plate);
        plate.info();

        cat2.eat(plate);
        plate.info();

        cat3.eat(plate);
        plate.info();

        cat4.eat(plate);
        plate.info();

        cat5.eat(plate);
        plate.info();

        cat6.eat(plate);
        plate.info();


    }

}
