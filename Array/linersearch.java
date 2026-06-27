public class linersearch{
    public static int linersearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
       return -1;

    }
    public static void main(String args[]){
       int numbers[]={5,8,6,3,9,12};
      
       int key = 6;

       int index =linersearch(numbers,key);
       if(index==-1){
        System.out.println("not found");
       }else{
     System.out.println("Key is at index = "+index);
       }
      
    }
}

