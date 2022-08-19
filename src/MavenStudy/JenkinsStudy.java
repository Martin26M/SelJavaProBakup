package MavenStudy;

public class JenkinsStudy {
	
	/*
	 * 
	 * 
	 * 1.Download jenkins war
	 * 2. Then use java -jar jenkins.war -httpPort=8080 at the war file location
	 * 3.OPen jenkins url >> go to > Global Too configuration >> Add JDK Path
	 * >> Now go to Maven >>Maven Installations Give the path of  Maven system variable 
	 * 
	 * 
	 * Now creating the JOb >> NEw ITem >> JOb NAme >> Select Freestyle Project  Now we have to add the Source code of the project wither from GitHUB o
	 * SVN now in our case we will use Local Path >> Use custom workspace >> Place the project in Jenkins folder Now give the Directory in Jenkins as 
	 * 
	 * Go to the JOB configuration 
	 * ${JENKINS_HOME}/Folder Name of the Project
	 * 
	 * Now go to Build >> Invoke Top Level Maven targets >> Select the MAven drop down and the goal as (mvn test )
	 *
	 * Now go to The Jenkin JOb and click non Build >> and see the reports
	 * 
	 * 
	 * NOw to add TestNG to Jenkins >> Go to MAnage Jenkins>> <Manage Plugins and install TestNG from the search
	 * 
	 * Now go to Jenkin JOb Configuration >> Click on Post Build Actions>> Select Publish TestNG Results >> Save 
	 * 
	 * 
	 * 
	 */

}
