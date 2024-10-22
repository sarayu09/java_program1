class student {

public void show() {

System.out. println ("student details.");
}
}
public class college student extends student }
 public void show()

system.out.println("College Student details.");
}
public static void main (String args[]) { // superclass can contain subclass object.
Student obj = new College Student ();
 obj. show();
 // method call resolved at runtime

}
}