package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        int[] nData = null;//sets the new array to be empty
        int size = data.length;
        if(size > 0) {
            nData = new int[size - 1];
            for (int i = 0; i < nData.length; i++) {//for-loop that fills new array with elements from array within the parameter
                nData[i] = data[i];
            }
            if (data[size - 1] == target) {
                return size - 1;
            } else {
                return binarySearch(nData, target);//recursion of binarySearch
            }
        }
        return -1;//returns -1 if the array is empty or if the target isn't found.
    }
}
