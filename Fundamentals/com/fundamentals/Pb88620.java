package com.fundamentals;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//for VAT failures

public class Pb88620 {


	public static void main(String[] args) {
		GenerateScript();
	}
		

         public static void GenerateScript() {
		
		 BufferedReader br =null;
		
		 System.out.print("echo -e \"Script is started \" \r\n");
		 System.out.print("echo -e \"\\n\"");
		 try{	
	           br = new BufferedReader(new FileReader("C:\\Users\\sourabh\\Desktop\\Cybage_PDM\\Failures\\Vat\\06-09_VAT.txt"));
	           String contentLine = br.readLine();
	           while (contentLine != null) {       	  
	        	  
	        	   
	        	  String failed = contentLine;
	              String[] arrOfStr = failed.split("_",4 );
	              contentLine = br.readLine();
	              
	             
	              String mid=arrOfStr[1];
	              String sid=arrOfStr[2];
	              
	              String date=arrOfStr[3];
	             
	              
	              
	        /*     if(date.charAt(5)=='8') {  
	              System.out.println("\necho -e \"=========================================================================\"");
	 	    	  System.out.print("echo -e \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mid+"/"+sid+"/"+20220701+"\"\r\n");
	 	    	  System.out.println("curl -i \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mid+"/"+sid+"/"+20220701+"\"");
	 	    	  System.out.print( "sleep 5");
	           }
	          */   
	             
	             if(date.charAt(5)=='9') {  
		              System.out.println("\necho -e \"=========================================================================\"");
		 	    	  System.out.print("echo -e \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mid+"/"+sid+"/"+"20220801"+"\"\r\n");
		 	    	  System.out.println("curl -i \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mid+"/"+sid+"/"+"20220801"+"\"");
		 	    	  System.out.print( "sleep 5");
		           }
	      	 
		 	}
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
         System.out.println("\necho -e \"=========================================================================\"");


         }}
	
