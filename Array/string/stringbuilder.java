public class stringbuilder{
//     public static void main(String args[]){
//         StringBuilder sb =new StringBuilder("");
//         for(char ch ='a'; ch<='z';ch++){
//             sb.append(ch);          // append means ak ke phiche ak join hote jana
//         }
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }




public static String toUpperCase(String str){
        StringBuilder sb =new StringBuilder("");

        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
         for(int i=1; i<str.length(); i++){
            if(str.charAt(i) ==' '  && i<str.length()-1){
                   sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }

         }
         return sb.toString();
}

public static void main(String args[]){
    String str = "mani is important";
    System.out.println(toUpperCase(str));
}
}
