import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        boolean ok = input.startsWith("J");
        boolean ok1 = input.startsWith("j");

        if (ok || ok1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}