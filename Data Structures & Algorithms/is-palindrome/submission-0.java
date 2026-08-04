class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        String s2= s1.toLowerCase();
        char[] array = s2.toCharArray();
        int n = s2.length();
        boolean res = true;
        for(int i=0,j=n-1;i<j;i++,j--){
            // System.out.print("I : "+ array[i]);
            // System.out.println("J : "+ array[j]);
            if(array[i]!=array[j]){
                res=false;
                break;
            }
        }
        return res;
    }
}
