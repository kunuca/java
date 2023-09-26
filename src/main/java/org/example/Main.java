package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        task3();

        /*Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
*/

        public class Task02 {
            public static void main(String[] args) {
                int [] nums = {3,2,2,3};
                var val = 3;
                var counter = nums.length-1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == val) {
                        while (true) {
                            if (nums[counter] == val) {
                                counter--;
                            }
                            else {
                                break;
                            }
                        }
                    }
                    var buff = nums[counter];
                    nums[counter] = nums[i];
                    nums[i] = buff;
                    counter--;
                }
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i]);
                }
            }
        }
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        public static void task3() {
            int[] arr2 = {3, 2, 2, 3, 2, 3, 2, 3};
            int val = 3;
            int left = 0;
            int right = arr2.length - 1;
            while (left <= right) {
                if (arr2[right] == val) {
                    right--;
                } else if (arr2[left] != val) {
                    left++;
                } else {
                    int temp = arr2[left];
                    arr2[left] = arr2[right];
                    arr2[right] = temp;
                }
            }
            System.out.println(Arrays.toString(arr2));
        }
    }

}