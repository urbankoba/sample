import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aho {

public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("値を入力：");
	String st = br.readLine();
	int j = Integer.parseInt(st);

	for (int i = 1; i < j; i++) {
		if (i%3==0 || Integer.toString(i).contains("3")){
			System.out.println("Aho");
		}
		else {
			System.out.println(i);
		}	
	}
}
}
