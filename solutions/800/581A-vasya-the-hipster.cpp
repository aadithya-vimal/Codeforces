#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for a and b
        int a,b; cin >> a >> b;
        int minNum = 0, maxNum = 0;
        if(a<b){
            minNum = a;
            maxNum = b;
        }else{
            minNum = b;
            maxNum = a;
        }
        int difference = maxNum - minNum;
        int secondOp = difference / 2;
        cout << minNum << " " << secondOp << endl;
    }
    return 0;
}
