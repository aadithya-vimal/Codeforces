#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
       //Taking inputs for n and x
       int n,x; cin >> n >> x;
       int diff = 0; 
       //Array to store all pumps
       vector<int> arr;
       arr.push_back(0);
       for(int i=0; i<n; i++){
           int pumpNum;
           cin >> pumpNum;
           arr.push_back(pumpNum);
       }
       sort(arr.begin(),arr.end());
       int lastStretch = 2*(x - arr[arr.size()-1]);   
       for(int j=1; j<arr.size(); j++){
           if(arr[j]-arr[j-1] > diff){
               diff = arr[j] - arr[j-1];
           }
       } 
       if(diff <= lastStretch){
           diff = lastStretch;
       }
       cout << diff << endl;
    }
    return 0;
}
