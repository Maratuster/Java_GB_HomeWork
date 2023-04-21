import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        summaryResult(num);
        System.out.println(factorial(num));

    }
    public static void summaryResult(int number) {
        int result = number;
        for (int i = 0; i < number; i++){
            result += i;
        }
        System.out.println(result);
    }
    public static long factorial(int number) {
        if (number == 1) return 1;
        return number * factorial(number-1);
    }
}
