/**
 * Tests the classes of Task and process and the Interface of Priority
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 2
 * Semester year Spring 2023
 */
public class PriorityApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task build=new Task();
		Process load = new Process();
		System.out.println(build.toString());
		System.out.println(load.toString());
		System.out.println(build.compareTo(build));
		System.out.println(load.compareTo(load));
	}//end Main

}//end Priority Application
