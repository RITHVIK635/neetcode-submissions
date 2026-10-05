class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length()!=t.length()){
            return false ;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        int length = s.length();
        for ( int i =0; i<length;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for ( int j =0; j<length;j++){
            hm.put(t.charAt(j),hm.getOrDefault(t.charAt(j),0)-1);
        }
        for ( int z =0 ; z<length;z++){
            if (hm.get(s.charAt(z))!=0){
               return false ;
            }
        }
        return true;

    }
}
