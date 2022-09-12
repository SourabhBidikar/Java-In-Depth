/*This is code for multiple MIDS for single SID
 * 
 */
package com.fundamentals;
import java.util.*;

public class VatScriptRegeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sid="3090505";
		String date="20220401";
		//System.out.print("echo -e \"Script is started \" \r\n");
		//System.out.println("echo -e \"\\n\"");
		ArrayList<Integer> mids = new ArrayList<Integer>(
	            Arrays.asList(
	            		39197,
	            		47625,
	            		42904,
	            		43251,
	            		44522,
	            		45220,
	            		45529,
	            		45972,
	            		46453,
	            		46717,
	            		46718



));
	  
	      for(int i=0;i<mids.size();i++) {
	        
	    	  System.out.println("\necho -e \"=========================================================================\"");
	    	  System.out.print("echo -e \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mids.get(i)+"/"+sid+"/"+date+"\"\r\n");
	    	  System.out.println("curl -i \"http://ipg.private.linksynergy.com:8080/ipg/vat/"+mids.get(i)+"/"+sid+"/"+date+"\"");
	    	  System.out.print("echo -e \"\\n\"\r\n");
	    	  System.out.print( "sleep 5");
	      }
	     //System.out.println("\necho -e \"=========================================================================\"");
    	 
	}

}
