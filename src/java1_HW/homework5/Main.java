package java1_HW.homework5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Person person1 = new Person(" Иван Иванов", " electrician", "Ivanov_I@mail.ru", +79211000001l, 100000, 30);
//        Person person2 = new Person(" Андрей Петров", " electrician", "Petrov@mail.ru", +79211000002l, 100000, 30);
//        Person person3 = new Person(" Михаил Смирнов", " Engineer", "Smirnov@mail.ru", +79211000003l, 110000, 35);
//        Person person4 = new Person(" Игорь Степанов ", " Accountant", "Stepanov@mail.ru", +79211000004l, 110000, 41);
//        Person person5 = new Person(" Пётр Кузнецов", " Director", "Kuznetsov@mail.ru", +79211000000l, 120000, 45);

        Person[] persArray = new Person[5];
        persArray[0] = new Person(" Иван Иванов", " electrician", "Ivanov_I@mail.ru", +79211000001l, 100000, 30);
        persArray[1] = new Person(" Андрей Петров", " electrician", "Petrov@mail.ru", +79211000002l, 100000, 30);
        persArray[2] = new Person(" Михаил Смирнов", " Engineer", "Smirnov@mail.ru", +79211000003l, 1100000, 35);
        persArray[3] = new Person(" Игорь Степанов", " Accountant", "Stepanov@mail.ru", +79211000004l, 1100000, 41);
        persArray[4] = new Person(" Пётр Кузнецов", " Director", "Kuznetsov@mail.ru", +79211000000l, 120000, 45);
// iter for ich
        for (Person person : persArray) {
            if (person.getAge() >= 40) {
//                System.out.println(Arrays.toString(persArray));
                person.info();
            }
        }
    }
//        person1.info();
//        person2.info();
//        person3.info();
//        person4.info();
//        person5.info();
}



