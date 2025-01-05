package org.example;

public class Person {

    String firstname;
    String lastname;
    int age;
    String adress;
    int id;
    String gender;

    public  Person(){

    }
    public  Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, String adress, int id, String gender) {
        this(firstname, lastname,age);
        this.adress = adress;
        this.id = id;
        this.gender = gender;
    }

    public  String getFirstName(){
        return  this.firstname;
    }

    public  String getLastName(){
        return  this.lastname;
    }

    public  int getAge(){
        return  this.age;
    }

    public  boolean isTeen(){
        return  this.age>=13 && this.age<=19;
    }
}
