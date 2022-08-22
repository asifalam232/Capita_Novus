package Monday_22aug;

public class Array {
    public static void main(String[] args) {
//        double[] numbers = new double[10];
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i]);
//        }

//        System.out.println(numbers);

        //Multidimensional dimensional arrays
        int [][] array = {{1, -2, 3}, {-4, -5, 6, 9}, {7}};

//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                System.out.print(array[row][column] + "|");
//            }
//            System.out.println();
//        }

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (double element : myList) {
            System.out.println(element);
        }
    }
}
