class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
       
        int m=ch1.length;
        int n=ch2.length;
        char[] ch3=new char[m+n];
        int a=0,b=0,c=0;
        while(a<m && b<n){
            ch3[c++]=ch1[a++];
            ch3[c++]=ch2[b++];
        }
        while(a<m){
            ch3[c++]=ch1[a++];
        }
        while(b<n){
            ch3[c++]=ch2[b++];
        }
        return new String(ch3);
    }
}
