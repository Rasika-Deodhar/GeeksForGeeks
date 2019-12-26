//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;
stack<int>_push(int arr[],int n);
void _pop(stack<int>s);
//Position this line where user code will be pasted.
int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];
	    stack<int>mys=_push(arr,n);
	    _pop(mys);
	    cout<<endl;
	    
	    
	    
	}
	return 0;
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for C++
/* _push function to insert elements of array to
   stack
*/
stack<int>_push(int arr[],int n)
{
    stack<int> mystack; 
    
    for(int i=0;i<n;i++){
        mystack.push(arr[i]); 
    }
    
    return mystack;
   //return a stack with all elements of arr inserted in it
}
/* _pop function to print elements of the stack
   remove as well
*/
void _pop(stack<int>s)
{
    while(!s.empty()){
        cout << s.top() << " ";
        s.pop();
    }
    //print top and pop for each element until it becomes empty
}