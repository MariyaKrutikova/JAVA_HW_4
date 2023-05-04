/*Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 - + => 5 1 + => 6 */

import java.util.Scanner;
import java.util.Stack;

// import javax.smartcardio.Card;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные для вычисления: ");
        String reverseEntry  = scanner.nextLine();
        // System.out.println(reverseEntry);  
        calculator(reverseEntry);
        scanner.close();
    }

    private static int calculator (String reverseEntry)  {
        Stack <Integer> calcStack = new Stack<>();
        int a = 0, b = 0;
        int result = 0;
       
        for (int i = 0; i < reverseEntry.length(); i++) {
                char simbol = reverseEntry.charAt(i);
                if (Character.isDigit(simbol)) {
                    calcStack.push(Character.getNumericValue(simbol));
                }
                else if (simbol == '+') {
                    a = calcStack.pop();
                    b = calcStack.pop();
                    result = a + b;
                    calcStack.push(result);
                }
                else if (simbol == '-') {
                    a = calcStack.pop();
                    b = calcStack.pop();
                    result = b - a;
                    calcStack.push(result);
                }
                else if (simbol == '*') {
                    a = calcStack.pop();
                    b = calcStack.pop();
                    result = a * b;
                    calcStack.push(result); 
                }
                else if (simbol == '/') {
                    a = calcStack.pop();
                    b = calcStack.pop();
                    if (b != 0) {
                        result = a / b;
                        calcStack.push(result);
                    }
                    else { 
                    System.out.println("Ошибка! Деление на ноль!");
                    }
                    
                }
            }
     
    
    if (calcStack.size() == 1) System.out.printf("Результат вычисления = %s", result);
    else System.out.println("Что-то пошло не так. В стэке больше одного числа.");

    return result;
    }
}

   
