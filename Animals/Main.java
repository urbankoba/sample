package Animals;
import java.io.IOException;

public class Main {

public static void main (String[] args) throws IOException {
	Dog dog = new Dog();
	dog.eat("ドッグフードを食べます");

	Cat cat = new Cat();
	cat.eat("キャットフードを食べます");
	}
}
