package com.hillel.suraieva.homework9;

import java.util.Arrays;

public class Copying {
    public static void main(String[] args) {
        int[] target1 = {7, 8};
        int[] target2 = new int[0];
        int[] source = {5, 4, 5, 9};
        int[] targetCopy1 = Copy(target1, source);
        int[] targetCopy2 = Copy(target2, source);

        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target2));
        System.out.println("Result(Target): " + Arrays.toString(targetCopy2));
        System.out.println();
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Target: " + Arrays.toString(target1));
        System.out.println("Result(Target): " + Arrays.toString(targetCopy1));


    }

    public static int[] Copy(int[] target, int[] source) {

        int[] targetCopy = new int[target.length + source.length];
        for (int j = 0; j < target.length; j++) {
            targetCopy[j] = target[j];
        }
        for (int i = 0; i < source.length; i++) {

            targetCopy[target.length + i] = source[i];
        }
        return targetCopy;
    }
}



