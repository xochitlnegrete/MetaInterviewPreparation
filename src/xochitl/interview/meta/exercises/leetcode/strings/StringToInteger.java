class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long num = 0;
        boolean positive = true;
        int cont = 0;
        boolean change = false;

        for(char c : s.toCharArray()) {
            if(!Character.isDigit(c)) {
                if(change)  break;
                if(c == '+')    change = true;
                else  if(c == '-')  { 
                    positive = false;
                    change = true;
                }
                else    break;
            }
            else{
                num = num * 10 + Integer.parseInt(String.valueOf(c));
                if(num > Integer.MAX_VALUE)    {
                    if(positive) return Integer.MAX_VALUE;
                    return Integer.MIN_VALUE;
                }
                cont++;
                change = true;
            }
          }
        if(!positive) num *= -1;
        return (int) num;
    }
}
