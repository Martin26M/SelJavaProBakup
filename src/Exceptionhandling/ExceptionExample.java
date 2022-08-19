package Exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args)throws ArithmeticException {{// The exception thrown by sum method 
		// TODO Auto-generated method stub

		// Usage of throws keyword , this we can use when we are using Method chaining 
		// What is checked(compile time like file not found) and unchecked(run time like arithmetic or array index out of bound) exception 
		
		ExceptionExample e= new ExceptionExample();
		e.sum();
		System.out.println("Test");// Here the program is getting terminated even though exception is thrown this can be handles by using try catch for div()
	}
	}

	public void sum() throws ArithmeticException {// The exception thrown by div method 
		div();
		
	}
	
	/*
	 * 
	 * try{
	 * 
	 * div();
	 * }
	 * catch (ArithmeticException e){
	 * 
	 * syso("This is created to handle the exception as throws does not handle the exception")
	 * }
	 * 
	 * 
	 * 
	 */
public void div() throws ArithmeticException 
{//We use this instead of try catch , as for try catch we have to use many lines 
		
		int i = 9/0;
		
	}
}	
	
	// Note : We can use throwable directly in place of Arithmetic or any other exceptions as Error class and Exception class extends the throwable class it can 
// handle both error and exception
	/*
	 * /*
	 * 
	 * try{
	 * 
	 * div();
	 * }
	 * catch (Throwable){
	 * 
	 * syso("Handled by using throwable as we cant remember all the excpetions like ArithmeticException e ")
	 * }
	 * 
	 * 
	 * 
	 */
	 * 
	 */
	 // checked and unchecked exceptions
	 //Class cast exception
}
