#include<iostream>
using namespace std;
 int main(){

 int marks;
cout<<"Enter a number:";
cin>>marks;
if(marks>=33){
    if(marks>=80){
        cout<<"Gracefully"<<endl;
    }
    else{
        cout<<"pass"<<endl;
    }
}
else{
    cout<<"Fail";
}

    return 0;
}