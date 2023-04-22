/*
Дополнительно. 
К калькулятору из предыдущего дз добавить логирование.
Пример:
1 + 3 = 4
4 + 3 = 7
 */

package Java_GB_HomeWork.Lesson_2;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class additional {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int number1 = inputInt();
        System.out.print("Введите первое знак операции (+, -, *, /): ");
        char sign = inputChar();
        System.out.print("Введите первое число: ");
        int number2 = inputInt();
        System.out.printf("Ответ: %s", calc(number1, number2, sign));
        try(FileWriter writer = new FileWriter("logCalc.txt", true)){
            StringBuilder logRow = new StringBuilder();
            logRow.append(number1).append(sign).append(number2).append("=").append(calc(number1, number2, sign));
            writer.write("Логирование калькулятора:\n");
            writer.write(logRow.toString());
            writer.append('\n');
            writer.flush();
            }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static int calc(int num1, int num2, char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num1 == 0) System.out.println("На ноль делить нельзя!");
                else result = num1/num2;
                break;
            default:
                break;
        }
        return result;
    }

    public static int inputInt(){
        int result = input.nextInt();
        return result;
    }
    
    public static char inputChar(){
        char result = input.next().charAt(0);
        return result;
    }
}
