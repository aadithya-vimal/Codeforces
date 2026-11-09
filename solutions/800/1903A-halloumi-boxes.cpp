#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        //Taking inputs of n and k
        int n,k; cin >> n >> k;
        //Taking n inputs with box nos to consume input
        vector<int> arr;
        for(int i=0; i<n; i++){
            int anum;
            cin >> anum;
            arr.push_back(anum);
        }
        if(k>=2){
            cout << "YES\n";
        }else{
            if(is_sorted(arr.begin(),arr.end())){
                cout << "YES\n";
            }else{
                cout << "NO\n";
            }
        }
    }
    return 0;
}
