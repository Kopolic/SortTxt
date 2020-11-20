package ru.sapteh.sort;

import ru.sapteh.Person;

import java.util.Comparator;

public class SortCash implements Comparator<Person> {
    @Override
    public int compare(Person one, Person two){
        return one.getCash() - two.getCash();
    }
}
