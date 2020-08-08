package com.vastika.jdbc_demo;

public class NOTES {
	
	/*MAVEN Project Naming Convention: 
	 * 1) groupId : domainname.companyname.
	 * 2) artifactId: ProjectName.
	 *
	 */
	
	//NOTE: quickstart: to create a simple JAVA project.
	//later we select web  for the applications.
	
	//NOTE: in the pom.xml file:
	/* this below gets created by default:
	 * dependencies : are the libraries. from jdbc, we use the 3rd party library.
	 
	 <dependencies>
	    <dependency>
	      <groupId>junit</groupId>
	      <artifactId>junit</artifactId>
	      <version>4.11</version>
	      <scope>test</scope>
	    </dependency>
	  </dependencies>
	  
	  */
	
	
	
	//for our version, we have to go to:
	/* google -> mysql maven dependency -> then pick according to your workbench version.
	 * copy paste: in the above portion:
	 * 
	 * <dependencies>
	 // we can just remove this (https:) next line.
             <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
	        <dependency>
                   <groupId>mysql</groupId>
                   <artifactId>mysql-connector-java</artifactId>
                   <version>8.0.16</version>
	         </dependency>
       </dependencies>
	 * 
	 */
	
	
	// This was the default properties that came up:
	/* <properties>
             <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
             <maven.compiler.source>1.7</maven.compiler.source>
             <maven.compiler.target>1.7</maven.compiler.target>
     </properties>
	 * 
	 */

	
}
