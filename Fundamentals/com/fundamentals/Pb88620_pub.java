package com.fundamentals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//for Pub failures

public class Pb88620_pub {

	public static void main(String[] args) {
		GenerateScript();
	}
		

         public static void GenerateScript() {
		 String date="20220801";
		 BufferedReader br =null;
		 System.out.print("echo -e \"Script is started \" \r\n");
		 System.out.println("echo -e \"\\n\"");
		 try{	
	           br = new BufferedReader(new FileReader("C:\\Users\\sourabh\\Desktop\\Cybage_PDM\\Failures\\pub\\pubfile.txt"));
	           String contentLine = br.readLine();
	           while (contentLine != null) {       	  
	        	  
	        	   
	        	  String failed = contentLine;
	              String[] arrOfStr = failed.split("/",2);
	              contentLine = br.readLine();
	               
	              String mid=arrOfStr[0];
	    
	               
	              System.out.println("\necho -e \"=========================================================================\"");
	 	    	  System.out.println("echo -e \"http://ipg.private.linksynergy.com:8080/ipg/publisher/"+mid+"/"+date);
	 	    	  System.out.println("curl -i \"http://ipg.private.linksynergy.com:8080/ipg/publisher/"+mid+"/"+date);
	 	    	  System.out.print("echo -e \"\\n\"\r\n");
	 	    	  System.out.print( "sleep 5");
	           }
	           System.out.println("\necho -e \"=========================================================================\"");
	      	 
		 	}
	
	     	catch (IOException ioe) 
		 	{
			   ioe.printStackTrace();
		 	} 
		 	
		 	finally
		 	{
		 		try {
		 		      if (br != null)
		 			 br.close();
		 		   } 
		 		   catch (IOException ioe) 
		 	           {
		 			System.out.println("Error in closing the BufferedReader");
		 		   }
		 	}
		

         }}
	
