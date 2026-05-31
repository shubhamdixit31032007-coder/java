public class SearchArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int search = 40;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element Found at Position " + (i + 1));
                break;
            }
        }
    }
}
