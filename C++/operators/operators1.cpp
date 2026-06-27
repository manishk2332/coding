#include<iostream>
using namespace std;
int main(){
int num1=6;
int num2=3;

cout<<num1+num2<<endl;  //9
cout<<num1-num2<<endl;  //3
cout<<num1*num2<<endl;  //18
cout<<num1/num2<<endl;  //2
cout<<num1%num2<<endl;  //0    modulus operator is gives remainder


cout<<(num1==num2)<<endl;  //0 false
cout<<(num1!=num2)<<endl;  //1  true
cout<<(num1>=num2)<<endl;  //1  true
cout<<(num1<=num2)<<endl;   //0  false
num1+=3;
cout<<num1<<endl; //6+3=9
num2-=3;
cout<<num2<<endl;  //3-3=0
int num3;
num3=10;
num3/=5;
cout<<num3<<endl;
num3%=2;
cout<<num3;
    return 0;
}