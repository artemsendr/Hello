import java.io.*;


public class helloWorldJ {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

	    	BufferedReader buf  = new 
		BufferedReader(new InputStreamReader(System.in));
	    	String cStr;
	    	cStr=buf.readLine();
	    
	    	
	    	int iNum = Integer.parseInt(cStr);
		System.out.println("Hello world! "+ iNum);
	}

}
