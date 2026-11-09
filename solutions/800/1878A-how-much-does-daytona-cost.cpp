#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        //Taking input for no of elements and must be common element
        int n,k; cin >> n >> k;
        bool isPresent = false;
        for(int i=0; i<n; i++){
            int num; cin >> num;
            if(num == k){
                isPresent = true;
            }
        }
        if(isPresent){
            cout << "YES\n";
        }else{
            cout << "NO\n";
        }
    }
    return 0;
}
