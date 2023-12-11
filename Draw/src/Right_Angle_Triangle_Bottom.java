import java.util.Scanner;

public class Right_Angle_Triangle_Bottom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the right angle edge: ");
        int rightAngleEdge = scanner.nextInt();
        for (int i = 0 ; i < rightAngleEdge; i++) {
            for (int j = 0 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
