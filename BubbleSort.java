import java.util.*;


class Sorting {
   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};


       //bubble sort
       for(int i=0; i<arr.length-1; i++) { // the arr,length shows the nth element and arr length -1 shows n-1
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       printArray(arr);
   }
