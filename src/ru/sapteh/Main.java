package ru.sapteh;

import ru.sapteh.sort.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileNameRead = "list.txt";
        String fileNameInput = "sortList.txt";
        List<Person> personList = new ArrayList<>();
        //create file
        File file = new File(fileNameInput);
        if(file.createNewFile()){
            System.out.println("Файл создан");
        }else System.out.println("Файл существует");
        //read file
        try(BufferedReader read = new BufferedReader(new FileReader(fileNameRead))){
            while (read.ready()){
                Person person = readFile(read.readLine());
                personList.add(person);
            }
        }
        //select sort
        personList.sort(new SortLastName());
//        personList.sort(new SortFirstName());
//        personList.sort(new SortPatronymic());
        //personList.sort(new SortAge());
//        personList.sort(new SortCash());
        //write
        try(FileWriter write = new FileWriter(file)){
            for (Person person : personList)
            write.write(String.valueOf(person) + "\n");
        }
    }
    public static Person readFile(String readLine){
        String[] str = readLine.split(" ");
        String lastName = str[0];
        String firstName = str[1];
        String patronymic = str[2];
        int age = Integer.parseInt(str[3]);
        int cash = Integer.parseInt(str[4]);
        return new Person(lastName,firstName,patronymic,age,cash);
    }
}
