#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    //Taking number of testcases
    int t;
    cin >> t;
    while (t--) {
        //Taking number of elements
        int n; cin >> n;
        //Filling the array, finding sum
        int sum = 0, oddNos = 0;
        for(int i=0; i<n; i++){
            int elem; cin >> elem;
            sum += elem;
            if(elem % 2 != 0){
                oddNos += 1;
            }
        }
        if(sum % 2 != 0){
            cout << "NO\n";
        }else{
            cout << "YES\n"; 
        }
    }
    return 0;
}
