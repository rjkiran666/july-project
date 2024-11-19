package junitpkg;

import java.net.HttpURLConnection;
import java.net.URI;

import org.junit.Test;

public class Responsecode1 {
       String link="https://www.google.com";
       @Test
       public void test()throws Exception
       {
    	   URI ob= new URI(link);
    	   HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
    	   int code=con.getResponseCode();
    	   System.out.println("respopnse code="+code);
       }
}
