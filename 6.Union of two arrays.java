
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        
        HashSet<Integer> set1 = new HashSet<>();

       for(int i=0;i<n;i++){
           set1.add(a[i]);
       }

       for(int i=0;i<m;i++){
           set1.add(b[i]);
       }


       return set1.size();
        
        
        //Intersection of two arrays
        
//         TreeSet<Integer> set = new TreeSet<>();
//         // Removing duplicates from first array
//         for (int i : a)
//             set.add(i);
 
//         ArrayList<Integer> list
//             = new ArrayList<>();
         
//         // Avoiding duplicates and
//         // adding intersections
//         for (int i : b)
//             if (set.contains(i)
//                 && !list.contains(i))
//                 list.add(i);
        
//         return list.size();
        
   }
}
