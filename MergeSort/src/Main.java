public class Main {

    public static void main(String[] args) {
        int[] sortThis = {2,8,5,3,9,4,1,7};
        System.out.println("Array: ");
        printArray(sortThis);
        sortThis = mergeSort(sortThis);

        System.out.println("\n");

        System.out.println("Now Sorted: ");
        printArray(sortThis);
        mergeSort(sortThis);

    }

    public static int[] mergeSort(int[] sortThis){
        int[] sortedLeft, sortedRight; // the split into two arrays
        int midpoint = sortThis.length/2; // finding the midpoint

        sortedLeft = new int[midpoint]; // the left array will always be half of the length of orig

        if(sortThis.length <= 1) {
            return sortThis;
        }

        if(sortThis.length % 2 == 0) { // if the length of orig is even then...
            sortedRight = new int[midpoint]; // ... set the right as size of the midpoint
        } else { // if not ...
            sortedRight = new int[midpoint+1]; // ...set the Right as size of midpoint plus 1
        }

        for(int i = 0; i < sortThis.length; i++){
            if(i < midpoint){
                sortedLeft[i] =  sortThis[i]; // storing the values into the left half, ready to be sorted
//                i++;
            }
        }

        for(int j = 0; j < sortThis.length; j++){
            if(j < sortedRight.length){
                sortedRight[j] = sortThis[j+midpoint]; // storing the values into the right half, read to be sorted
            }
        }

        int [] result = new int[sortThis.length]; // the resulting array

        sortedLeft = mergeSort(sortedLeft); // this is where the recursion occurs
        sortedRight = mergeSort(sortedRight);

        result = merge(sortedLeft, sortedRight);

        return result; /// this is NOT correct, just put it in there for git commit
   }

   private static int[] merge(int[] sortedLeft, int[] sortedRight){
        int[] resultingArray = new int[sortedLeft.length + sortedRight.length];

        int leftPtr, rightPtr, resultPtr; // integger values tht will be used as pointers to each array
        leftPtr = 0; rightPtr = 0; resultPtr = 0;

        while(leftPtr < sortedLeft.length || rightPtr < sortedRight.length) { // insures that merge is possible
            if(leftPtr < sortedLeft.length && rightPtr < sortedRight.length){
                if(sortedLeft[leftPtr] < sortedRight[rightPtr]){ // sorting and storing
                    resultingArray[resultPtr++] = sortedLeft[leftPtr++];
                } else {
                    resultingArray[resultPtr++] = sortedRight[rightPtr++];
                }
            }

            else if(leftPtr < sortedLeft.length){
                resultingArray[resultPtr++] = sortedLeft[leftPtr++];
            }

            else if(rightPtr < sortedRight.length){
                resultingArray[resultPtr++] = sortedRight[rightPtr++];
            }
        }
        return resultingArray;
   }

   private static void printArray(int[] array){
       for (int i :
            array) {
           System.out.print(i + " ");
       }
   }
}
