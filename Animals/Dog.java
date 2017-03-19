package Animals;
public class Dog extends Animal{
	
	@Override
	String eat(String food) {
		System.out.println(food);
		return food;
	}
}
