/**
 * 
 */
package challengeOlympic100mRaceSimulator;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class RacerThread implements Runnable {

	private Double RaceTime;
	private String name;

	@Override
	public void run() {

		try {
			Double timeInMillisecs = this.RaceTime * 1000;
			long timeMillisecs = timeInMillisecs.longValue();
			Thread.sleep(timeMillisecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(this.name + " finished at " + this.RaceTime);

	}

	// Getters and Setters

	/**
	 * @return the raceTime
	 */
	public Double getRaceTime() {
		return RaceTime;
	}

	/**
	 * @param raceTime the raceTime to set
	 */
	public void setRaceTime(Double raceTime) {
		RaceTime = raceTime;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
