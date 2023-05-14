/*
 2) Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

Пример:
[1, 2, 3, 4, 5, 6, 7]
spisok.enqueue(8)
[1, 2, 3, 4, 5, 6, 7,8]
spisok.dequeue
1
[2, 3, 4, 5, 6, 7,8]
spisok.first()
2
[2, 3, 4, 5, 6, 7,8]
 */

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task_2_hw {
    public static void main(String[] args) {
        clearScreen();
        
        Random num = new Random();
        LinkedList<Integer> numArray = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            numArray.add(num.nextInt(0, 10));
        }
        System.out.println(numArray);
        System.out.println("Проверяем метод enqueue(). Введите число, которое надо поместить в конец очереди:");
        numArray.enqueue(input());
    }
    public static Integer input() {
        Scanner input = new Scanner(System.in);
        Integer num = Integer.parseInt(input.nextLine());
        input.close();
        return (Integer)num;

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
    }
}