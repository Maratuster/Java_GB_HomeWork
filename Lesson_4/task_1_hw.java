// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.LinkedList;
import java.util.Random;

public class task_1_hw {
    public static void main(String[] args) {
        Random num = new Random();
        LinkedList<Integer> numberArray = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            numberArray.add(num.nextInt(0, 10));
        }
        System.out.println(numberArray);
        System.out.println(reverseList(numberArray));
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> someList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = someList.size()-1; i >=0; i--){
            newList.add(someList.get(i));
        }
        return newList;
    }
}
