# Ex-7 Write a java program to insert an element into array
## AIM:
To write a java program to insert an element into array.
## PROCEDURE:
### STEP 1:
Create the class InsertElementIntoArray it has mai function.
### STEP 2:
Initialize the array with some value.
### STEP 3:
Set the value to be inserted and its index value to be assigned.
### STEP 4:
Through loop add the value to be inserted into new array.
### STEP 5:
Display the updated array.
### STEP 6:
End of program.
## PROGRAM:
```java
import java.util.Arrays;
public class InsertElementIntoArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        int index = 2;
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] newArray = new int[array.length + 1];
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
```
## OUTPUT:
![image](https://github.com/Karthikeyan21001828/Java_EX07/assets/93427303/8c049f52-69f3-4e7c-b629-46b6b67f45dc)

## RESULT:
A java program to insert an element into array has been executed successfully.
