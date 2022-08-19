package Selenium;

public class LazyInitialization {
	
	
	
/*
 * We could avoid StaleElementException using POM. In POM, we use initElements() 
 * method which loads the element but it won’t initialize elements. initElements()
 *  takes latest address.
It initializes during run time when we try to perform any action on an element. 
This process is also known as Lazy Initialization.
 * 
 */

}
