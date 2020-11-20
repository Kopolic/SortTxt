package ru.sapteh.sort;

import ru.sapteh.Person;

import java.util.Comparator;

public class SortAge implements Comparator<Person> {
    @Override
    public int compare(Person one, Person two){
        return one.getAge() - two.getAge();
    }
}
