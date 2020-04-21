//Temp easy solution, I will try to find optimized method later

import java.util.ArrayList;

public class HelloWorld{

     public static void main(String []args){
        
        ArrayList<Integer> values = new ArrayList<>();        
        int [] nums = {0,1,0,3,12};
        int zeros= 0;
        int [] others = new int [nums.length];
        int nonzeros=0;
        
      
        for(int i=0; i<nums.length ; i++){
        
            if(nums[i] ==  0){
                    zeros++;
            }
            else{
                
                values.add(nums[i]);
                nonzeros++;

            }
            
        }

        for(int var : others){
            System.out.print(var + " ");
        }
        
        for(int i=0; i< nonzeros; i++){
            
        others[i]= values.get(i);    
            
            
        }
        System.out.println("\n ");
/*        
        for(int var : others){
            System.out.println(var);
        }
*/        
        System.out.println("\n : "+ zeros);
        
        for(int i = (nums.length-zeros) ; i<nums.length ; i++ ){
            others[i] =0;
        }
        
        for(int var : others){
            System.out.println(var);
        }
        
        
    }
}
