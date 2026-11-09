#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for number of events
        int n; cin >> n;
        //Taking input for events, holding total sum of crime and strength of police force in a variable
        int crime = 0;
        int force = 0;
        for(int i=0; i<n; i++){
            int e; cin >> e;
            if(e > 0){
                force += e;
            }
            if(e == -1 && force > 0){
                //Decreasing force strength to occupy crime treatment
                force -= abs(e);
            }else if(e == -1 && force == 0){
                //Crime goes untreated
                crime += abs(e);
            }
        }
        cout << crime;
    }
    return 0;
}
