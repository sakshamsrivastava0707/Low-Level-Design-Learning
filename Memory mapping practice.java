import java.util.*;

public class Main {
  public static class Student {

    String name;
    int age;
Student(){}
    Student(int age, String name){
      this.age = age;
      this.name = name;
    }

    public  void announceYourself(){
      System.out.println(this.name + "[" + this.age + "]");
    }
  }
  public static void swap3(Student s1, Student s2){
      s1 = new Student(18 ,"D");
      s2 = new Student(19 , "E");
      
      int tage = s1.age;
      s1.age = s2.age;
      s2.age = tage;
      
      String tname = s1.name;
      s1.name = s2.name;
      s2.name = tname;
    //   System.out.print("inside the swap method " + '\t');
    //   s1.announceYourself();
  }
   public static void swap4(Student s1, Student s2){
     // very interesting , draw the memory mapping , 
     // it makes much more sense
      s2 = new Student(19 , "E");
      
      int tage = s1.age;
      s1.age = s2.age;
      s2.age = tage;
      
      String tname = s1.name;
      s1.name = s2.name;
      s2.name = tname;
       s1 = new Student(18 ,"D");
    //   System.out.print("inside the swap method " + '\t');
    //   s1.announceYourself();
  }
  public static void swap(Student s1 , Student s2){
      // here only swappped in the function itself, it doesn't change 
      // in the main function
      Student temp;
      temp = s1; 
      s1 = s2;
      s2 = temp;
      // only in this particular function the swap has been created
      System.out.print("temp announceYourself " + '\t');
      temp.announceYourself();
    System.out.print("s1 announceYourself " + '\t');
      s1.announceYourself();
      s1.announceYourself();
  }

  public static void main(String[] args) {

    // Write your code here
    Student s1 = new Student(13, "A");
    Student s2 = new Student(14, "B");
    System.out.print("Before the swap method is called" + '\t');
    s1.announceYourself();
    swap4(s1, s2);
     System.out.print("After the swap method is called" + '\t');
     s1.announceYourself();
     s2.announceYourself();

  }
}
