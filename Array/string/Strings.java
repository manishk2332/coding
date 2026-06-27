public class Strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
public static void main(String args[]){
//     // char arr[]={'a','b','c','d'};
//     // String str ="abcd";
//     // String str2=new String("xyz");
//                                                                    // string are immutable

// Scanner sc=new Scanner(System.in);
// String name;
// name=sc.nextLine();
// System.out.println(name);


// }
// }

// String fullname="tony stark";
// System.out.println(fullname.length());

//concatenation

String firstname="mani";
String lastname="kumar";
String fullname=firstname+ " "+ lastname;
System.out.println(fullname);

printletters(fullname);
}
}