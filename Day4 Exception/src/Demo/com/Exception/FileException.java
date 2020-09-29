package Demo.com.Exception;
 
   
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;


	public class FileException {
	    FileInputStream fis;
	    public void readFile() throws IOException  
	    {
	        
	            fis=new FileInputStream("Desktop:\\Java interview questions.txt");
	            int i=0;
	            do{
	                i=fis.read();
	                System.out.print((char)i);
	            }while(i!=-1);
	        
	    }


	    public static void main(String[] args) throws IOException {
	        FileException de=new FileException();
	        try
	        {
	            de.readFile();
	        }
	        catch(IOException ae)
	        {
	            ae.printStackTrace();
	        }
	        finally {        
	            de.fis.close();
	        }
	    }


	}
	 









