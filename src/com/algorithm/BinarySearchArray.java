package com.algorithm;

import java.util.Arrays;

public class BinarySearchArray {

public static void main(String[] args)
{
    // Declaring an integer array
    int arr[] = { 10, 20, 15, 22, 35 };

    // Sorting the above array
    // using sort() method od Arrays class
    Arrays.sort(arr);

    int key = 23;
    int res = Arrays.binarySearch(arr, key);

    if (res >= 0)
        System.out.println(
            key + " found at index = " + res);
    else
        System.out.println(key + " Not found");

    key = 35;
    res = Arrays.binarySearch(arr, key);
    if (res >= 0)
        System.out.println(
            key + " found at index = " + res);
    else
        System.out.println(key + " Not found");
}
}

