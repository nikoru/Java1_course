package home_work_2;

public class home_work_2 {

    public static void main(String[] args) {
        System.out.println("--task 1---");
        int[] arr1 = {1, 0, 0, 0, 1, 0, 1};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) arr1[i] = 1;
            else arr1[i] = 0;
            System.out.println(arr1[i]);
        }
        System.out.println("--task 2---");
        int[] arr2 = new int[8];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i*3;
            System.out.println(arr2[i]);
        }

        System.out.println("--task 3---");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6){
                arr3[i] = arr3[i] * 2;
            }
            System.out.println(arr3[i]);
        }

        System.out.println("--task 4---");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i <arr4.length ; i++) arr4[i][i] = 1;

        System.out.println("--task 5 test---");
        findMaxInArray(arr3);

        System.out.println("--task 6 test---");
        int[] arr6 = {1, 2, 0, 0, 3};
        boolean isBalance = checkBalance(arr6);
        System.out.println(isBalance);

        System.out.println("--task 7 test---");
        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr7.length ; i++) {
            System.out.print(arr7[i] + " ");
        }
        System.out.println(" ");

        shiftArrayForN(arr7, -2);

        for (int i = 0; i < arr7.length ; i++) {
            System.out.print(arr7[i] + " ");
        }
    }

    public static void findMaxInArray(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]) max = arr[i];
        }
        System.out.println("Max value in array - " + max);
    }

    public static void shiftArrayForN(int[] arr, int n){
        int arr_from_change;
        int arr_cur_value;

        if (n>=0) {
            for (int j = 0; j < n ; j++ ) {
                arr_from_change = arr[(arr.length - 1)];  // to save the last array element to first one
                for (int i = 0; i < arr.length; i++) { // shift for 1 element to right starting from first element
                    arr_cur_value = arr[i];
                    arr[i] = arr_from_change;
                    arr_from_change = arr_cur_value;

                }
            }
        } else {
            for (int j = 0; j > n; j--) {
                arr_from_change = arr[0]; // to save the first array element to last one
                for (int i = (arr.length - 1); i >= 0; i--) { // shift for 1 element to left starting from last element
                    arr_cur_value = arr[i];
                    arr[i] = arr_from_change;
                    arr_from_change = arr_cur_value;
                }
            }
        }

        }

    public static boolean checkBalance(int[] arr) {
        int sum_r = 0;
        int sum_l = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < i; j++)  sum_l +=arr[j];
            for (int j = i; j < arr.length; j++)  sum_r +=arr[j];

            if (sum_l == sum_r) return true;
            sum_r = 0;
            sum_l = 0;
        }
        return false;
    }

    }

