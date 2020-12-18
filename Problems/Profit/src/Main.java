import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double M = scanner.nextDouble();
        double P = scanner.nextDouble();
        double K = scanner.nextDouble();

        int numberOfYears = 0;

        while (M < K) {
            M += M * P / 100;
            numberOfYears++;
        }

        System.out.println(numberOfYears);

    }
}