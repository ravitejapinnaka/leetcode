class Solution {
public:
    int firstUniqChar(string s) {
        int arr[256];
        for(int j=0;j<256;j++)
        arr[j]=0;
        for(int i=0;i<s.length();i++)
        {
            arr[(int)s[i]]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[(int)s[i]]==1)
            return i;
        }
        return -1;
        
    }
};