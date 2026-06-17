public class SameFirstLast {
    public static void main(String[] args) {

        int arr[] = {50, -20, 0, 30, 40, 60, 10};

        if (arr.length >= 2 && arr[0] == arr[arr.length - 1])
            System.out.println(true);
        else
            System.out.println(false);
    }
}
