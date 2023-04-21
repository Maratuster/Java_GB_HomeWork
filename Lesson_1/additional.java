import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Дополнительно: +Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 
 * Под знаками вопросов - одна и та же цифра 
 * Пример:
 * Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
 */
public class additional {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Введите уравнение вида q + w = e, где q, w, e >= 0 \nНекоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69");
        
    }
}
