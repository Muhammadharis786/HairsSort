
public class HarisSorting {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Print output to the console
        int arr[] = { 3, 24, 5, 1, 8, 11, 2, 5 };
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];

                    arr[i] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
