public class Exercise1 {

    // Valid field names
    int studentAge;
    String firstName;
    double accountBalance;

    // Invalid field names (uncomment one at a time to test)

    // int 2age;           // Error: field name cannot start with a number
    // String first name;  // Error: field name cannot contain spaces
    // double total-cost;  // Error: field name cannot contain hyphens
    // int class;          // Error: 'class' is a reserved keyword
    // String @email;      // Error: illegal character '@'

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        obj.studentAge = 20;
        obj.firstName = "John";
        obj.accountBalance = 1500.50;

        System.out.println("Age: " + obj.studentAge);
        System.out.println("Name: " + obj.firstName);
        System.out.println("Balance: " + obj.accountBalance);
    }
}