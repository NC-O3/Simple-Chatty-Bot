import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();
        int sum = 0;
        int number;

        for (int i=0; i<index; i++) {
            number = scanner.nextInt();
            sum += number % 6 == 0 ? number : 0;
        }

        System.out.println(sum);

    }
}