class Solution {
public:
    vector<string> vectorBuilder(string s, int numRows) {
        vector<string> res(numRows);

        int j = 0;

        while(true) {
            for(int i = 0; i < numRows; i++) {
                res[i].push_back(s[j++]);
                if(j == s.length()) return res;
            }
            for(int i = numRows - 2; i > 0; i--) {
                res[i].push_back(s[j++]);
                if(j == s.length()) return res;
            }
        }
        return res;
    }

    string convert(string s, int numRows) {
        if(numRows == 1) return s;

        string answer = \\;

        vector<string> res = vectorBuilder(s, numRows);
        for(string s : res) answer += s;
        return answer;
    }
};