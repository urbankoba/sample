import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aho3 {

public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("値を入力：");
	String st = br.readLine();
	int j = Integer.parseInt(st);
	
	
	for (int i=1; i<=j; i++) {
		
		//iをString型に変換
			String n = String.valueOf(i);
		//iの桁数をカウント
			int l = n.length();
		//10を入力ケタ数分、累乗
			double m = Math.pow(10, l) / 10;
		//小数を外し、int型へ変換
			int s = (int)m;
		int t = 0;
			
		for (int u=0; u<l; u++){
		//iを割る(1000,100,10...)	
			t = i/s;
		}
				
		if (i%3==0 || t==3){
			System.out.println("Aho");
		}
		else {
			System.out.println(i);
		}
	}
}
}