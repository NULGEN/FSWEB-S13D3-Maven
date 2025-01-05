package org.example;

public class Main {
    public static void main(String[] args) {


        Person person= new Person("John","Doe",20);
        Person person1 = new Person("Jane","Doe",15, "Istanbul", 11,"Female");

        System.out.println("Firstname: "+ person.getFirstName());
        System.out.println("Lastname: "+ person.getLastName());
        System.out.println("Age: "+ person.getAge());
        System.out.println("IsTeen: "+ person.isTeen());


        System.out.println("Firstname: "+ person1.getFirstName());
        System.out.println("Lastname: "+ person1.getLastName());
        System.out.println("Age: "+ person1.getAge());
        System.out.println("IsTeen: "+ person1.isTeen());


        Wall wall = new Wall(5,4);
        System.out.println("area= "+ wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= "+ wall.getWidth());
        System.out.println("height= "+ wall.getHeight());
        System.out.println("area= "+ wall.getArea());





    }
}
