#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking input for number of cards
        int n; cin >> n;
        int arr[n];
        for(int i=0; i<n; i++){
            int card; cin >> card;
            arr[i] = card;
        }
        //[4,1,2,10]
        //Initializing sum variables for sereja and dina
        int serejaSum = 0;
        int dinaSum = 0;
        //Starting iterating through the entire array
        //Select the bigger element from either start or end
        int startIndex = 0;
        int endIndex = n - 1;
        bool serejaTurn = true;
        for(int i=0; i<n; i++){
            int start = arr[startIndex];
            int end = arr[endIndex];
            int max = 0;
            start>end?max=start:max=end;
            start>end?startIndex+=1:endIndex-=1;
            //Add the number to the sum of whoever's turn it is
            if(serejaTurn){
                serejaSum += max;
                serejaTurn = false;
            }else{
                dinaSum += max;
                serejaTurn = true;
            }
        }
        //Output final answer
        cout << serejaSum << " " << dinaSum << endl;
    }
    return 0;
}
