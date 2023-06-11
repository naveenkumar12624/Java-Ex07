import java.util.Arrays;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        int index = 2;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Create a new array with increased size
        int[] newArray = new int[array.length + 1];

        // Copy the elements from the original array to the new array
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                newArray[j] = element;
                j++;
            }
            newArray[j] = array[i];
        }

        System.out.println("Array after inserting element: " + Arrays.toString(newArray));
    }
}