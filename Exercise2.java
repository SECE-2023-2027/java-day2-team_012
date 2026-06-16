public class Exercise2 {

    // Fields (instance variables) are not explicitly initialized
    int number;
    double price;
    boolean status;
    String name;

    public void display() {
        // Printing uninitialized fields
        System.out.println("number = " + number);
        System.out.println("price = " + price);
        System.out.println("status = " + status);
        System.out.println("name = " + name);

        // Local variable
        int localVar;

        // Uncomment the line below to see the compiler error
        // System.out.println("localVar = " + localVar);
    }

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.display();
    }
}