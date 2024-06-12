import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("напиши список имен ");
        Scanner scan = new Scanner(System.in);


        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            name.add(scan.nextLine());
        }
        System.out.println(name);


        System.out.println("напиши второй список");
        ArrayList<String> name2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            name2.add(scan.nextLine());
        }
        System.out.println(name2);


        ArrayList<String> name3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            name3.add(name.get(i));
            name3.add(name2.get(2 - i));
        }
        System.out.println(name3);



        Collections.sort(name3, Comparator.comparingInt(String::length));
        System.out.println(name3);

        }



    }
