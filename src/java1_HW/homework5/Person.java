package java1_HW.homework5;

public class Person {
     String name;
     String position;
     String email;
     long phone;
     int salary;
     int age;

    public Person(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }
}
