int main()
{
    fastread();
    int t,n,a[55];
    cin>>t;
    while(t--){
        cin>>n;
        for(int i=0; i<n; i++){
            cin>>a[i];
        }
        if(n == 1){
            cout<<"YES"<<endl;
            continue;
        }
        sort(a,a+n);
        vector<int>v;
        int dif = 0;
        for(int i=1; i<n; i++){
            dif = abs(a[i] - a[i-1]);
            v.push_back(dif);
        }
        sort(v.begin(), v.end(), greater<int>());
//        for(int i=0; i<v.size(); i++){
//            cout<<v[i]<<" ";
//        }
//
//        cout<<endl;
        if(v[0] > 1){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES"<<endl;
        }
    }