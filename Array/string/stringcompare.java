public class stringcompare{
//     public static void main(String args[]){
//         String s1 ="Tony";
//         String s2 ="Tony";
//         String s3 = "Tony";

//         if(s1.equals(s2)){
//             System.out.println("String are equal");
//         }else{
//             System.out.println("String are not equal");
//         }
//         if(s1.equals(s3)){
//             System.out.println("String are equal");
//         }else{
//             System.out.println("String are not equal");
//         }
        
//     }
// }

public static void main(String args[]){
    String fruit[]={"apple","mango","banana"};            //compareTo() dictionary order (lexicographical order) me compare karta hai
    String largest = fruit[0];
    for(int i=1;i<fruit.length; i++){
        if(largest.compareTo(fruit[i])<0){                   //lexicographically largest string find karega.
            largest = fruit[i];
        }

    }
    System.out.println(largest);
}

    
}