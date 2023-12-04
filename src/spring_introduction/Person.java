package spring_introduction;

public class Person {
    private String surname;
    private int age;
    private Pet pet;

/*    public Person(Pet pet) {
        System.out.println("Person bean is created.");
        this.pet = pet;
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Person bean is created.");
    }
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
