import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class seminar4 {
    public static void main(String[] args) {
        /*
         * 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
         * 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
         * Сравните с предыдущим.
         */
        // --------------- Начало рабочего кода ----------------------
        clearScreen();
        // 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
        // 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
        // Сравните с предыдущим.
        long statTime1 = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<>();
        // Random rnd = new Random();
        Integer arrSize = 5;// rnd.nextInt(10, 50);

        // Double averageValue = 0.0;

        for (int i = 0; i < arrSize; i++) {
            arr.add(0, i);// (rnd.nextInt(50));
            // LOGGER.info("arr[" + i + "] = " + arr.get(i));

        }
        long endTime1 = System.currentTimeMillis() - statTime1;
        long statTime2 = System.currentTimeMillis();
        LinkedList<Integer> arr2 = new LinkedList<>();
        for (int i = 0; i < arrSize; i++) {
            arr2.add(0, i);// (rnd.nextInt(50));
            // LOGGER.info("arr[" + i + "] = " + arr.get(i));

        }
        long endTime2 = System.currentTimeMillis() - statTime2;
        System.out.println("Время выполнения через ArrayList = " + endTime1);
        System.out.println("Время выполнения через LinkedList = " + endTime2);

        // --------------- Окончание рабочего кода ----------------------
        /*
         Реализовать консольное приложение, которое:

        1. Принимает от пользователя строку вида
        text
        1. Нужно сохранить text в связный список.
        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка
        Цикл пока не введено stop

        asd
        [asd]
        sdf
        [asd,sdf]
        qwe
        [asd,sdf,qwe]
        print~2
        sdf
        [asd,qwe]
        print~2
        qwe
        [asd]
        */
        // Scanner sc = new Scanner(System.in);
        // LinkedList<String> list = new LinkedList<>();

        // boolean stop = false;
        // String line = "";
        // String ind = "";
        // int i = 0;
        // while (!stop) {
        //     line = sc.nextLine();
        //     if (line.equals("stop")) {
        //         stop = true;
        //     } else {
        //         if (line.length() > 6 && line.subSequence(0, 6).equals("print~")) {
        //             ind = line.substring(6, line.length());
        //             i = Integer.parseInt(ind);
        //             System.out.println(list.get(i-1));
        //             list.remove(i-1);
        //             System.out.println(list);

        //         } else {
        //             list.add(line);
        //             System.out.println(list);
        //         }
        //     }

        // }

        /***************************************************************/
        Scanner sc = new Scanner(System.in);
        Deque<String> list = new LinkedList<>();

        boolean stop = false;
        String line = "";
        while (!stop) {
            line = sc.nextLine();
            if (line.equals("stop")) {
                stop = true;
            } else {
                if (line.equals("print")) {
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                } else {
                    list.push(line);
                }
            }
            
        }
        sc.close();

    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
    }
}
