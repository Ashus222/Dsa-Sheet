class Solution
{
    public static void sort012(int a[], int n)
    {
     int l = 0;
      int h = n-1;
      int m = 0;
      
      while(m<=h){
          if(a[m]==0){
              int temp = a[m];
              a[m] = a[l];
              a[l] = temp;
              l++;
              m++;
          }
          else if(a[m]==1){
              m++;
          }
          else{
              int temp = a[m];
              a[m] = a[h];
              a[h] = temp;
              h--;
          }
      }
    }
   
}
