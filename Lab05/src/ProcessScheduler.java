/*
 * Written by Christopher Moyer
 */
public class ProcessScheduler {
	private LinkedListQueue processes;
	private Process currentProcess;
	
	public ProcessScheduler()
	{
		processes = new LinkedListQueue();
		currentProcess = null;
	}
	//Returns the currently running process
	public Process getCurrentProcess()
	{
		return this.currentProcess;
	}
	//Sets current process is none are running or adds it to the queue
	public void addProcess(Process aProcess)
	{
		if(currentProcess==null)
			this.currentProcess = aProcess;
		else
			processes.enqueue(aProcess);
	}
	//Dequeues from the queue and runs the process
	public void runNextProcess()
	{
		currentProcess = (Process)processes.dequeue();
	}
	//Cancels the current process and runs the next process in the queue
	public void cancelCurrentProcess()
	{
		currentProcess = null;
		runNextProcess();
	}
	public void printProcessQueue()
	{
		if(processes.peek()!=null)
			processes.print();
		else
			return;
	}
	
}
