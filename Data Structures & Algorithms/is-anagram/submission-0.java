class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        char[] str = s.toCharArray();
        char[] str2 = t.toCharArray();
        int n = str.length;
        int m = str2.length;
        if(m!=n){
            return false;
        }
        for(int i = 0;i<n;i++){
            if(hm.get(str[i])!=null){
                hm.put(str[i],hm.get(str[i])+1);
            }
            else{
                hm.put(str[i],1);
            }
            if(hm2.get(str2[i])!=null){
                hm2.put(str2[i],hm2.get(str2[i])+1);
            }
            else{
                hm2.put(str2[i],1);
            }
        }
        return hm.equals(hm2);
    }
}
