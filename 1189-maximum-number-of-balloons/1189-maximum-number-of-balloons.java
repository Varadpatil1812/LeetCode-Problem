class Solution {
    public int maxNumberOfBalloons(String text) {

        int n = text.length();
        if(n < 5){
            return 0;
        }
            
        
        int count[] = new int[26];

        for(char ch : text.toCharArray()){
            int idx = ch - 'a';
            count[idx] = count[idx] + 1;
        }
        int b = count[1];
        int a = count[0];
        int l = count[11];
        int o = count[14];
        int nc = count[13];

    return Math.min(b, 
                  Math.min(a, 
                  Math.min(l / 2, 
                  Math.min(o / 2, nc))));

        
    }
}