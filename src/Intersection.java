import java.util.*;

/*
A function that returns the intersection of two arrays.
The intersection is a third array that contains all the values
contained in the first two arrays. The time complexity should be O(N).

Author: Jeremy Aubrey
Date: 12/22/2021
Purpose: Practice implementing HashMaps for increasing efficiency
 */

public class Intersection {

    public static void main(String[] args) {
        //Arrays to compare
        int[] arr1 = {1, 2, 3, 4, 5, 9, 10, 20};
        int[] arr2 = {0, 2, 4, 6, 8, 20};

        //Intersection of arrays
        ArrayList<Integer> intersection = getIntersection(arr1, arr2);

        //Display results
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Intersection: " + intersection.toString());
    }

    public static ArrayList<Integer> getIntersection(int[] arr1, int[] arr2) {
        //Arraylist to store the intersection
        ArrayList<Integer> intersection = new ArrayList<Integer>();

        //Determine larger array and smaller array
        int[] largerArr = arr1.length >= arr2.length ? arr1 : arr2;
        int[] smallerArr = arr1 == largerArr ? arr2 : arr1;

        //Hashmap to store larger array values
        HashMap<Integer, Boolean> hashmap = new HashMap();

        //Store values from larger array in Hashmap
        for (int i : largerArr) {
            hashmap.put(i, true);
        }

        //Check values from second array against Hashmap
        for (int j : smallerArr) {
            //If Hashmap contains element add to intersection
            if (hashmap.containsKey(j)) {
                intersection.add(j);
            }
        }

        return intersection;
    }
}
