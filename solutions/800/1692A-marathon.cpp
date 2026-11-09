#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
       int timurDist = 0, ans = 0;
       for(int i=0; i<4; i++){
           int n; cin >> n;
           if(i == 0){
               timurDist = n;
               continue;
           }
           if(n>timurDist){
               ans += 1;
           }
       } 
       cout << ans << "\n";
    }
    return 0;
}
