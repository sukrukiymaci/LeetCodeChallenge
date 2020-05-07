class Solution {
    public boolean checkValidString(String s) {
         int a = 0;
        
        // Copy character by character into array 
        for (int i = 0; i < s.length(); i++) {   
            char c = s.charAt(i); 
            if(c == '*' || c == '(')a++;
            else if(c == ')' && a>0 ) a--;
            else if(c == ')')return false;
        }
        a = 0 ;
        for (int i = s.length()-1; i >= 0 ; i--) {   
            char c = s.charAt(i); 
            if(c == '*' || c == ')')a++;
            else if(c == '(' && a>0 ) a--;
            else if(c == '(')return false;
        }
        
        return true;
    }
    
}
