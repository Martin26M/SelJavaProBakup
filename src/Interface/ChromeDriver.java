package Interface;

public class ChromeDriver   implements WebDriverInterface, Parent1  {// Here the child class extends non abstract class TestCase and 
                                                                               //implements the interface  WebDriverInterface & Parent1 and  hence multiple inheritence is being done
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

@Override
public void parrentmethod1() {
	// TODO Auto-generated method stub
	System.out.println("hi");
}

@Override
public void click() {
	// TODO Auto-generated method stub
	
}

@Override
public void sendkeys() {
	// TODO Auto-generated method stub
	
}

@Override
public void gettitles() {
	// TODO Auto-generated method stub
	
}

}
