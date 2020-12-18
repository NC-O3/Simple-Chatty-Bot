import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = scanner.nextInt();
        sum += number / 2 + number % 2;

        number = scanner.nextInt();
        sum += number / 2 + number % 2;

        number = scanner.nextInt();
        sum += number / 2 + number % 2;

        System.out.println(sum);
    }
}