package Animals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main (String[] args) throws IOException {
	Dog dog = new Dog();
	dog.eat("ドッグフードを");

	Cat cat = new Cat();
	cat.eat("キャットフードを");
	}
}
