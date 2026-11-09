#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Take input for number of test cases
        int n; cin >> n;
        //Iterating through each test case
        for(int i=0; i<n; i++){
            //Taking input of number
            int num; cin >> num;
            if(num % 3 == 0){
                cout << "Second\n";
            }else{
                cout << "First\n";
            }
        }
    }
    return 0;
}
