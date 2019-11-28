package com.jagithub.BacktrackingExamples.algorithms.permutations;

public class GeneratePermutations {

    private int number;

    public void generate() {

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = 0;
        }
        int k = 0;

        while (k >= 0) {
            array[k] += 1;
            if(array[k] <= number) {
                if(isOk(array, k)) {
                    if (k == number - 1) {
                        display(array);
                    } else {
                        k++;
                        array[k] = 0;
                    }
                }
            } else {
                k--;
            }
        }
    }

    // Condition for proper permutation is that numbers should not repeat (must be unique)
    private boolean isOk(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            if(array[i] == array[index]) {
                return false;
            }
        }
        return true;
    }

    private void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void setNumber(int number) {
        if (number >= 2) {
            this.number = number;
        } else {
            System.out.println("Number must be greater than 2");
        }
    }
}
