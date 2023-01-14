import java.util.*;

public class Main {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String a[]) {
        int[] rand_array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            int rand_number = random.nextInt(101);
            while (rand_number % 2 != 0 || rand_number == 0) {
                rand_number = random.nextInt(101);
            }
            rand_array[i] = rand_number;
        }
        for (int x = 0; x < rand_array.length; x++) {
            System.out.print(rand_array[x] + " ");
        }
        System.out.println();

        bubbleSort(rand_array);// sorting array dengan menggunakan Bubble Sort

        System.out.println("Hasil Setelah dilakukan Sorting dengan Bubble Sort : ");
        for (int i : rand_array) {
            System.out.print(i + " ");
        }
    }
}
