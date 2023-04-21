import java.util.Scanner;

public class hw3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int number1 = inputInt();
        System.out.print("Введите первое знак операции (+, -, *, /): ");
        char sign = inputChar();
        System.out.print("Введите первое число: ");
        int number2 = inputInt();
        System.out.printf("Ответ: %s", calc(number1, number2, sign));
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