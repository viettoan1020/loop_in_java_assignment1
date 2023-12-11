import java.util.Scanner;

public class Perpendicular_Triangle_Above {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter right angle edge : ");
        int rightAngleEgde = scanner.nextInt();
        for (int i = rightAngleEgde; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
