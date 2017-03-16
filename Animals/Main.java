package Animals;
import java.io.IOException;

public class Main {

public static void main (String[] args) throws IOException {
	Dog dog = new Dog();
	dog.eat("ドッグフードを");

	Cat cat = new Cat();
	cat.eat("キャットフードを");
	}
}
