#include <bits/stdc++.h>
using namespace std;
int main () {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int t; cin >> t;
    while(t--){
        string str = "codeforces";
        char c; cin >> c;
        if(str.contains(c)){
            cout << "YES\n";
        }else{
            cout << "NO\n";
        }
    }
}