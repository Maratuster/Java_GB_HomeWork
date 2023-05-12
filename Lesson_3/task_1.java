// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            intArray.add(num.nextInt(0, 10));
        }
        System.out.println(intArray);
        for (int i = intArray.size()-1; i >= 0; i--) {
            if (intArray.get(i) % 2 == 0){
                intArray.remove(i);
            }
        }
        System.out.println(intArray);
    }
}
