#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        int n; cin >> n;
        int sum = 0;
        for(int i=0; i<2; i++){
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        cout << sum << "\n";
    }
    return 0;
}
