public class problem1{
  static void ReverseAnArray(int arr[], int start,int end){
    
    int temp;
    while(start < end){
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
     start++;
     end--;
     }
     }
     
     
     
     /*
     Recursive approach
     {
     int temp;
     if(start >= end)
     return;
     
     int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     
     ReverseAnArray(arr, start+1,end-1);
   }  
     
     
     */
