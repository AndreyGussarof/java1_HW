package java1_HW.homework7;

public class Cat {

    private String name;
    private boolean satiety;



    public Cat(String name){
        this.name = name;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.decreasFood(10)) {
            System.out.println(" Cat " + name + " eat ");
            satiety = true;
        } else {
            System.out.println(" Cat " + name + " eat ");
        }
    }

        public String getName() {
            return name;
        }


        public boolean isSatiety() {
            return satiety;
        }



        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", satiety=" + satiety +
                    '}';
        }


}




