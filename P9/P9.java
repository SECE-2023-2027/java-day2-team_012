import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = {20, 30, 40};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}
