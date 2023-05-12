// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            intArray.add(num.nextInt(0, 10));
        }
        System.out.println(intArray);
        Integer minimal = minimalMean(intArray);
        Integer maximal = maximalMean(intArray);
        Integer medium = mediumlMean(intArray);
        System.out.printf("Максимальное значение = %s\nМинимальное значение = %s\nСреднее значение = %s", maximal, minimal, medium);
    }
    public static Integer minimalMean(ArrayList<Integer> intArray) {
        Integer minimal = 999;
        for (Integer number : intArray) {
            if (number < minimal) {
                minimal = number;
            }
        }
        return minimal;
    }
    public static Integer maximalMean(ArrayList<Integer> intArray) {
        Integer maximal = 0;
        for (Integer number : intArray) {
            if (number > maximal){
                maximal = number;
            }
        }
        return maximal;
    }
    public static Integer mediumlMean(ArrayList<Integer> intArray) {
        double summary = 0;
        for (Integer number : intArray) {
            summary += number;
        }
        summary /= intArray.size();
        summary = Math.round(summary);
        return (int) summary;
    }
}
