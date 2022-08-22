package Monday_22aug;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random();
//        The two arrays
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];

//        Setting the two arrays with random variables
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = rand.nextInt(20) +1;
        }
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = rand.nextInt(20) +1;
        }

//        Using hashset to store duplicates. Using hashset because it doesn't allow repeat values
        HashSet<Integer> duplicates = new HashSet<>();

//        Checking if the two arrays contain duplicates
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    duplicates.add(arr1[i]);
                }
            }
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Duplicates: " + duplicates);


    }
}
