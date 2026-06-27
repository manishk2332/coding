public class kadanesmaxsubarraysum{
        public static void kadanesmaxsubarraysum(int numbers[]){
            int maxsum = Integer.MIN_VALUE;
            int currentsum= 0;

            for(int i =0; i<numbers.length; i++){
                currentsum=currentsum+numbers[i];          // time complexity is = O(n)
                if(currentsum<0){                               
                    currentsum=0;
                }
                maxsum=Math.max(currentsum,maxsum);

            }
            System.out.println("max subarray sum : " + maxsum);
        }

    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesmaxsubarraysum(numbers);
    }
    }


