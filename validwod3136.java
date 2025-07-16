class Solution {
    public boolean isValid(String word) {
        if (word.length()<3) return false;
        String vow="aeiouAEIOU";
        boolean f_v=false;
        boolean f_c=false;
        for(char ch:word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if(vow.indexOf(ch)!=-1){
                    f_v=true;
                }
                else{
                    f_c=true;
                }
            }
        }
        return f_c&&f_v;        
    }
}
