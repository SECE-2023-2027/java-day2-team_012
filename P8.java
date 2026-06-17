public class LongestWord {
    public static void main(String[] args) {

        String words[] = {"cat", "flag", "green", "country", "w3resource"};

        int max = words[0].length();

        for (String word : words) {
            if (word.length() > max)
                max = word.length();
        }

        System.out.println("Longest words:");

        for (String word : words) {
            if (word.length() == max)
                System.out.println(word);
        }
    }
}
