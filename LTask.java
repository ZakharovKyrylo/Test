package Lection;

import java.io.*;

public class LTask {

    public static void main(String[] args) throws Exception {
        Reader reader = new Reader();
        String file = Reader.reader("data.txt");
//        System.out.println(file);
//        System.out.println(StringToPerson.stringToPerson(file));
        StringToPerson.stringToPerson(file);

    }
}

class Reader {
    public static String reader(String fileName) throws Exception {
        FileReader fileReader = new FileReader(fileName);
        String s = new String();
        if (fileReader.ready()) {
            char[] chars = new char[1000];
            fileReader.read(chars);
            s = new String(chars);
        }
        return s;
    }
}

class StringToPerson {
    public static void stringToPerson(String file) {
        Person[] persons = new Person[10];
        for (int i = 0; file.length() >0 ; i++) {
            int lengthName = file.indexOf(',');  // поиск имени
            if (lengthName<0) break;
            String name = file.substring(0, lengthName);
            file = file.substring(lengthName + 2);

            int lengthAdge = file.indexOf(','); // поиск возраста
            String age = file.substring(0, lengthAdge);
            int ageInt = Integer.parseInt(age);
            file = file.substring(lengthAdge + 1);

            int lengthGender = 3; // посик пола
            String gender = file.substring( 1, lengthGender-1);
            file = file.substring(lengthGender+1);
            if((gender.equalsIgnoreCase("M"))||(gender.equalsIgnoreCase("F"))) ;
            else continue;
            if(ageInt<0) continue;
            persons[i] = new Person(name, ageInt, gender);
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i]==null) continue;
            System.out.println(persons[i].toString());
        }

    }
}

