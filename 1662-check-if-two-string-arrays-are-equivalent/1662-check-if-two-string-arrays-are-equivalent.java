class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String nword1 = String.join("", word1);
        String nword2 = String.join("", word2);
        
        if(nword1.equals(nword2)){
            return true; 
        }
        return false;
    }
}