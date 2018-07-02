package homeworks.lesson2.task5;

        import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        int a, b, sum;
        Scanner input = new Scanner(System.in);
        a = getA(input);
        b = getA(input);
        sum = a + b;
        System.out.println("Сума двух чисел равна: "+sum);
    }

    private static int getA(Scanner input) {
        int a;
        System.out.println("Введите число: ");
        a = input.nextInt();
        return a;
    }
}
