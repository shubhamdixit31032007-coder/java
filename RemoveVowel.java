public class RemoveVowel {
    public static void main(String[] args) {

        String str = "ENGINEERING";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U')
                continue;

            System.out.print(ch + " ");
        }
    }
}