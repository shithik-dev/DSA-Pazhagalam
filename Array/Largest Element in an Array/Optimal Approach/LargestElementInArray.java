
class Solution {

    // Method to find the largest element without sorting
    public static int getLargest(int[] values) {

        // Assume the first element is the largest
        int largestValue = values[0];

        // Compare the remaining elements one by one
        for (int index = 1; index < values.length; index++) {

            // Update largestValue if a bigger element is found
            if (values[index] > largestValue) {
                largestValue = values[index];
            }
        }

        // Return the largest element
        return largestValue;
    }
}

public class LargestElementInArray{

    public static void main(String[] args) {

        // First input array
        int[] firstArray = {8, 2, 1, 3, 4};

        // Second input array
        int[] secondArray = {21, 6, 8, 9, 20};

        // Print the largest element of the first array
        System.out.println("Largest Element: " + Solution.getLargest(firstArray));

        // Print the largest element of the second array
        System.out.println("Largest Element: " + Solution.getLargest(secondArray));
    }
}