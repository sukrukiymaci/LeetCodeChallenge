class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list= new ArrayList<List<String>>(); 
         ArrayList<Integer> list2 = new ArrayList<Integer>();            

           
            
        for(int i = 0; i < strs.length; i++){
            if (list2.contains(i)) continue;
            
            List<String> list3 = new ArrayList<String>(); 
            char [] a  = strs[i].toCharArray();
            Arrays.sort(a);
            

            
            for(int j = i; j < strs.length; j++){
                
                char [] b  = strs[j].toCharArray();
                Arrays.sort(b);
                
                if (Arrays.equals(a,b)){
                    
                    if(list2.contains(j) == true){
                        break;
                    }else{
                        list3.add(strs[j]);
                        list2.add(j);
                    }
                    
                }
                

                
            }
            
            if(list3.isEmpty()==true){
                continue;
            }            
            list.add(list3);
             //System.out.println(list);
             //list.clear();
            
        }
        return list;

        }
        

        
        
        
    }
