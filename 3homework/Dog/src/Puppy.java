
public class Puppy extends Dog {
	public static void main(String args[]) {
		String str = "Шарик";
		System.out.println("Меня зовут " + str);
		
		Animal an = new Animal();
		Dog dg = new Dog();
		Puppy pp = new Puppy();
		
		   an.Running();  pp.Byte();  pp.Voice();
		dg.Jumping();
		dg.Running();
		
	}

}
