import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 45, 15};
        
        System.out.println("Initial Array: " + Arrays.toString(array));
      
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
         
        }
     
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
