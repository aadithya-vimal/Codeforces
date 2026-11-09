#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t;
    while (t--) {
        int w;
        bool divideable=false;
        cin >> w;
        for(int i=1; i <= w/2; i++){
            if(i%2 == 0){
                if((w-i)%2 == 0){
                    divideable=true;
                }
        }
}
if(divideable){
    cout << "YES";
}else{
cout << "NO";
}
}
return 0;
}
