// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List <String> myList = getList();
        invertList(myList);        
    }

    // Метод для задания списка, состоящего из строк.
    private static List <String> getList () {
        Scanner scanner = new Scanner(System.in, "866");
        System.out.println("Введите строку: ");
        String myString = scanner.nextLine();

        String[] arrayOfStrings = myString.split(" ");

        for (int i = 0; i < arrayOfStrings.length; i++) System.out.println(arrayOfStrings[i]);

        List <String> listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println(listOfStrings);
        scanner.close();
        return listOfStrings;
    }

   // Метод, который переворачивает список.
    private static List <String> invertList (List <String> list) {
        List <String> invertList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) invertList.add(i, list.get(list.size() - 1 - i));
        System.out.println(invertList);
        return invertList;
    }
    
}
