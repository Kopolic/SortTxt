package ru.sapteh;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final int age;
    private final int cash;
    public Person (String lastName, String firstName, String patronymic, int age, int cash){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
        this.cash = cash;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getAge() {
        return age;
    }
    public int getCash() {
        return cash;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", getLastName(), getFirstName(), getPatronymic(), getAge(), getCash());
    }
}
