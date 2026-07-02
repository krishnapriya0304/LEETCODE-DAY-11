class Solution {
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0,maxCount=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))==true){
                count++;
            }
        }
        maxCount=Math.max(count,maxCount);
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))==true){
                count--;
            }
            if(isVowel(s.charAt(i))==true){
                count++;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
