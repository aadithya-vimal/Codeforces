#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for number of contests and contest points
        int n, point; cin >> n;
        int arr[n];
        for(int i=0; i<n; i++){
            cin >> point;
            arr[i] = point;
        }
        int answer = 0;
        //The problem says each time max and min value changes, thats an amazing performance
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer += 1;
                max = arr[i];
            }
            if(arr[i] < min){
                answer += 1;
                min = arr[i];
            }
        }
        //Return the answer
        cout << answer;
    }
    return 0;
}
