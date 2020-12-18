import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word;

        while (scanner.hasNext()) {
            word = scanner.next();
            System.out.println(word);
        }

    }
}