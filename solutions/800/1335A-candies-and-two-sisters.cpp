#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking number of test cases
        int n; cin >> n;
        //Iterating through each test case
        for(int i=0; i<n; i++){
            //Taking number of candies
            int num; cin >> num;
            cout << (num-1)/2 << '\n';
        }
    }
    return 0;
}
