

public class Text extends Sentence {
	public static void main(String args[]) {
		System.out.println("��� �����");
		Sentence sn = new Sentence();
		Word c = new Sentence();
		Sentence r = new Text();
		Text t = new Text();
		Word v = new Word();
		
		
		System.out.println("����������� �������� ���������� �������");
		
		if(sn.equals(c)) {
			System.out.println("True");} 
		else System.out.println("False");
		
		
		if(c.equals(r)) {
			System.out.println("+++");
		} else System.out.println("- - -");
		
		if(r.equals(t)) {
			System.out.println("��");
		} else System.out.println("���");
		System.out.println("��� ����������!!!");
		
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
		
		
		System.out.println("��� ����� ���������� ����!");
		
		
		
      
      
	}
	
}
	