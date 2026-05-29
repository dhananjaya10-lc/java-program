public class ReverseCharacters {
    public static void main(String[] args) {
        char[] ch = {'J', 'A', 'V', 'A'};

        System.out.println("Characters in Reverse Order:");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}