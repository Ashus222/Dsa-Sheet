class Solution{
    static int minJumps(int[] arr){
        
        int n = arr.length;
        if(n<=1){
            return 0;
        }
        
        if(arr[0] == 0){
            return -1;
        }
        
        int steps = arr[0];
        int maxReach = arr[0];
        int jump = 1;
        
        for(int i = 1;i<n;i++){
            
            if (i == n-1){
                return jump;
            }
            maxReach = Math.max(maxReach, i+arr[i]);
            steps--;
            
            if(steps == 0){
                jump++;
                
                if(i >= maxReach){
                    return -1;
                }
                steps = maxReach -i;
            }
    
        } 
        return jump;
    }
}
