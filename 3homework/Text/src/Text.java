

public class Text extends Sentence {
	public static void main(String args[]) {
		System.out.println("Это текст");
		Sentence sn = new Sentence();
		Word c = new Sentence();
		Sentence r = new Text();
		Text t = new Text();
		Word v = new Word();
		
		
		System.out.println("Последующая писанина сравнивает объекты");
		
		if(sn.equals(c)) {
			System.out.println("True");} 
		else System.out.println("False");
		
		
		if(c.equals(r)) {
			System.out.println("+++");
		} else System.out.println("- - -");
		
		if(r.equals(t)) {
			System.out.println("Да");
		} else System.out.println("нет");
		System.out.println("Нет одинаковых!!!");
		
		sn.Sent();
		System.out.println(sn.Sent());
		
		sn.getClass();
		System.out.println(sn.getClass());
		sn.hashCode();
		System.out.println(sn.hashCode());
		
		sn.toString();
		System.out.println(sn.toString());
		
		v.Words();
		System.out.println(v.Words());
		
		
		System.out.println("Вот такая интересная инфа!");
		
		
		
      
      
	}
	
}
	