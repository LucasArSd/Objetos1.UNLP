package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFO extends JobScheduler{

	public JobDescription next() {
		 JobDescription nextJob = jobs.get(0);
         this.unschedule(nextJob);
         return nextJob;
	}
}