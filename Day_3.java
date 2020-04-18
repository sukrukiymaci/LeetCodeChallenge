class Solution {
    public int maxSubArray(int[] nums) {
        
        // int [] subArray = Array.copyOfRange(nums,0,5);

            int sum =Integer.MIN_VALUE;
            
            for(int i=1; i != nums.length+1 ; i++){
                 
               for(int k = 0; k < nums.length ; k++){
                
                int tmpsum =0;                
                for(int j=k ; j<nums.length ; j++){
                    
//                  System.out.println( " i: " + i + " J: " + j + " K: " + k + "     nums[j]: " + array[j]);
                    tmpsum += nums[j];
                                        
                    if (i==(j+1)){
                        break;
                    }
                
                    if(nums[j]>sum){
                    sum=nums[j];
                    }                
                }
                
//              System.out.println(tmpsum);
                if(tmpsum>sum){
                    
                    sum=tmpsum;
                }


            }
                
            
        }
        
    return sum;    
    }
}
