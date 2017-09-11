import java.lang.*;
import java.io.*;
import java.util.*;


public class Main{

	public static void main(String[] args) {
	    Student s1=new Student(501,"Venu",new Date(),75);
	    Student s2=new Student(502,"Vit",new Date(),56);
	     Student s3=new Student(503,"Vdvkbt",new Date(),47);


		//ou may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	StudentGroup sg=new StudentGroup(3);

sg.setStudent(s1,0);
sg.setStudent(s2,1);
sg.setStudent(s3,2);
	display(sg.getStudent(0));
	display(sg.getStudent(1));
	display(sg.getStudent(2));
	}
	public static void display(Student st)
	{System.out.println("\n id:"+st.getId());
	System.out.println("\n Name:"+st.getFullName());
	System.out.println("\n birth:"+st.getBirthDate());
	System.out.println("\n avg:"+st.getAvgMark());

	}



}
