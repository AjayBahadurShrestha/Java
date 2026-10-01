import java.io.BufferedReader;
import java.io.InputStreamReader;
class BufferedReader1{
	public static void main(String...args) throws Exception{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(ir);
	System.out.println("Enter 1st Number: ");
	int a= Integer.parseInt(br.readLine());
	
	System.out.println("Data is: "+a);
	
	}
}