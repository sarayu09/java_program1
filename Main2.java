import java.util.Scanner;
public class Main2{
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter first string: ");
String str1=scanner.nextLine();
System.out.print("Enter second string:");
String str2= scanner.nextLine();
if(str1.equals(str2)){
System.out.println("Strings are equal");
}else{
System.out.println("String are not equal");

}
}
}