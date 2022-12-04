
/*
 * Compile time or static or overloading
 */


public class DemoPolymorpOverLoading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StudentName s = new StudentName("sourabh","Bidikar");
	
	s.printName(s.firstname);
	
	System.out.println();
	
	s.printName(s.firstname,s.lastname);
	
	}
	
	



}


class StudentName{
	String firstname;
	String lastname;
	
	
	public StudentName(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	void printName(String firstname) { 
		System.out.println("Name is: "+firstname);
	}
	
	void printName(String firstname,String lastname) { 
		System.out.println("Name is: "+firstname+" "+lastname);
	}
	
}