#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        //Taking inputs of host, guest and cardboard cutouts
        string host; cin >> host;
        string guest; cin >> guest;
        string cutout; cin >> cutout;
        vector<char> correctBucket;
        vector<char> cutoutBucket;
        //Placing correct characters in first vector and sorting
        for(int i=0; i<host.length(); i++){
            correctBucket.push_back(host.at(i));
        }
        for(int j=0; j<guest.length(); j++){
            correctBucket.push_back(guest.at(j));
        }
        sort(correctBucket.begin(),correctBucket.end());
        //Placing cutout characters in second vector and sorting
        for(int k=0; k<cutout.length(); k++){
            cutoutBucket.push_back(cutout.at(k));
        }
        sort(cutoutBucket.begin(), cutoutBucket.end());
        if(correctBucket == cutoutBucket){
            cout << "YES";
        }else{
            cout << "NO";
        }
    }
    return 0;
}
