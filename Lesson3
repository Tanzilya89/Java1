package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr7 = {1, 1, 2, 2,};
        System.out.println("Задача1: ");
        massiv1(arr1);
        System.out.println("\nЗадача2: ");
        massiv2(100);
        System.out.println("\nЗадача3: ");
        massiv3(arr3);
        System.out.println("\nЗадача4: ");
        massiv4();
        System.out.println("\nЗадача5: ");
        massiv5(5, 1);
        System.out.println("\nЗадача6: ");
        massiv6(arr6);
        System.out.println("\nЗадача7: ");
        System.out.println(massiv7(arr7));

    }


    public static void massiv1(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0) {
                arr[x] = 1;
            } else {
                arr[x] = 0;
            }
            System.out.println(arr[x] + "");
        }
    }

    public static void massiv2(int size) {
        int[] arr = new int[size];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = x +1;
            System.out.println(arr[x] + "");
        }
    }

    public static void massiv3(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] < 6) {
                arr[x] = arr[x] * 2;
            }
            System.out.println(arr[x] + "");
        }
    }

    public static void massiv4() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int x = 0; x < 3; x++) {
            for (int c = 0; c < 3; c++) {
                if (x == c) {
                    arr[x][c] = 1;
                }
                System.out.println(arr[x][c] + "");
            }
            System.out.println();
        }
    }


        public static void massiv5(int len, int initialValue) {
            int[] arr = new int[len];
            for (int x = 0; x < len;x++) {
                arr[x] = initialValue;
                System.out.println("[" + x + "]" + arr[x] + "");
            }
        }
        public static void massiv6( int[] arr) {
            int max = arr[0];
            int min = arr[0];

            for (int x = 0; x < arr.length; x++) {
                if (arr[x] > max) {
                    max = arr[x];
                }
            }
            for (int x = 0; x < arr.length; x++) {
                if (arr[x] < min) {
                    min = arr[x];

                }
            }
            System.out.println(max);
            System.out.println(min);
        }


    public static boolean massiv7 (int[] arr) {

        int rightSum = 0;
        int leftSum = 0;

        for (int x = 0;x < arr.length; x++) {
            rightSum += arr[x];
        }
        for (int x = 0;x < arr.length; x++) {
            leftSum += arr[x];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }


}
