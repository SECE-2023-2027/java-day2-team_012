import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input month: ");
        int month = sc.nextInt();

        System.out.print("Input date: ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(2004, month, day);

        DayOfWeek d = date.getDayOfWeek();

        System.out.println(d);
    }
}
