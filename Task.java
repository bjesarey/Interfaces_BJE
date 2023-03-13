/**
 * 
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 2
 * Semester year Spring 2023
 */
public class Task implements Comparable<Task> {
	private String Name;
	private int Priority;

	enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	
	public Task() {
		setName("Load");
		setPriority(5);
	}// end default constructor

	/**
	 * @param name
	 * @param priority
	 */
	public Task(String name, int priority) {
		Name = name;
		Priority = priority;
	}// end preferred constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return Priority;
	}// end getPriority()

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		Priority = priority;
	}// end setPriority()

	public Status getStatus() {
		return getStatus();
	}// end getStatus()

	@Override
	public String toString() {
		return "Task [Name=" + Name + ", Priority=" + Priority + "]";
	}// end toString

	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return Priority;
	}

}// end Task
