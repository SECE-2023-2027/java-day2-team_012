import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        int colSum[] = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
            }

            total += rowSum;

            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println(rowSum);
        }

        for (int i = 0; i < n; i++)
            System.out.print(colSum[i] + " ");

        System.out.println(total);
    }
}
