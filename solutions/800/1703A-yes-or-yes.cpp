#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for number of testcases
        int n; cin >> n;
        //Iterating through each test case
        for(int i=0; i<n; i++){
            //Taking string input
            string str; cin >> str;
            ranges::transform(str,str.begin(),::toupper);
            if(str == "YES"){
                cout << "YES\n";
            }else{
                cout << "NO\n";
            }
        }
    }
    return 0;
}
