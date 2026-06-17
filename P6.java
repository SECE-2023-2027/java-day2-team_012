import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 6, 2};
        int value = 6;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[count++] = arr[i];
            }
        }

        System.out.println("Length of new array = " + count);
    }
}
