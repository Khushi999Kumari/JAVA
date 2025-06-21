class Bubblesort {
    static void Bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public static void main(String[] args) {
    int arr[] = { 2, 4, 8, 1, 23, 10, 3, };
    System.out.println("arr is");

    for (int i = 0; i < arr.length - 1; i++) {
        System.out.println(arr[i]);
    }
}
