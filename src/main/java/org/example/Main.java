package org.example;
public class Main {
    public static void main(String[] args) {
        /**
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
         *
         * You may assume that each input would have exactly one solution, and you may not use the same element twice.
         *
         * You can return the answer in any order.
         */
    }

    private static int[] twoSumSlidingWindow(final int[] indices, final int target) {

        for (int i = 0, x = 1; i < indices.length - 1; x ++)
            if ((indices[i] + indices[x]) == target && i != x)
                return new int[]{i, x};
            else if (x == indices.length - 1) {
                i ++;
                x = 0;
            }

        return new int[0];
    }

    public static int[] twoSumNestedLoop(int[] indices, int target) {
        for (int i = 0; i < indices.length - 1; i ++)
            for (int x = 1; x < indices.length; x ++)
                if ((indices[i] + indices[x]) == target && i != x)
                    return new int[]{i, x};

        return new int[0];
    }
}