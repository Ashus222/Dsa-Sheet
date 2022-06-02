class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
         Arrays.sort(arr);
        
         k = k-1;
         return arr[k];
        
    // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    //     for(int i = 0;i<k;i++){
    //         pq.add(arr[i]);
    //     }
        
    //     for(int i = k;i<arr.length;i++){
    //         if(pq.peek() > arr[i]){
    //             pq.pop();
    //             pq.add (arr[i]);
    //         }
    //     }return pq.peek;
    
        
        
    } 
}
