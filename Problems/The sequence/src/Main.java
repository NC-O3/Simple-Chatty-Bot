import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        boolean check = true;
        int n = 0;
        int i = 1;
        while (check) {
            for (int j=0; j<i; j++) {
                if (n < index) {
                    System.out.print(i + " ");
                    n++;
                } else {
                    check = false;
                    break;
                }
            }
            i++;
        }

    }
}