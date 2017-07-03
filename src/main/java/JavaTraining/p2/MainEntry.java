package JavaTraining.p2;//contents of this file belongs to p2 package

import JavaTraining.p1.*;//there can be multiple import statements in a file

//above two lines can be replaced with import p1.*;

public class MainEntry {
public static void main(String args[])
{
	JavaTraining.p1.Abcd obj = new JavaTraining.p1.Abcd();
	
	//Internal dsjhf=new Internal(); 
	//not accessible since Internal class is default
	
	obj.show();
	obj.show1();

	System.out.println("Hello...");

	
	Abcd obj2 = new Abcd();
	obj2.show();
	
	Xyz obj1 = new Xyz();
	obj1.display();
}
}
