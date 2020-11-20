package ru.sapteh.sort;

import ru.sapteh.Person;

import java.util.Comparator;

public class SortLastName implements Comparator<Person> {
    @Override
    public int compare(Person one, Person two){
        return one.getLastName().compareTo(two.getLastName());
    }
}
