
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
   }
}
