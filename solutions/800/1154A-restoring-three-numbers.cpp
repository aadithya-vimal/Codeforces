#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking inputs of all four nums
        vector<int> vec;
        for(int i=0; i<4; i++){
            int n; cin >> n;
            vec.push_back(n);
        }
        //Max element will always be (a+b+c)
        sort(vec.begin(), vec.end()); //Pushing largest element to last index
        for(int i=0; i<3; i++){
            cout << vec[3] - vec[i] << " ";
        }
    }
    return 0;
}
