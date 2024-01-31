package com.ExceptionHandling;


class Test{
	
}
public class isInstanceMethodEx1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
			Test t= new Test();
			System.out.println(t instanceof Test);  //true
			
			System.out.println(Class.forName(args[0]).isInstance(t));     //true     //arg passed as java.lang.Object
																		 //true		//arg passed as com.ExceptionHandling.Test
																		//false		//arg passed as com.lang.String
			
			
			
			
			//see class Class to understand forName 
			
			
			
			
			Object ob= Class.forName(args[0]).newInstance();
			
			if(ob instanceof Test) {
				Test t2=(Test)ob;
				
			}
			else {
				System.out.println("invalid object");
			}
		
	}

}
