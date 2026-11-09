#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input of number of tickets
        int n; cin >> n;
        //Iterating through each ticket
        for(int i=0; i<n; i++){
            int firstHalf = 0;
            int secondHalf = 0;
            int num; cin >> num;
            for(int j=0; j<6; j++){
                if(j<3){
                    int digit = num % 10;
                    secondHalf += digit;
                    num /= 10;
                }else{
                    int digit = num % 10;
                    firstHalf += digit;
                    num /= 10;
                }
            }
            if(firstHalf == secondHalf){
                cout << "YES\n";
            }else{
                cout << "NO\n";
            }
        }
    }
    return 0;
}
