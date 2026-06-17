import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        String highName = "", highId = "";
        String lowName = "", lowId = "";
        int high = -1, low = 101;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > high) {
                high = score;
                highName = name;
                highId = id;
            }

            if (score < low) {
                low = score;
                lowName = name;
                lowId = id;
            }
        }

        System.out.println(highName + " " + highId);
        System.out.println(lowName + " " + lowId);
    }
}
