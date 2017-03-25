import java.io.IOException;

public class Bubble_sort {
public static void main (String[] args) throws IOException {
	int [] a = new int [] {2, 3, 5, 7, 1, 3, 7, 9, 3, 9, 1, 7, 1, 3, 7, 3, 9, 1, 7, 1, 3, 9, 3, 9, 7, 1, 3, 7, 9, 3};
	
	for (int n=0; n<a.length-1; n++) {
		for (int i=a.length-1; i>0; i--) {
			for (int j=i-1; j>i-2; j--){
				if (a[i] < a[j]){
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		for (int m=0; m<a.length; m++){
			System.out.print(a[m]  + ", ");
		}
			System.out.println("");
			System.out.println("-----------------------------------");
	}
}
}