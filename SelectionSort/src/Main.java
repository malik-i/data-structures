import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int [] arr = {0,8,7,6,5,4,2,3,5,1,1,2,0};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : arr){
            arrayList.add(i);
        }
        selectionSort(arrayList);
    }

    public static void selectionSort(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            int headPtr = i;
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(j) < arr.get(headPtr)){
                    headPtr = j;
                }
            }
            Collections.swap(arr, headPtr, i);
        }

        for(int i : arr){
            System.out.print(i + ",");
        }
    }

}