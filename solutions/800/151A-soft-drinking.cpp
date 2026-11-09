#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //n = no. of friends
        //k = no. of bottles
        //l = ml of each bottle
        //c = no. of limes
        //d = no. of slices
        //p = g of salt
        int n,k,l,c,d,p,nl,np; cin >> n >> k >> l >> c >> d >> p >> nl >> np;
        int totalMl = k*l;
        int firstPossibility = totalMl/nl;
        int secondPossibility = c*d;
        int thirdPossibility = p/np;
        int minimum = min({firstPossibility, secondPossibility,thirdPossibility});
        int answer = minimum/n;
        cout << answer;
    }
    return 0;
}
