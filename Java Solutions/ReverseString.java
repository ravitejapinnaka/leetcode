class Solution {
public:
    string reverseString(string s) {
        int l=s.length();
        for(int i=0;i<l/2;i++)
        {
            char temp;
            temp=s[i];
            s[i]=s[l-1-i];
            s[l-1-i]=temp;
            
        }
        return s;
    }
    
};