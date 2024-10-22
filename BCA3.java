class Student{
int addmission;
String name;
int mobilenumber;
float fee;
}
class BCA3{
public static void main(String[]args){
Student s1= new Student();
Student s2= new Student();
Student s3= new Student();
s1.addmission=70;
s1.name="sreeja";
s1.mobilenumber=67890;
s1.fee=50000;
s2.addmission=71;
s2.name="pavani";
s2.mobilenumber=67890;
s2.fee=50000;
s3.addmission=72;
s3.name="sushama";
s3.mobilenumber=67890;
s3.fee=50000;
System.out.println(s1.addmission+" "+s1.name+" "+s1.mobilenumber+" "+s1.fee);
System.out.println(s2.addmission+" "+s2.name+" "+s2.mobilenumber+" "+s2.fee);
System.out.println(s3.addmission+" "+s3.name+" "+s3.mobilenumber+" "+s3.fee);
}
}