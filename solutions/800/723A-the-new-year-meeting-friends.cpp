#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input of coords of all houses in array
        int arr[3];
        for(int i=0; i<3; i++){
            cin >> arr[i];
        }
        //Sorting array to find middle element
        sort(arr,arr+3);
        //Middle element will be at arr[1]
        //Compute difference between arr[2]-arr[1],arr[1]-arr[0] => arr[2]-arr[0] and add
        int answer = (arr[2]-arr[0]);
        cout << answer;
    }
    return 0;
}
