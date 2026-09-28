class Solution {
    public int maxDepth(String s) {
            int ans=0;
            int c =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='('){
                  c++;
                  }
                  if(s.charAt(i)==')'){
                    c--;
            }
           ans = Math.max(c,ans);

        }
        return ans;
    }
}