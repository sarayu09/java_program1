public class SortAsc{
public static void main(String[] args) {
int[] arr. new int[]{5,2,8,7,1};
int temp 0;
System.out.println("Elements of original array: ");
for (inti=0;i<arr.length; i++){
System.out.print(arr[i] + " ");
}
for (inti=0;i<arr.length; i++) {
for (int j=i+1;j<arr.length; j++){
if (arr[i]> arr[j]) {
temp=arr[i];
arrti]=arr[j];
arr[j]=temp;
}
}
}
System.out.println();
System.out.println("Elements of array sorted in ascending order: ");
for (int (i= 0;  i<arr.length; i++){
 system.out.print (arr [i] + " ");
}
}
}