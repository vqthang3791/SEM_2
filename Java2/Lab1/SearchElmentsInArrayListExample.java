package Java2.Lab1;

import java.util.ArrayList;
import java.util.List;

public class SearchElmentsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Does names array contain \"bob\"? : " + names.contains("Bob"));
        System.out.println("indexOf \"Steve\" :" + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\" :" + names.indexOf("Mark"));
        System.out.println("LastIndexOf \"John\": " + names.lastIndexOf("John"));
        System.out.println("LastIndexOf \"Bill\": " + names.lastIndexOf("Bill"));
    }
}

