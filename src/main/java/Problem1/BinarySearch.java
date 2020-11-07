package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        int[] nData = null;
        int size = data.length;
         if (size > 0){
             nData = new int[size];
             int i;
             for (i = 0; i < size; i++){
                 nData[i] = data[i];
             }
             if (data[data.length-1] == target){
                 return size-1;
             }else if (data[data.length-1] != target){
                 return binarySearch(nData, target);//recursive
             }
         }
         return -1;//Returns a -1 if the target isn't found or iff the array is empty.
    }
}
