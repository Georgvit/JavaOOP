package oop.lesson.three;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    private Personal subordinates = new Personal();


    public User(Personal subordinates, String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.subordinates = subordinates;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Personal getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        String fulName = this.firstName + " " + this.lastName;
        String fulNameO = o.firstName + " " + o.lastName;
        if (fulName.equals(fulNameO)) return this.age - o.age;
        return fulName.compareTo(fulNameO);
    }
}
