import java.io.*;
public class InputStream {
	public static void main(String[] args) throws IOException{
		FileReader freader = new FileReader("C:/akki/data.txt");
		BufferedReader br = new BufferedReader(freader);
		String s;
		while((s = br.readLine()) != null) {
		System.out.println(s);
		}
		freader.close();
	}
}
