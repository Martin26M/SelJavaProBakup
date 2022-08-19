package MavenStudy;

public class MavenClass {
	
	
	/*
	 * check this url
	 * https://jadala-ajay16.medium.com/running-tests-from-command-line-different-options-427a5dadd224
	 * 
	 * Suite XML file config to be added under the Sure Fire Plugin to run the test from testng XML rather than from pom xml where it runs at the
	 * project level
	 * POM xml we add all the plugin with groupID and Artefasct ID to download all the JARS
	 * Like Selenium,TestNG , etc.
	 * 
	 * Test Name should end with the Prefix as Test for Maven to pick the Test cases from the project
	 * 
	 * Profiling to choose a partiuclar Tesng XML of we have multiple TestNG's
	 * 
	 * Ex:
	 * 
	 * <profiles>
	 * <profile>
	 * <id>Regression</id>
	 * <build>
	 * 
	 * "Paste the configuration of Suite XML for testng.xml"
	 * 
	 * </build>
	 * * </profile>
	 * 
	 * <profile>
	 * <id>Smoke</id>
	 * <build>
	 * 
	 * "Paste the configuration of Suite XML for testng2.xml"
	 * 
	 * </build>
	 * * </profile>
	 * </profiles>
	 * 
	 * 
	 * Now we can call this testng like >>>>> mvn  test -PRegression
	 * 
	 * 
	 * To execute the war files we use java -jar jenkins.war -httpPort=8080
	 * 
	 * 
	 * 
	 */

}
