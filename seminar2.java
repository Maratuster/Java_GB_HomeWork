package Java_GB_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// import myJavaLibrary.*;

public class seminar2 {
    public static void main(String[] args) {
        clearScreen();
        /*
        Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
        */
        
        Random num = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            intArray.add(num.nextInt(0, 10));
        }
        System.out.println(intArray);
        intArray.sort(null);
        System.out.println(intArray); 
        
        /***************************************************************/
        /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
        */
        final int n = 10;
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        Random rnd = new Random();
        ArrayList<String> plntList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            plntList.add(planets[rnd.nextInt(planets.length)]);
        }
       System.out.println(plntList);

        long time = System.nanoTime();
        int count = 0;
        for (String elem : planets) {
            for (String elem2 : plntList) {
                if (elem.equals(elem2)) count++;
            }
            if (count != 0)
            System.out.printf("%s: %d \n", elem, count);
            count = 0;
        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time / 1_000_000.0);
       
        long time1 = System.nanoTime();
        int count1 = 1;
        plntList.sort(null);
        for (int i = 1; i < plntList.size(); i++) {
            if (plntList.get(i).equals(plntList.get(i-1))) {
                count1++;
            }
            else {
                System.out.printf("%s: %d \n", plntList.get(i-1), count1);
                count1 = 1;
            }
        }
        System.out.printf("%s: %d \n", plntList.get(plntList.size()-1), count1);
        time1 = System.nanoTime() - time1;
        System.out.printf("Elapsed %,9.3f ms\n", time1 / 1_000_000.0);

        /******************************************************************************/

        /*
         Создать ArrayList. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
         */

         ArrayList<Object> arr = new ArrayList<>(Arrays.asList("null", 23, 51, "juk", 1, "lol", "dawn", 9));         
         System.out.println(arr);
         for (int i = arr.size()-1; i >= 0; i--) {
                if (arr.get(i) instanceof Integer){
                    arr.remove(i);
                }
                System.out.println(arr);
            }
    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
    }
    /* */
}
