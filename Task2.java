/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
   
    public static void main(String[] args) {

        List <String> linkList = new LinkedList<>();
        String myStr = "one two three";
        String [] arrStrings = myStr.split(" ");
        linkList = Arrays.asList(arrStrings);
        System.out.println(linkList); 
       

        // List <Integer> linkList = new LinkedList<>();
        // int [] list = {1, 4, 5, 7, 6};
        // for (Integer temp : list) {
        //     linkList.add(temp);
        // }
        // System.out.println(linkList); 

        enqueue(linkList, "one");
        System.out.println(linkList);

        // int numberFirst = dequeue(linkList);
        // System.out.println(numberFirst);
        // System.out.println(linkList);

        // int number = first(linkList);
        // System.out.println(number);
        // System.out.println(linkList);
        }

    public static void enqueue (List <String> list, String str) {
        list.add(str);            
    }

    public static int dequeue (List <Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first (List <Integer> list) {
        int num = list.get(0);
        return num;
    }

}
