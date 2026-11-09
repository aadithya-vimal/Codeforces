#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        int n;
        string s;
        cin >> n;
        for(int i=0; i<n; i++){
            string answer;
            int counter=0;
            cin >> s;
            if(s.length()<=10){
                cout << s << "\n";
            }else{
                string val = to_string(s.length()-2);
                answer+=s[0];
                answer+=val;
                answer+=s[s.length()-1];
                cout << answer << "\n";
            }
        }
    }
    return 0;
}
