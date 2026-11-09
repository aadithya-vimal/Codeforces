#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for n(no. of problems)
        //Taking input for k(minutes to reach party)
        int n, k; cin >> n >> k;
        //Computing remaining time
        int remTime = (4*60)-k;
        int order = 1;
        int solvedTime = 0;
        int problemsSolved = 0;
        while(solvedTime + (5*order) <= remTime && problemsSolved < n){
            solvedTime += (5*order);
            order += 1;
            problemsSolved += 1;
        }
        cout << problemsSolved;
    }
    return 0;
}
