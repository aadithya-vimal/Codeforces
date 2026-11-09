#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking no. of inputs
        int n; cin >> n;
        for(int i=0; i<n; i++){
            //Taking rating as input
            int r; cin >> r;
            if(1900 <= r){
                cout << "Division 1\n";
            }else if(1600 <= r && r <= 1899){
                cout << "Division 2\n";
            }else if(1400 <= r && r <= 1599){
                cout << "Division 3\n";
            }else if(r <= 1399){
                cout << "Division 4\n";
            }
        }
    }
    return 0;
}
