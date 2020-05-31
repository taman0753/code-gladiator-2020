#include <bits/stdc++.h>
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

void pow(int n)
{
    long a[n],b[n];
    int i,j,c=0,v=0;
    for(i=0;i<n;i++)
        cin>>a[i]; // Power of your team
    for(i=0;i<n;i++)
        cin>>b[i]; // Power of enemy team

    sort(a, a+n, greater<int>()); //Sort the powers in descending order
    sort(b, b+n, greater<int>()); 

    for(i=0;i<n;i++)
        for(j=v;j<n;j++)
        {
            if(a[i]>b[j])
                {
                    c++;
                    v=j+1;
                    break;
                }
        }
    cout<<c<<endl; // endl in required to avoid whitespace errors
}

int main()
{
    int t,n,co=0;
    cin>>t;
    while(co!=t) // No of test cases
    {
        cin>>n;
        pow(n); //Function to calculate power
        co++;
    }

    return 0;
}
