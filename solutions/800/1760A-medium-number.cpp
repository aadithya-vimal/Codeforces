#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        //Taking all three numbers and autosort using set
        multiset<int> mySet;
        for(int i=0; i<3; i++){
            int num; cin >> num;
            mySet.insert(num);
        }
        auto it = next(mySet.begin(), 1);
        cout << *it << "\n";
    }
    return 0;
}
