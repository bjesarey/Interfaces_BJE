/**
 * 
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 2
 * Semester year Spring 2023
 */
public class Process implements Priority, Comparable<Process> {
	private String ProcessID;
	private int Priority;
	
	public Process() {
		setProcessID("");
		setPriority(10);
	}// end default constructor
	
	/**
	 * @param processID
	 * @param priority
	 */
	public Process(String processID, int priority) {
		ProcessID = processID;
		Priority = priority;
	}


	/**
	 * @return the processID
	 */
	public String getProcessID() {
		return ProcessID;
	}

	/**
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) {
		ProcessID = processID;
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return Priority;
	}
	
	@Override
	public void setPriority(int p) {
		// TODO Auto-generated method stub
		Priority = p;
	}

	@Override
	public int compareTo(Process p) {
		return Priority;
		// TODO Auto-generated method stub
/*		if(getPriority() == 1) {
			return 1;
		}
		if(getPriority( )== 5) {
			return 5;
		}
		if(getPriority()==10) {
			return 10;
		}*/
	}//end compareTo()

	@Override
	public String toString() {
		return "Process [ProcessID=" + ProcessID + ", Priority=" + Priority + "]";
	}// end toString()

}// end Process
