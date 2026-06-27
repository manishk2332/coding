#include<iostream>
using namespace std;
int main(){
char alphabates;
cout<<"Enter an alphabates:";
cin>>alphabates;
switch(alphabates){
    case 'a':
    cout<<"Vowels"<<endl;
    break;
    case 'e':
    cout<<"vowels"<<endl;
    break;
    case 'i':
    cout<<"vowels"<<endl;
    break;
    case 'o':
    cout<<"vowels"<<endl;
    break;
    case 'u':
    cout<<"vowles"<<endl;
    break;
    default:
    cout<<"consonants"<<endl;
    break;
    
    }

    return 0;
}