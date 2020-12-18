import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int a = 0,b = 0,c = 0;
        for (int i=0; i<index; i++) {
            int number = scanner.nextInt();
            a += number == 0 ? 1 : 0;
            b += number == 1 ? 1 : 0;
            c += number == -1 ? 1 : 0;
        }
        System.out.println(a + " " + b + " " + c);
    }
}