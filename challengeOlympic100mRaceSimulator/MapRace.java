/**
 * 
 */
package challengeOlympic100mRaceSimulator;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class MapRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortedMap<Double, String> raceResults = new TreeMap<Double, String>();
		raceResults.put(9.81, "Bolt");
		raceResults.put(9.89, "Galtin");
		raceResults.put(9.91, "Degrasse");
		raceResults.put(9.94, "Simbine");
		raceResults.put(9.7, "O'Hanlon");
		raceResults.put(9.96, "Meite");
		raceResults.put(10.04, "Vicaut");
		raceResults.put(10.06, "Bromell");
		raceResults.put(13.09, "Johnson");
		raceResults.put(9.93, "Blake");
		
		System.out.println("2016 Olympic 100 meters race simulator");
		
		starterGun("ON YOUR MARKS", 2000);
		starterGun("SET", 3000);
		starterGun("GUN BANG", 0);
		System.out.println("Race underway");
		
		// set threads off
		
		for (Double d : raceResults.keySet()) {
			RacerThread rt = new RacerThread();
			rt.setRaceTime(d);
			rt.setName(raceResults.get(d));
			Thread t1 = new Thread(rt);
			t1.start();
		}

		
	}

	
	/**
	 * This prints an order to console and sets a delay after this order
	 */
	private static void starterGun(String order, long delay) {
	
		try {
			System.out.println(order);
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
