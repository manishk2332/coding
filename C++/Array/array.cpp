#include<iostream>
using namespace std;
int main(){

int array[]={1,2,3,4};
// cout<<sizeof(array)<<endl;
// cout<<sizeof(array)/sizeof(array[0])<<endl;

// for loop
//int size= sizeof(array)/sizeof(array[0]);
// for(int index=0;index<=2;index++){
// cout<<array[index]<<endl;
// }
// //for each loop
// for(int element:array){
//     cout<<element<<endl;
// }

//while loop
// int index=0;
// while(index<=3){

// cout<<array[index]<<endl;
// index++;
// }
 char vowels[5];

for(int index=0;index<5;index++){
    cin>>vowels[index];
}

for(int index=0;index<5;index++){
    cout<<vowels[index]<<" ";
}
    return 0;
}