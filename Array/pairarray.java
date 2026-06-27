public class pairarray{
    public static void printpairs(int numbers[]){
        int totalpair=0;
        for (int i=0; i<numbers.length; i++){
            int current = numbers[i];    //2,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+current + "," + numbers[j]+ ")");
                totalpair++;

            }
            System.out.println();
        }
       System.out.println("total pairs = "+ totalpair);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);
    }
}
                            // time complexity is taken 'O(n squrare (n2))'