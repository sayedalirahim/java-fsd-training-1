import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class programmmm30 {

	public static void main(String[] args) {
		
		FileWriter fw = new FileWriter("D:OutBufferfile.txt");
		BufferedWriter bw  = new BufferedWriter(fw);
		
		bw.write("Twinkle twinkle litte star");
		bw.close();
		
		System.out.println("file written done");
		
		FileReader fr = new FileReader("D:OutBufferfile.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("file reading.....");
		
		System.out.println();
		
		int i =0;
		
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		br.close();

	}

}
