import java.util.*;

/*
A function that returns the intersection of two arrays.
The intersection is a third array that contains all the values
contained in the first two arrays. The time complexity is O(N).

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

        //Hashmap to store the elements of the first array
        HashMap<Integer, Boolean> hashmap = new HashMap();

        //Store elements from first array in Hashmap as keys
        for (int i : arr1) {
            hashmap.put(i, true);
        }

        //Check elements from second array against Hashmap keys
        for (int j : arr2) {
            //If Hashmap contains element (key) add to intersection
            if (hashmap.containsKey(j)) {
                intersection.add(j);
            }
        }

        return intersection;
    }
}
