import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flight = scanner.nextInt();
        int oneNightHotel = scanner.nextInt();

        System.out.println(duration*foodPerDay + flight*2 + (duration - 1)*oneNightHotel);
    }
}