public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "wresource";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("Original String: " + str);
                System.out.println("First unique character of the above: " + i);
                break;
            }
        }
    }
}
