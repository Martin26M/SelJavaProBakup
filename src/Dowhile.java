import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dowhile {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		int i =10;
		
		Class d = Class.forName("Dowhile");
		
		Dowhile inst = (Dowhile) d.newInstance();
	
		
		 LocalDateTime now = LocalDateTime.now();  
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String time = now.format(format);
			System.out.println(time);
			
		Class classname  =	Creditcardnew.class;
		String name = classname.getName();
		System.out.println(name);
		
		int modifiers = classname.getModifiers();
		System.out.println(modifiers);
	}

}
