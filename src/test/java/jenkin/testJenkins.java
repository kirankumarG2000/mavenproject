package jenkin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testJenkins extends TestCase {
	public testJenkins( String testName )  
    {  
        super( testName );  
    }   
	 public static Test suite()  
	    {  
	        return new TestSuite( testJenkins.class );  
	    }  
	 public void testApp()  
	    {  
	        assertTrue( true );  
	    }  

}
