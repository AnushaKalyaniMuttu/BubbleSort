import java.util.*;
public class BubbleSort {
    public static void main(String args[]) {
      int [] arr={11,12,-1,-22,3,55,1};
      
      for(int leftUnsortedArray=arr.length-1;leftUnsortedArray>0;leftUnsortedArray--){
          for(int i=0;i<leftUnsortedArray;i++){
              if(arr[i]>arr[i+1]){
                  swap(arr,i,i+1);
              }
          }
      }
      for(int j=0;j<arr.length;j++)
      System.out.print(arr[j]+" ");
    }
    public static void swap(int[] arr, int a, int b){
        if(a==b)
        return;
        
        int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
    }
}
