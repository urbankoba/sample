package Animals;
public class Cat extends Animal{

	@Override
	String eat(String food) {
		System.out.println(food);
		return food;
	}
}
