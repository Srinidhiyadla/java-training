
package com.evoke.javabasics;
import java.util.ArrayList;
public class UserDefinedClass {
public static void main(String[] args) {
ArrayList<Student> Students =new ArrayList<Student>(); Student s1=new Student(456,"neha");
Student s2=new Student(565,"srinidi");
Student s3=new Student(587,"mahesh");
Students.add(s1);
Students.add(s2);
Students.add(s3); System.out.println(Students);
}

private int id;
private final String org="evoke";
private String name="srinidi";
@Override
public String toString() {
return "Student [id=" + id + ", org=" + org + ", name=" + name + "]";
}
public UserDefinedClass(int id, String name) {
this.id = id;
this.name = name;
} 
}


