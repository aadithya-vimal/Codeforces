#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input n for number of teams
        int n; cin >> n;
        vector<int> home(n);
        vector<int> away(n);
        //Taking jersey inputs for each team
        for(int i=0; i<n; i++){
            cin >> home[i] >> away[i];
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //Skip the scenario where team plays itself
                if(i == j) continue;
                
                //Compare the jerseys, if same then increment answer var
                if(home[i] == away[j]){
                    ans += 1;
                }
            }
        }
        cout << ans;
    }
    return 0;
}
