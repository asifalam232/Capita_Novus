package Monday_22aug;
import java.util.*;

public class MaxAndMin {

    public static void main(String[] args) {
//        An array that will contain the random numbers
        int [] arr = new int [5];
        Random rand = new Random();

//        Hashset that keeps track of the used numbers
        HashSet<Integer> used = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            //this is the int we are adding
            int add  = rand.nextInt(10) +1;
            //while we have already used the number
            while (used.contains(add))
            {
                //generate a new one because it's already used
                add = rand.nextInt(10) +1;
            }
            used.add(add);
            arr[i] = add;
        }
        System.out.println(Arrays.toString(arr));
//        sort the arrays. the minimum value will be at index 0
//        and the maximum value will at the last index
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);


    }
}
