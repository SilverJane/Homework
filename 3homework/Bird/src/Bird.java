
public class Bird extends Wheengs {
	public void atack () {
		System.out.println("¿“¿ÿ≈À!");
	}
	public static void main (String args[]) {
		Beak bk = new Beak();
		Wheengs wh = new Wheengs();
		Bird bd = new Bird();
		
		bk.eat();
		System.out.println();
		wh.eat();
		wh.fly();
		wh.seat();
		System.out.println();
		bd.atack();
		bd.eat();
		bd.fly();
		bd.seat();
	}

}
