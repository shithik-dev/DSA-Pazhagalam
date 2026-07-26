import java.util.Arrays;

class Solution {

    // Method to find the largest element by sorting the array
    public static int findMaximum(int[] numbers) {

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // The last element will be the largest after sorting
        return numbers[numbers.length - 1];
    }
}

public class LargestElementInArray{

    public static void main(String[] args) {

        // First input array
        int[] firstArray = {8, 2, 1, 3, 4};

        // Second input array
        int[] secondArray = {21, 6, 8, 9, 20};

        // Print the largest element of the first array
        System.out.println("Largest Element: " + Solution.findMaximum(firstArray));

        // Print the largest element of the second array
        System.out.println("Largest Element: " + Solution.findMaximum(secondArray));
    }
}