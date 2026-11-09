#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        int n; cin >> n; //Taking input for number of elements
        vector<int> a; //Vector for storing all elements
        //Taking all elements
        for(int i=0; i<n; i++){
            int num; cin >> num;
            a.push_back(num);
        }
        sort(a.begin(), a.end());
        for(int i=1; i<n; i++){
            int j = i-1;//Second pointer to point to previous element
            if(abs(a[j]-a[i]) <= 1 && a[j] != 0){
                a[j] = 0;
            }
        }
        int count=0; //To check number of non zero elements in vector
        for(int i=0; i<n; i++){
            if(a[i]!=0){
                count += 1;
            }
        }
        if(count==1){
            cout << "YES\n";
        }else{
            cout << "NO\n";
        }
    }
    return 0;
}
