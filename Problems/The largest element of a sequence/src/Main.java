import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximum = scanner.nextInt();
        int number = scanner.nextInt();
        while (number != 0) {
            if (number > maximum) {
                maximum = number;
            }
            number = scanner.nextInt();
        }

        System.out.println(maximum);
    }
}