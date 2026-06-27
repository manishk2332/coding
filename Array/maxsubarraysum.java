public class maxsubarraysum{
    public static void maxsubarraysum(int numbers[]){
        
        int maxsum= Integer.MIN_VALUE;
        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                int currentsum=0;
                
                for(int k=start; k<=end; k++){                    // time complexity is 'O(n cube(n3))'

                    //subarray sum 
                    currentsum+= numbers[k];
                    
                }
                System.out.println(currentsum);
                if(maxsum < currentsum){
                    maxsum=currentsum;
                }
         
               

            }
            
        }
        System.out.println("max sum = " + maxsum);
    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        maxsubarraysum(numbers);
    }
}

