import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) Math.sqrt(scanner.nextInt());

        for (int i=1; i<=number; i++) {
            System.out.println(i*i);
        }

    }
}