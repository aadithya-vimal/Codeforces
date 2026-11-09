#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking inputs of nos k and r
        int k,r; cin >> k >> r;
        bool notFound = true;
        int shovels = 1;
        while(notFound){
            int totalCost = shovels*k;
            //Taking last digit and checking if equal to r
            int digit = totalCost % 10;
            if(digit == r || digit == 0){
                notFound = false;
                break;
            }
            shovels += 1;
        }
        cout << shovels;
    }
    return 0;
}
