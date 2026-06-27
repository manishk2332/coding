public class reversearray{
    public static void reverse(int numbers[]){
        int first = 0 , last = numbers.length-1;

        while(first<last){
             // swap

             int temp = numbers[last];
             numbers[last]=numbers[first];
             numbers[first]=temp;

             first++;
             last--;

        }
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,45,6};
        reverse(numbers);

        //print
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
    }
}
                                                     // in tthis code Time complexity is required 'n' and space complexity is '1(constant)''