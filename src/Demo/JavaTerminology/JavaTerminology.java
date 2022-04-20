package Demo.JavaTerminology;

public class JavaTerminology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Java Terminology

//1. JDK (Java Development Kit): is a Kit that provides the environment to develop and execute(run) the Java program.
//JDK is a kit(or package) that includes two things.
//Development Tools(to provide an environment to develop your java programs).

//2. JRE (Java Runtime Environment): is an installation package that provides an environment to only run(not develop) the java program(or application)onto your machine. 
//JRE is only used by those who only want to run Java programs that are end-users of your system.

//3. JVM (Java Virtual Machine): is a very important part of both JDK and JRE because it is contained or inbuilt in both.
//Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line,
//hence it is also known as an interpreter.

//Types of Java Applications:

//	1) Standalone Application:
	//	Standalone applications are also known as desktop applications or window-based applications.
//	These are traditional software that we need to install on every machine.

//	2) Web Application:
	//An application that runs on the server side and creates a dynamic page is called a web application.

//	3) Enterprise Application:
	
/*An application that is distributed in nature, such as banking applications, etc. is called an enterprise application.
It has advantages like high-level security, load balancing, and clustering.
In Java, EJB is used for creating enterprise applications*/

//	4) Mobile Application:	
//	An application which is created for mobile devices is called a mobile application.
//Currently, Android and Java ME are used for creating mobile applications.

//What happens at compile time?
//At compile time, the Java file is compiled by Java Compiler (It does not interact with OS) and converts the Java code into bytecode.
//What happens at compile time?
	
//At compile time, the Java file is compiled by Java Compiler (It does not interact with OS) and converts the Java code into bytecode.

//What happens at runtime?
	
//At runtime, the following steps are performed:

//Clasfile-> ClassLoader->ByteCode Verified -> Interpreter -> RunTime-> Hardware

//Classloader: It is the subsystem of JVM that is used to load class files.

//Bytecode Verifier: Checks the code fragments for illegal code that can violate access rights to objects.

//Interpreter: Read bytecode stream then execute the instructions.