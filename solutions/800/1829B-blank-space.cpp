#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        //Taking input on n
        int n; cin >> n;
        //Initializing var for longest blank
        int blank = 0, max_blank = 0;
        //Main logic
        for(int i=0; i<n; i++){
            int digit; cin >> digit;
            if(digit == 0){
                blank += 1;
                max_blank = max(blank, max_blank);
            }else{
                blank = 0;
            }
        }
        cout << max_blank <<"\n";
    }
    return 0;
}
