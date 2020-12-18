import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = number%10 + number%100/10 + number/100;

        System.out.println(sum);
    }
}