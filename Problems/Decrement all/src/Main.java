import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        number1--;
        number2--;
        number3--;
        number4--;

        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        System.out.print(number3 + " ");
        System.out.print(number4 + " ");

    }
}