import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aho2 {

public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("値を入力：");
	String st = br.readLine();
	int j = Integer.parseInt(st);
	
	int l = String.valueOf(j).length();

	int x = j >> l;
	
	System.out.println(j);
	System.out.println(l);
	
	System.out.println(x);
	
	System.out.println(300 >> 3);
	System.out.println(3000 >> 3);
	
	/*
	if (j >> l == 3){
		System.out.println("aaaaaaaaaaaho");
		
	}*/
	/*
	for (int i = 1; i < j; i++) {
		if (i%3==0 || Integer.toString(i).contains("3")){
			System.out.println("Aho");
		}
		else {
			System.out.println(i);
		}	
	}*/
}
}
